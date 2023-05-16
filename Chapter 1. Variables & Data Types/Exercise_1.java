/*
CALCULATION PART EXPLAINED
Number of subjects = 5 => (subjects)
Full Marks = cal.nextInt() => (fullMarks)
Total Marks = sub1+sub2+sub3+sub4+sub5 => (totalMarks)
Total Full Marks = fullMarks*subjects => (MaximumMarks)

Percentage = (totalMarks*100)/MaximumMarks
*/
import java.util.Scanner;
public class Exercise_1 
{
    public static void main(String[] args) 
    {   // declaring no. of subjects
        int subjects = 5;

        Scanner cal = new Scanner(System.in);
        // Taking Full Marks from the user 
        System.out.print("Enter Full Marks = ");
        double fullMarks = cal.nextDouble(); 

        // Taking Marks from the user 
        System.out.print("Enter Marks For Subject1 = ");
        double sub1 = cal.nextDouble();
        System.out.print("Enter Marks For Subject2 = ");
        double sub2 = cal.nextDouble();
        System.out.print("Enter Marks For Subject3 = ");
        double sub3 = cal.nextDouble();
        System.out.print("Enter Marks For Subject4 = ");
        double sub4 = cal.nextDouble();
        System.out.print("Enter Marks For Subject5 = ");
        double sub5 = cal.nextDouble();
        
        // Calculation Part
        double totalMarks = sub1+sub2+sub3+sub4+sub5;
        double MaximumMarks = fullMarks*subjects;
        double percent = (totalMarks*100)/MaximumMarks;

        //result
        System.out.println("Percentage = "+percent+" %");
    }
}
