import java.util.*;
import java.io.*;

class MovieTicket {

    String seatLayout[][];
    int availableSeats[][][];

    public MovieTicket(){
        seatLayout = new String[6][3];
        availableSeats = new int[6][3][100];
        int movies = 6,timings = 3,seatNum = 0;

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
    }
    void book()throws IOException{
        int movieNum,timing,i,seat;
        String movieName = "",line="";
        Scanner sc = new Scanner(System.in);

        File movies = new File("movies.txt");
        Scanner file = new Scanner(movies);

        System.out.print("Enter the movie number : ");
        movieNum = sc.nextInt();

        // readFile
        i = 1; // initialize
        while (file.hasNextLine()){
            line = file.nextLine();
            
            if (i==movieNum)
                break;

            i++;
        }

        movieName = line.substring(line.indexOf(' ')+1);
        System.out.println("Movie Name - "+movieName);
        showTimings(movieNum);

        System.out.println("Select a time slot : ");
        timing = sc.nextInt();

        showSeats(movieNum, timing);
        System.out.println("Enter seat number to book : ");
        seat = sc.nextInt();

        availableSeats[movieNum-1][timing-1][seat-1] = -1;

        showSeats(movieNum, timing);
        file.close();
    }

    void showSeats(int movie,int timing) throws IOException{
        int seatIndex = 0,seatCount = 100;
       
            for (int k = 0;k<10;k++){
                for (int l = 0;l<10;l++){
                    if (availableSeats[movie-1][timing-1][seatIndex]==-1){
                        System.out.print("X\t");
                        seatCount--;
                    }
                    else
                        System.out.print(availableSeats[movie][timing][seatIndex]+"\t");
                    seatIndex++;
                }

                System.out.println();
            }
            
            System.out.println("\n\t<==================== SCREEN ========================>");
            System.out.println("\nX - BOOKED\nSeats Available - "+seatCount+"\nSeats Booked - "+(100-seatCount));
        }


    

    void test(){
        System.out.println(availableSeats[1][2][36]);
    }
    public static void main(String args[])throws IOException{
        MovieTicket ob = new MovieTicket();
        ob.showMovies();
        System.out.println();
        ob.book();
        // ob.showSeats(1,2);
        // ob.test();
    }
}