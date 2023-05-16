// Format

// Student Name
// Average Marks
// Remarks
import java.util.*;
class Remarks{
    static int rollNum[];
    static double marks1[],marks2[],marks3[];
    static String name[];
    static void initializeArrays(int n){
        rollNum = new int [n];
        name = new String [n];
        marks1 = new double [n];
        marks2 = new double [n];
        marks3 = new double [n];
    }
 
    static void inputArrays(Scanner sc){
        for (int i = 0;i<name.length;i++){
            System.out.print("Enter the name of the student : ");
            sc.nextLine();
            name[i]=sc.nextLine();
            
            System.out.print("Enter roll number :");
            rollNum[i]=sc.nextInt();
            System.out.println("Enter marks for Subject 1 :");
            marks1[i]=sc.nextDouble();
            System.out.println("Enter marks for Subject 2 :");
            marks2[i]=sc.nextDouble();
            System.out.println("Enter marks for Subject 3 :");
            marks3[i]=sc.nextDouble();
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // declaration
        int n;
        double avg,sum;

        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students : ");
        n = sc.nextInt();

        initializeArrays(n);
        inputArrays(sc);

        for (int k = 0;k<n;k++){
            sum=marks1[k]+marks2[k]+marks3[k];
            avg = sum/3;

            System.out.println("Name : "+name[k]);
            System.out.println("Roll number : "+rollNum[k]);
            System.out.println("Average marks : "+avg);

            // decision
            if (avg<40)
                System.out.println("POOR\n");
            else if (avg<60)
                System.out.println("PASS\n");
            else if (avg<75)
                System.out.println("FIRST CLASS\n");
            else if (avg<85)
                System.out.println("DISTINCTION\n");
            else 
                System.out.println("EXCELLENT\n");
        }
    }
}