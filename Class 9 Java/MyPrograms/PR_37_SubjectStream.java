import java.util.*;
class PR_37_SubjectStream {
    public static void main(String[] args) {
        double marks,avg = 0.0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<3;i++){
            System.out.print("Enter marks : ");
            marks = sc.nextDouble();
            avg+=marks;
        }
        avg/=3; // finding average
        
        if (avg>=40&&avg<60)
            System.out.println("Commerce");
        else if (avg>=60&&avg<80)
            System.out.println("Bio-Science");
        else if (avg>=80&&avg<=100)
            System.out.println("Computer Science");

    }
}
