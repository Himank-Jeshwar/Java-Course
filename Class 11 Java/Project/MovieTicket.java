import java.util.*;
import java.io.*;


class MovieTicket {

    String barcodes[];
    int user_movies[],user_timings[];
    String user_seats[];
    int availableSeats[][][];
    int movies ,timings,userCount;

    public MovieTicket(){
        movies = 75;
        timings = 3;
        userCount = 0;
        int seatNum = 0;
        
        availableSeats = new int[movies][timings][100];
        barcodes = new String[availableSeats.length];
        user_seats = new String[availableSeats.length];
        user_movies = new int[availableSeats.length];
        user_timings = new int [availableSeats.length];
        
        for (int i = 0;i<movies;i++){
            for (int j = 0;j<timings;j++){
                seatNum = 0;
                for(int k = 0;k<100;k++){
                    availableSeats[i][j][k] = ++seatNum;
                }
            }
        }

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
            line = file.nextLine()+'#';

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
    void book()throws IOException,InterruptedException{
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
        do{
            System.out.println("Enter seat number to book : ");
            seat = sc.nextInt();

            if(availableSeats[movieNum-1][timing-1][seat-1]==-1){
                System.out.println("THIS SEAT IS ALREADY BOOKED !");
            }
            else{
                if (seat<=10)
                    recliner++;
                else 
                    if (seat<=20)
                        prime++;
                    else
                        classic++;
                
                bookedSeats+=availableSeats[movieNum-1][timing-1][seat-1]+" ";
                availableSeats[movieNum-1][timing-1][seat-1] = -2; // mark as unconfirmed
            }
            showSeats(movieNum, timing);
            
            System.out.print("Would you like to select one more seat (y/n)");
            flag = sc.next().toLowerCase().charAt(0);

        }while (flag=='y'); 

        System.out.println("Press y to pay : ");
        char pay = sc.next().toLowerCase().charAt(0);
        
        if (pay=='y'){
            for (int i = 0;i<movies;i++){
                for (int j = 0;j<timings;j++){
                    for (int k = 0;k<100;k++){
                        if (availableSeats[i][j][k]==-2){
                            availableSeats[i][j][k]=-1; // mark as confirmed
                        }
                    }
                }
            }
            makePayment(movieName,movieTime,bookedSeats,movieNum,timing,recliner,prime,classic);
        }
        else{
            bookedSeats = "";
            for (int i = 0;i<movies;i++){
                for (int j = 0;j<timings;j++)
                    for (int k = 0;k<100;k++){
                        if (availableSeats[i][j][k]==-2)
                            availableSeats[i][j][k]=k+1; // restore all seats
                    }
            }
        }
        
        file.close();
        file1.close();
        sc.close();
    }
    String generateBarcode(){
        String id = "";        
        for (int i = 0;i<8;i++){
            int ch = (int)(Math.random()*(90-65)+65);
            id+=(char)(ch);
        }
        return id;
    }

    void makePayment(String movieName,String movieTime,String bookedSeats,int movieNum,int timing,int recliner,int prime,int classic) throws InterruptedException{
        double bill = recliner*350+prime*250+classic*150;
        double tax = 18*bill/100.0,net = bill + tax;

        Scanner sc = new Scanner(System.in);

        if (recliner != 0)
            System.out.println(recliner+" x Recliner = "+recliner*350);
        if (prime != 0) 
            System.out.println(prime+" x Prime = "+prime*250);
        if (classic != 0)
            System.out.println(classic+" x Classic = "+classic*150);

        System.out.println("Bill = "+bill);
        System.out.println("Tax = "+tax);
        System.out.println("Net amount to be paid : "+net);

        System.out.print("Enter UPI id to make the purchase : ");
        sc.next();

        System.out.print("Enter your UPI pin to confirm: ");
        sc.nextInt();

        System.out.print("PLEASE WAIT .... do not exit !");
        Thread.sleep(3000); //
        
        String barcode = generateBarcode();
        storeUserData(movieNum,timing,bookedSeats,barcode);
        System.out.println("\nYour Payment is Successful ! ");
        System.out.println("Movie Name - "+movieName);
        System.out.println("Timing  - "+movieTime);
        System.out.println("Seats - "+bookedSeats);
        System.out.println("Barcode - "+barcode);
    
        sc.close();
    }

    void storeUserData(int movieNum,int timing,String bookedSeats,String barcode){
        barcodes[userCount] = barcode;
        user_movies[userCount] = movieNum;
        user_timings[userCount] = timing;
        user_seats[userCount] = bookedSeats;
        userCount++;
    }

    void cancelTicket()throws IOException{
        Scanner sc = new Scanner (System.in);
        showMovies();
        System.out.print("Enter the movie number (from the list) : ");
        int movieNum = sc.nextInt();
        showTimings(movieNum);
        System.out.print("Enter the timing number : ");
        int timing = sc.nextInt();

        System.out.println("According to our cancellation policy , 75 % money is refundable \nand is valid upto 3 hours before the show timing.");
        System.out.println("Press y to cancel : ");
        char ch = sc.next().toLowerCase().charAt(0); 
        
        if (ch=='y'){
            showSeats(movieNum, timing);
            System.out.print("Enter the barcode (8-Digit Code) : ");
            String barcode = sc.next();
            
            
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
                    if (availableSeats[movie-1][timing-1][seatIndex]==-1){
                        System.out.print("X\t");
                        seatCount--;
                    }
                    else if (availableSeats[movie-1][timing-1][seatIndex]==-2){
                        System.out.print("Y\t");
                    }
                    else
                        System.out.print(availableSeats[movie-1][timing-1][seatIndex]+"\t");
                    seatIndex++;
                }

                System.out.println();
            }
            
            System.out.println("\n\t<==================== SCREEN ========================>");
            System.out.println("\nX - BOOKED\nY - SELECTED\nSeats Available - "+seatCount+"\nSeats Booked - "+(100-seatCount));
        }


    

    public static void main(String args[])throws IOException,InterruptedException{
        MovieTicket ob = new MovieTicket();
        ob.showMovies();
        System.out.println();
        ob.book();
        ob.book();
        for (String el:ob.barcodes)
            System.out.println(el);
        // ob.showSeats(1,2);
        // ob.test();
    }
}