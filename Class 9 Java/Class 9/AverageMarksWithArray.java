import java.io.*;
public class AverageMarksWithArray {
    // declaring data members
    String name,remarks;int rollNo;double marks1,marks2,marks3,avg;
    String [] names;int rollNumbers[];double [] marks1Arr,marks2Arr,marks3Arr,averageMarksArr;
    
    int noOfStudents;

    void input()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of students = ");
        noOfStudents = Integer.parseInt(br.readLine());
        names = new String [noOfStudents];
        rollNumbers = new int [noOfStudents];
        marks1Arr = new double [noOfStudents];
        marks2Arr = new double [noOfStudents];
        marks3Arr = new double[noOfStudents];
        averageMarksArr = new double[noOfStudents];
        for (int i = 0;i<noOfStudents;i++){
            System.out.print("Enter student's name - ");
            name = br.readLine();
            names[i]=name;
            System.out.print("Enter student's roll number - ");
            rollNo = Integer.parseInt(br.readLine());
            rollNumbers[i]=rollNo;
            System.out.print("Enter marks for Subject 1 - ");
            marks1 = Double.parseDouble(br.readLine());
            marks1Arr[i]=marks1;
            System.out.print("Enter marks for Subject 2 - ");
            marks2 = Double.parseDouble(br.readLine());
            marks2Arr[i]=marks2;
            System.out.print("Enter marks for Subject 3 - ");
            marks3 = Double.parseDouble(br.readLine());
            marks3Arr[i]=marks3;
            averageMarksArr[i]=(marks1Arr[i]+marks2Arr[i]+marks3Arr[i])/3;
        }
    }
    void display(){
        for (int j = 0;j<averageMarksArr.length;j++){
            if (averageMarksArr[j]<40)
                remarks = "Poor";
            else if (averageMarksArr[j]<=59)
                remarks = "Pass";
            else if (averageMarksArr[j]<=74)
                remarks = "First Class";
            else if (averageMarksArr[j]<=84)
                remarks = "Distinction";
            else
                remarks = "Excellent";
            System.out.println("Name - "+names[j]+"\nRoll number - "+rollNumbers[j]);
            System.out.println("Remarks - "+remarks);
        }
    }
    public static void main(String[] args)throws IOException {
        AverageMarksWithArray amwa = new AverageMarksWithArray();
        amwa.input();
        amwa.display();
    }
}
