import java.io.*;
public class AverageMarks {
    public static void main(String[] args)throws IOException {
        // declaration
        String name;int rollNo;double marks1,marks2,marks3,avg = 0.0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter student's name - ");
        name = br.readLine();
        System.out.print("Enter student's roll number - ");
        rollNo = Integer.parseInt(br.readLine());
        System.out.print("Enter marks for Subject 1 - ");
        marks1 = Double.parseDouble(br.readLine());
        System.out.print("Enter marks for Subject 2 - ");
        marks2 = Double.parseDouble(br.readLine());
        System.out.print("Enter marks for Subject 3 - ");
        marks3 = Double.parseDouble(br.readLine());

        // calculation
        avg = (marks1+marks2+marks3)/3;

        // decision
        if (avg<40)
            System.out.print("Poor");
        else
            if (avg<=59)
                System.out.print("Pass");
            else
                if (avg<=74)
                    System.out.print("First Class");
                else
                    if (avg<=84)
                        System.out.print("Distinction");
                    else
                        System.out.print("Excellent");

    }    
}
