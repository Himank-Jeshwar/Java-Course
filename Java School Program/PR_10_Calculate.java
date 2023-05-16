import java.io.*;
public class PR_10_Calculate {
    public static void main(String[] args) throws IOException{
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (inp);
        System.out.println("Enter Room Length and Breadth (in cm) :- ");
        double roomLength = Double.parseDouble(br.readLine());
        double roomWidth = Double.parseDouble(br.readLine());
        System.out.println("Enter Carpet Length and Breadth (in cm) :- ");
        double carpetLength = Double.parseDouble(br.readLine());
        double carpetWidth = Double.parseDouble(br.readLine());
        double roomArea = roomLength*roomWidth;
        double carpetArea = carpetLength*carpetWidth;
        double uncoveredArea = roomArea-carpetArea;
        System.out.println("Area uncovered = "+uncoveredArea+" sq.cm");
         
    }
}
