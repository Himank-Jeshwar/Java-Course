import java.io.*;
public class PR_28_Grade {
    public static void main(String[] args)throws IOException {
        // declaration
        double hist,geo,avg=0.0;
        char grade='A';

        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter marks of History = ");
        hist = Double.parseDouble(br.readLine());
        System.out.print("Enter marks of Geography = ");
        geo = Double.parseDouble(br.readLine());

        // calculating average
        avg = (hist+geo)/2;

        // decision
        if (avg>70)
            grade = 'A';
        else if (avg>50)
            grade = 'B';
        else if (avg>35)
            grade = 'C';
        else
            grade = 'D';
        
        // output
        System.out.print("\nAverage score = "+avg+"\tGrade = "+grade);
    }
}
