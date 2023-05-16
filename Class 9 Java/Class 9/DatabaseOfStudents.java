import java.io.*;
class DatabaseOfStudents {
    public static void main(String[] args) throws IOException{
        double [] marksof1stSubject,marksOf2ndSubject,marksOf3rdSubject; int [] rollNumbersofAllStudents;
        double marks1,marks2,marks3; String[] namesofAllStudents;String name; int rollNum;
        int students;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of students : ");
        students = Integer.parseInt(br.readLine());
        marksof1stSubject  = new double [students]; 
        marksOf2ndSubject = new double[students];
        marksOf3rdSubject = new double[students];
        namesofAllStudents = new String[students];
        rollNumbersofAllStudents = new int [students];
        for (int i = 1;i<=students;i++){
            String msg;
            if (i%10==1)
                msg = "st";
            else if (i%10==2)
                msg = "nd";
            else if (i%10==3)
                msg = "rd";
            else
                msg = "th";
            System.out.println("\nEntering info for "+i+""+msg+" student...");
            System.out.print("Enter the name of the student = ");
            name = br.readLine();
            namesofAllStudents[i-1]=name;
            System.out.print("Enter the roll number of the student = ");
            rollNum = Integer.parseInt(br.readLine());
            rollNumbersofAllStudents[i-1]=rollNum;
            System.out.print("Enter marks of Subject 1 = ");
            marks1 = Double.parseDouble(br.readLine());
            marksof1stSubject[i-1] = marks1;
            System.out.print("Enter marks of Subject 2 = ");
            marks2 = Double.parseDouble(br.readLine());
            marksOf2ndSubject[i-1] = marks2;
            System.out.print("Enter marks of Subject 3 = ");
            marks3 = Double.parseDouble(br.readLine());
            marksOf3rdSubject[i-1] = marks3;
            System.out.println();     
        }
        System.out.print("NAMES - ");
        for (String stud : namesofAllStudents) {
            System.out.print(stud+"\t\t");
        }
        System.out.println();
        System.out.print("ROLL NUMBERS       - ");
        for (int roll : rollNumbersofAllStudents){
            System.out.print(roll+"\t");
        }
        System.out.println();
        System.out.print("MARKS OF SUBJECT 1 - ");
        for (double mark1 : marksof1stSubject){
            System.out.print(mark1+"\t");
        }
        System.out.println();
        System.out.print("MARKS OF SUBJECT 2 - ");
        for (double mark2 : marksOf2ndSubject){
            System.out.print(mark2+"\t");
        }
        System.out.println();
        System.out.print("MARKS OF SUBJECT 3 - ");
        for (double mark3 : marksOf3rdSubject){
            System.out.print(mark3+"\t");
        }
    }
}
