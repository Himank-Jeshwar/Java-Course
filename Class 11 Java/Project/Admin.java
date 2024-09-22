import java.util.*;
import java.io.*;
class Admin{
    static String barcodes[];
    static int user_movies[],user_timings[];
    static String user_seats[];
    static int availableSeats[][][];
    static String user_names[];
    static int movies,timings,userCount,tickets_No,moviesOnShow; 
    static int registeredUsers;

    public Admin()throws IOException{
        movies = 30;
        moviesOnShow = findNumberofShows(); // find currently running movies
        timings = 3;
        userCount = 0;
        registeredUsers = 0;
        tickets_No = 1; 
        int seatNum = 0;
        
        availableSeats = new int[movies][timings][100];
        barcodes = new String[availableSeats.length];
        user_seats = new String[availableSeats.length];
        user_movies = new int[availableSeats.length];
        user_timings = new int [availableSeats.length];
        user_names = new String[availableSeats.length];

        for (int i = 0;i<movies;i++){
            for (int j = 0;j<timings;j++){
                seatNum = 0;
                for(int k = 0;k<100;k++){
                    availableSeats[i][j][k] = ++seatNum;
                }
            }
        }
    }

    private int findNumberofShows()throws IOException{
        File movieFile = new File("movies.txt");
        Scanner read = new Scanner(movieFile);

        int i = 0;
        while (read.hasNextLine()){
            read.nextLine();
            i++;
        }
        
        return i;
    }

    void login()throws IOException,InterruptedException{
        String username;
        int pin;
        boolean isFound = false;
        File adFile = new File("admins.txt");
        Scanner read = new Scanner(adFile);
        String line = "";
        User user = new User();
        storeUserNames(); // storing all user names in the database

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter username : ");
        username = sc.next().trim();
        System.out.print("Enter pin : ");
        pin = sc.nextInt();

        while(read.hasNextLine()){
            line = read.nextLine().trim();
            
            if (line.substring(0,line.indexOf('-')).equals(username)){
                if (Integer.parseInt(line.substring(line.indexOf('-')+1))==pin){
                    isFound = true;
                    break;
                }
            }
        }

        int ch;
        if (isFound==true){
            while(true){
                Menu.adminMenu();
                ch = sc.nextInt();

                switch(ch){
                    case 1:
                        showAllAdmins();
                        break;

                    case 2:
                        addAdmin();
                        break;

                    case 3:
                        removeAdmin();
                        break;

                    case 4:
                        System.out.print("Enter your username : ");
                        username = sc.next();
                        addUser(username);
                        break;
                    
                    case 5:
                        removeUser();
                        break;
                    case 6:
                        showAllUsers();
                        break;
                    case 7:
                        user.showMovies();
                        break;

                    case 8:
                        user.book(1);
                        break;

                    case 9:
                        user.cancelTicket(1);
                        break;
                    case 10:
                        changeTimings();
                        break;

                    case 11:
                        addMovies();
                        break;

                    case 12:
                        deleteMovies();
                        break;

                    case 13:
                        return;

                    default:
                        System.out.println("INVALID INPUT !\n");
                }
            }
        }
        else 
            System.out.println("User Not Found !");
    }
    
    private void showAllAdmins()throws IOException{
        File adFile = new File("admins.txt");
        Scanner sc = new Scanner (adFile);
        String line;
        
        System.out.println("LIST OF ADMINS ARE : - \n");
        while(sc.hasNextLine()){
            line = sc.nextLine();
            System.out.println(line.substring(0,line.indexOf('-')));
        }
    } 
    void storeUserNames()throws IOException{
        File uNamesFile = new File("users.txt");
        Scanner read = new Scanner (uNamesFile);
        String line = "",uname="";
        while (read.hasNextLine()){
            line = read.nextLine();
            uname = line.substring(0,line.indexOf('-'));
            Admin.user_names[Admin.registeredUsers++] = uname;
        }
    }

    private String findTime(int movieNum,int oldTimeNo)throws IOException{
        Scanner sc = new Scanner (System.in);
        File timingFile = new File("timings.txt");
        Scanner file = new Scanner (timingFile);
        String line="",oldtime="",timestamp = "";
        int p = 1;
        
        while(file.hasNextLine()){
            line = file.nextLine()+"#";
            if (p==movieNum)
                break;
            p++;
        }

        int q = 1;
        for (int i = 0;i<line.length();i++){
            if (line.charAt(i)=='#'){
                if (q==oldTimeNo){
                    oldtime = timestamp;
                    break;
                }
                timestamp = "";
                q++;
            }
            else
                timestamp+=line.charAt(i);
        }
        return oldtime;
    }
    private void changeTimings()throws IOException{
        User user = new User();
        Scanner sc = new Scanner (System.in);
        File timingFile = new File("timings.txt");
        Scanner file = new Scanner (timingFile);
        String line="",contents="";

        user.showMovies();
        System.out.print("Enter a movie number : ");
        int movieNum = sc.nextInt();

        user.showTimings(movieNum);

        System.out.println("Select a time slot : ");
        int oldtimeNo = sc.nextInt();
        sc.nextLine();

        int p = 1;
        String oldtime = "";
        String timestamp="",newLine = "";

        System.out.println("Enter new timings : ");
        String newTime = sc.nextLine();

        p = 1;
        oldtime = findTime(movieNum, oldtimeNo);
        timestamp="";
        newLine = "";

        while(file.hasNextLine()){
            line = file.nextLine();
            if (p==movieNum){
                for (int i = 0;i<line.length();i++){
                    if (line.charAt(i)=='#'){
                        if (timestamp.equals(oldtime))
                            newLine+=newTime+'#';
                        else
                            newLine+=timestamp+'#';
                        timestamp = "";
                    }
                    else
                        timestamp+=line.charAt(i);
                }
                contents+=newLine+"\n";
            }
            else{
                contents+=line+"\n";
            }
            p++;
        }
        
        FileWriter writer = new FileWriter("timings.txt");
        writer.write(contents); // restoring previous contents
        writer.close();

        System.out.println("New Timings are : -");
        user.showTimings(movieNum);

    }
    private void showAllUsers(){
        System.out.println("LIST OF ALL USERS :- \n");
        for (int i = 0;i<Admin.registeredUsers;i++)
            System.out.println(Admin.user_names[i]);
    }

    private void deleteMovies()throws IOException{
        File movieFile = new File("movies.txt");
        int movieNo;
        String contents="",line = "",newContents = "";
        Scanner read = new Scanner(movieFile);
        Scanner sc = new Scanner(System.in);
        String movieName = "";

        System.out.print("Enter a movie number : ");
        movieNo = sc.nextInt();

        int p = 1;
        while(read.hasNextLine()){
            line = read.nextLine();
            
            if(p!=movieNo)
                contents+=line+"\n"; 
            else
                movieName = line.substring(line.indexOf(' ')+1);
            p++;
        }

        int s_No = 1;
        line = ""; // re-initialize
        for (int i = 0;i<contents.length();i++){
            if (contents.charAt(i)=='\n'){
                newContents+=s_No+" "+line.substring(line.indexOf(' ')+1)+"\n";
                line = "";
                s_No++;
            }
            else 
                line += contents.charAt(i);
        }   
        Admin.moviesOnShow--;

        System.out.println(movieName+" has been removed from the list !");
        FileWriter writer = new FileWriter("movies.txt");
        writer.write(newContents);
        writer.close();

    }
    private void addMovies()throws IOException{
        File movieFile = new File("movies.txt");
        String movieName;
        Scanner read = new Scanner(movieFile);
        Scanner sc = new Scanner(System.in);
        String contents = "";

        System.out.print("Enter a movie name : ");
        movieName = sc.nextLine();

        while (read.hasNextLine()){
            contents+=read.nextLine()+"\n";
        }

        Admin.moviesOnShow++;
        contents+=Admin.moviesOnShow+" "+movieName;

        System.out.println(movieName+" has been added to the list !");
        FileWriter writer = new FileWriter("movies.txt");
        writer.write(contents);
        writer.close();
    }
    private void removeAdmin()throws IOException{
        File adFile = new File("admins.txt");
        Scanner read = new Scanner(adFile);
        Scanner sc = new Scanner(System.in);
        String username,contents="",newContents="";
        String line = "";
        boolean isFound = false;

        System.out.print("Enter user name to remove :");
        username = sc.next();

        // reading contents of file
        while (read.hasNextLine()){
            contents+=read.nextLine()+"\n";
        }
        
        for (int i = 0;i<contents.length();i++){
            if (contents.charAt(i)=='\n'){
                if (line.substring(0, line.indexOf('-')).equals(username)){
                    newContents+="";
                    isFound = true;
                }
                else
                    newContents+=line+"\n";
                // System.out.println(line);
                line="";
            }
            else 
                line+=contents.charAt(i);
            
        }
        
        if (isFound==false)
            System.out.println("USERNAME NOT FOUND !");
        else
        System.out.println(username+" has been removed !");
            // System.out.println(newContents);

        FileWriter writer = new FileWriter("admins.txt");
        writer.write(newContents);
        writer.close();
    }
        
    private void addAdmin()throws IOException{ 
        File adFile = new File("admins.txt");
        Scanner read = new Scanner(adFile);
        Scanner sc = new Scanner(System.in);
        String username,contents="";
        String line = "";

        int u_pin,pin;
        System.out.print("Enter user name :");
        username = sc.next();

        System.out.print("Enter a pin to create : ");
        u_pin = sc.nextInt();
        System.out.print("Enter the pin again to confirm : ");
        pin = sc.nextInt();

        // reading contents of file
        while (read.hasNextLine()){
            line = read.nextLine();
            contents+=line+"\n";

            if (line.substring(0,line.indexOf('-')).equals(username)){
                System.out.println("USERNAME ALREADY EXISTS !"); 
                return;
            }
        }

        FileWriter writer = new FileWriter("admins.txt");
        writer.write(contents); // restoring previous contents

        if (u_pin!=pin)
            System.out.print("PIN DOES NOT MATCH !");
        else{
            // System.out.print(contents);
            writer.write(username+"-"+pin+"\n");
            System.out.println(username+" has been added !");
        }
        
        writer.close();
    }

    static int addUser(String username)throws IOException{
        File adFile = new File("users.txt");
        Scanner read = new Scanner(adFile);
        Scanner sc = new Scanner(System.in);
        String contents="";
        String line = "";

        int u_pin,pin;

        // reading contents of file
        while (read.hasNextLine()){
            line = read.nextLine();
            contents+=line+"\n";

            if (line.substring(0,line.indexOf('-')).equals(username)) 
                return 0;
            
        }

        System.out.print("Enter a pin to create : ");
        u_pin = sc.nextInt();
        System.out.print("Enter the pin again to confirm : ");
        pin = sc.nextInt();

        FileWriter writer = new FileWriter("users.txt");
        writer.write(contents); // restoring previous contents

        if (u_pin!=pin)
            System.out.println("PIN DOES NOT MATCH !\n");
        else{
            // System.out.print(contents);
            writer.write(username+"-"+pin+"\n");
            System.out.println("THE NEW USERNAME IS : "+username+"\n");
            System.out.println(username+" has been added !");
            Admin.user_names[Admin.registeredUsers++] = username; // adding a user
        }
        
        writer.close();
        return 1;
    }
    private void removeUser()throws IOException{
        File adFile = new File("users.txt");
        Scanner read = new Scanner(adFile);
        Scanner sc = new Scanner(System.in);
        String username,contents="",newContents="";
        String line = "";
        boolean isFound = false;

        System.out.print("Enter user name to remove :");
        username = sc.next();

        // reading contents of file
        while (read.hasNextLine()){
            contents+=read.nextLine()+"\n";
        }
        
        for (int i = 0;i<contents.length();i++){
            if (contents.charAt(i)=='\n'){
                if (line.substring(0, line.indexOf('-')).equals(username)){
                    newContents+="";
                    isFound = true;
                }
                else
                    newContents+=line+"\n";
                // System.out.println(line);
                line="";
            }
            else 
                line+=contents.charAt(i);
            
        }
        
        if (isFound==true){
            int ind = 0;
            for (int i = 0;i<Admin.user_names.length;i++){
                if (username.equals(Admin.user_names[i])){
                    ind = i;
                    break;
                }
            }

            // deletion
            for (int i = ind; i < user_names.length-1; i++) {
                user_names[i] = user_names[i + 1];
            }
            Admin.registeredUsers--;
            System.out.println(username+" has been removed !");
        }
        if (isFound==false)
            System.out.println("USERNAME NOT FOUND !");
        // System.out.println(newContents);

        FileWriter writer = new FileWriter("users.txt");
        writer.write(newContents);
        writer.close();
    }
}