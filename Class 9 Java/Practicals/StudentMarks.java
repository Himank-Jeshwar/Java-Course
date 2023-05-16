import java.io.*;
class StudentMarks {
    int n;String names[];double totalMarks[];

    void input()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of students - ");        
        n = Integer.parseInt(br.readLine());
        totalMarks = new double[n];
        names = new String[n];
        System.out.println("Enter names of "+n+" students below :-");
        for (int i = 0;i<n;i++){
            names[i]=br.readLine();
        }
        for (int j = 0;j<n;j++){
            System.out.print("Enter total marks of "+names[j]+" - ");
            totalMarks[j]=Double.parseDouble(br.readLine());
        }
    }

    double average(){
        //declaration
        double avg = 0.0,sum = 0.0;

        // calculating sum of total marks of all students
        for (int i = 0;i<totalMarks.length;i++){
            sum+=totalMarks[i];
        }

        // calculating average
        avg = sum/n;
        return avg;
    }

    void deviation(){
        for (int i = 0;i<n;i++){
            double dev = totalMarks[i]-average();
            System.out.println("Deviation of "+names[i]+" - "+dev);
        }
    }
    public static void main(String[] args)throws IOException {
        StudentMarks sm = new StudentMarks();
        sm.input();
        System.out.println("\nAverage marks of all students = "+sm.average());
        sm.deviation();
    }    
}
