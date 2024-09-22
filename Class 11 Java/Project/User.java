import java.util.*;
import java.io.*;

// package Project;

class User {
    String username;

    void login()throws IOException,InterruptedException{
        Scanner sc = new Scanner(System.in);
        int choice ;
        int pin;
        File userFile = new File("users.txt");
        Scanner read = new Scanner(userFile);
        String line ;
        boolean isFound = false;
        Admin admin = new Admin();
        admin.storeUserNames(); // storing all user names in the database

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
        if (isFound==true){
            while (true){
                Menu.userMenu();
                choice = sc.nextInt();

                switch(choice){
                    case 1:
                        showMovies();
                        break;
                    case 2:
                        book(0);
                        break;
                    case 3:
                        cancelTicket(0);
                        break;
                    case 4:
                        return;

                    default :
                        System.out.println("INVALID INPUT");
                }
            }
        }
        else{
            System.out.println("Username not registered !");
            System.out.print("Would you like to create an account ? (y/n)");
            char ch = sc.next().charAt(0);

            if (ch=='y')
                signUp();
        }

    }

    void signUp()throws IOException{
        String f,l;
        int i = 1;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter email address/ phone number : ");
        sc.next();
        System.out.print("Enter your first name : ");
        f = sc.next();
        System.out.print("Enter your last name : ");
        l = sc.next();

        int status;
        do{
            username = f+l+'@'+i;
            status = Admin.addUser(username);
            i++;
        }while(status!=1);

        Admin.user_names[Admin.registeredUsers++]=username;
    }
    void showMovies()throws IOException{
        File movies = new File("movies.txt");
        Scanner file = new Scanner(movies);

        while (file.hasNextLine()){
            String line = file.nextLine();
            System.out.println(line);
        }
        file.close();
    }

    void showTimings(int ch)throws IOException{
        String line="",time="";
        int k;
        File movies = new File("timings.txt");
        Scanner file = new Scanner(movies);

        k = 1;
        while (file.hasNextLine()){
            line = file.nextLine();

            if (k==ch)
                break;
            k++;
        }
        
        k = 0; // loop counter
        for (int i = 0;i<line.length();i++){
            if (line.charAt(i)=='#'){
                System.out.println(time+" - "+"("+(++k)+")");
                time="";
            }
            else
                time+=line.charAt(i);
        }
        file.close();
    }
    void book(int access)throws IOException,InterruptedException{
        int movieNum,seat,timing=0;
        String movieName = "",movieTime="";
        String bookedSeats = "";

        int recliner = 0,prime = 0,classic = 0;
        String line="",line1 = "";
        Scanner sc = new Scanner(System.in);

        File movieFile = new File("movies.txt");
        Scanner file = new Scanner(movieFile);
        File timingFile = new File("timings.txt");
        Scanner file1 = new Scanner (timingFile);

        System.out.print("Enter the movie number : ");
        movieNum = sc.nextInt();

        // readFile
        int p = 1; // initialize
        while (file.hasNextLine()){
            line = file.nextLine();
            
            if (p==movieNum)
                break;

            p++;
        }

        p = 1; // re-initialize
        while(file1.hasNextLine()){
            line1 = file1.nextLine();
            
            if (p==movieNum)
                break;
            p++;
        }
        movieName = line.substring(line.indexOf(' ')+1);
        line1 = line1+'#';

        System.out.println("Movie Name - "+movieName);
        showTimings(movieNum);

        System.out.println("Select a time slot : ");
        timing = sc.nextInt();

        int q = 1;
        for (int i = 0;i<line1.length();i++){
            if (line1.charAt(i)=='#'){
                if (timing==q)
                    break;
                movieTime="";
                q++;
            }
            else
                movieTime+=line1.charAt(i);
        }

        showSeats(movieNum, timing);
        char flag='y';

        if (access==0){
            // for general public 
            do{
                System.out.println("Enter seat number to book : ");
                seat = sc.nextInt();

                if(Admin.availableSeats[movieNum-1][timing-1][seat-1]==-1){
                    System.out.println("THIS SEAT IS ALREADY BOOKED !");
                }
                else if (Admin.availableSeats[movieNum-1][timing-1][seat-1]==-2){
                    System.out.println("SEAT ALREADY SELECTED !");
                }
                else if (Admin.availableSeats[movieNum-1][timing-1][seat-1]==-3){
                    System.out.println("SEAT RESERVED !");
                }
                else{
                    if (seat<=10)
                        recliner++;
                    else 
                        if (seat<=20)
                            prime++;
                        else
                            classic++;
                    
                    bookedSeats+=Admin.availableSeats[movieNum-1][timing-1][seat-1]+" ";
                    Admin.availableSeats[movieNum-1][timing-1][seat-1] = -2; // mark as unconfirmed
                }
                showSeats(movieNum, timing);
                
                System.out.print("Would you like to continue booking seats (y/n)");
                flag = sc.next().toLowerCase().charAt(0);

            }while (flag=='y'); 
    
            if (recliner==0 && prime==0 && classic==0) // no seats selected
                return;

            System.out.println("Press y to pay : ");
            char pay = sc.next().toLowerCase().charAt(0);

            if (pay=='y'){
                for (int i = 0;i<Admin.movies;i++){
                    for (int j = 0;j<Admin.timings;j++){
                        for (int k = 0;k<100;k++){
                            if (Admin.availableSeats[i][j][k]==-2){
                                Admin.availableSeats[i][j][k]=-1; // mark as confirmed
                            }
                        }
                    }
                }
                makePayment(movieName,movieTime,bookedSeats,movieNum,timing,recliner,prime,classic);
            }
            else {
                bookedSeats = "";
                for (int i = 0;i<Admin.movies;i++){
                    for (int j = 0;j<Admin.timings;j++)
                        for (int k = 0;k<100;k++){
                            if (Admin.availableSeats[i][j][k]==-2)
                                Admin.availableSeats[i][j][k]=k+1; // restore all seats
                        }
                }
            }
        }

        else {
            // for admin
            Menu.adminBookMenu();
            int choice = sc.nextInt();
            char ch;
            
            if (choice==1){
                do{
                    System.out.print("Enter a seat number : ");
                    int seatNo = sc.nextInt();

                    Admin.availableSeats[movieNum-1][timing-1][seatNo-1]=-3; // mark as reserved seat

                    System.out.print("Would you like to continue ?");
                    ch = sc.next().charAt(0);
                }while(ch=='y');
            }

            else if (choice==2){
                showSeats(movieNum,timing);
                System.out.println("Press y to book all seats");
                ch=sc.next().charAt(0);
                
                if (ch=='y'){
                    for (int i = 1;i<=100;i++){
                        Admin.availableSeats[movieNum-1][timing-1][i-1] = -3; // mark as reserved
                    
                    }
                    showSeats(movieNum, timing);
                    System.out.println("ALL SEATS ARE BOOKED SUCCESSFULLY !");
                }
            }
            else
                System.out.println("INVALID INPUT !");

        }
        showSeats(movieNum, timing);
        // file.close();
        // file1.close();
        // sc.close();
    }
    String generateBarcode(){
        String id = "";        
        for (int i = 0;i<8;i++){
            int ch = (int)(Math.random()*(90-65)+65);
            id+=(char)(ch);
        }
        return id;
    }

    void makePayment(String movieName,String movieTime,String bookedSeats,int movieNum,int timing,int recliner,int prime,int classic) throws InterruptedException,IOException{
        double bill = recliner*350+prime*250+classic*150;
        double tax = 18*bill/100.0,net = bill + tax;

        Scanner sc = new Scanner(System.in);
        
        File file = new File("ticket"+Admin.tickets_No+".txt");
        file.createNewFile();

        FileWriter filewriter = new FileWriter("ticket"+Admin.tickets_No+".txt");

        if (recliner != 0){
            filewriter.write(recliner+" x Recliner = "+recliner*350+"\n");
            System.out.println(recliner+" x Recliner = "+recliner*350);
        }
        if (prime != 0){
            filewriter.write(prime+" x Prime = "+prime*250+"\n");
            System.out.println(prime+" x Prime = "+prime*250);
        }
        if (classic != 0){
            filewriter.write(classic+" x Classic = "+classic*150+"\n");
            System.out.println(classic+" x Classic = "+classic*150);
        }

        filewriter.write("Bill = "+bill+"\nTax = "+tax+"\nNet amount to be paid : "+net+"\n");
        System.out.println("Bill = "+bill);
        System.out.println("Tax = "+tax);
        System.out.println("Net amount to be paid : "+net);

        System.out.print("Enter UPI id to make the purchase : ");
        sc.next();

        System.out.print("Enter your UPI pin to confirm: ");
        sc.nextInt();

        System.out.print("\nPLEASE WAIT - PAYMENT PROCESSING..... do not exit !");
        Thread.sleep(3000); //
        
        String barcode = generateBarcode();

        storeUserData(movieNum,timing,bookedSeats,barcode);
        
        System.out.println("\n\nYour Payment is Successful ! ");
        
        filewriter.write("Username : "+username+"\nMovie Name - "+movieName+"\nTiming  - "+movieTime+"\nSeat Numbers - "+bookedSeats+"\nBarcode - "+barcode+"\n\n");

        System.out.println("Username : "+username);
        System.out.println("Movie Name - "+movieName);
        System.out.println("Timing  - "+movieTime);
        System.out.println("Seat Numbers - "+bookedSeats);
        System.out.println("Barcode - "+barcode+"\n\n");
        
        Admin.tickets_No++;
        filewriter.close();
    }

    void storeUserData(int movieNum,int timing,String bookedSeats,String barcode){
        Admin.barcodes[Admin.userCount] = barcode;
        Admin.user_movies[Admin.userCount] = movieNum;
        Admin.user_timings[Admin.userCount] = timing;
        Admin.user_seats[Admin.userCount] = bookedSeats;
        Admin.userCount++;
    }

    void cancelTicket(int access)throws IOException{
        Scanner sc = new Scanner (System.in);
        showMovies();
        System.out.print("Enter the movie number (from the list) : ");
        int movieNum = sc.nextInt();
        showTimings(movieNum);
        System.out.print("Enter the timing number : ");
        int timing = sc.nextInt();

        if (access==0){
            // for general public 

            System.out.println("According to our cancellation policy , ONLY 50 % money is refundable.");
            System.out.println("Press y to cancel ticket: ");
            char ch = sc.next().toLowerCase().charAt(0); 
            
            if (ch=='y'){
                showSeats(movieNum, timing);
                System.out.print("Enter the barcode (8-Digit Code) : ");
                String userbarcode = sc.next();
                
                String seatNum = "";
                int i;
                
                for (i=0;i<Admin.userCount;i++){
                    if (Admin.barcodes[i].equals(userbarcode)){
                        break;
                    }
                }
                
                if (i==Admin.userCount){
                    System.out.println("INVALID BARCODE !");
                    return;
                }

                for (int j = 0;j<Admin.user_seats[i].length();j++){
                    if (Admin.user_seats[i].charAt(j)==' '){
                        int movieNo,timeNo,seatNo;
                        movieNo = Admin.user_movies[i];
                        timeNo = Admin.user_timings[i];
                        seatNo = Integer.parseInt(seatNum);

                        Admin.availableSeats[movieNo-1][timeNo-1][seatNo-1] = seatNo;
                        Admin.userCount--;
                        seatNum="";
                    }
                    else
                        seatNum+=Admin.user_seats[i].charAt(j);
                }
            
            }    
            showSeats(movieNum, timing);
            System.out.println("Ticket cancelled successfully !");
            System.out.println("Money will be refunded within 24 hours.");
        }

        
        else {
            // for admin
            char ch;
            int choice;
            Menu.adminCancelMenu();
            choice = sc.nextInt();

            if(choice==1){
                do{
                    showSeats(movieNum, timing);
                    System.out.print("Enter seat Number : ");
                    int seatNo = sc.nextInt();
                    Admin.availableSeats[movieNum-1][timing-1][seatNo-1] = seatNo;
                    
                    showSeats(movieNum, timing);
                    System.out.println("Seat cancelled successfully !");
                    
                    System.out.println("Would you like to continue ?(y/n)");
                    ch = sc.next().charAt(0);
                }while(ch=='y');
            }
            else if (choice==2){
                showSeats(movieNum,timing);
                System.out.println("Press y to cancel");
                ch=sc.next().charAt(0);
                
                if (ch=='y'){
                    for (int i = 1;i<=100;i++){
                        Admin.availableSeats[movieNum-1][timing-1][i-1] = i;
                    }
                    showSeats(movieNum, timing);
                    System.out.println("ALL SEATS ARE CANCELLED SUCCESSFULLY !");
                }
            }
            else
                System.out.println("INVALID INPUT !");
        }
    }
   
    void showSeats(int movie,int timing) throws IOException{
        int seatIndex = 0,seatCount = 100;

        
            for (int k = 0;k<10;k++){
                if (k==0)
                    System.out.println("-----------------------RECLINER - Rs.350------------------------------------");
                if (k==1)
                    System.out.println("-------------------------PRIME - Rs.250-------------------------------------");
                if (k==2)
                    System.out.println("------------------------CLASSIC - Rs.150------------------------------------");

                for (int l = 0;l<10;l++){
                    if (Admin.availableSeats[movie-1][timing-1][seatIndex]==-1){
                        System.out.print("X\t");
                        seatCount--;
                    }
                    else if (Admin.availableSeats[movie-1][timing-1][seatIndex]==-2){
                        System.out.print("Y\t");
                    }
                    else if (Admin.availableSeats[movie-1][timing-1][seatIndex]==-3){
                        System.out.print("R\t"); // mark as reserved
                        seatCount--;
                    }
                    else
                        System.out.print(Admin.availableSeats[movie-1][timing-1][seatIndex]+"\t");
                    seatIndex++;
                }

                System.out.println();
            }
            
            System.out.println("\n\t<==================== SCREEN ========================>");
            System.out.println("\nR - RESERVED\nX - BOOKED\nY - SELECTED\nSeats Available - "+seatCount+"\nSeats Booked - "+(100-seatCount));
        }
    }