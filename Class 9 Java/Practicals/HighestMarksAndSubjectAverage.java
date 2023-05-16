import java.io.*;
class HighestMarksAndSubjectAverage {
    String names[];double []marks;
    void input()throws IOException{
        names=new String[50];marks=new double[50];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the names of all students below :-");
        for (int i = 0;i<names.length;i++){
            names[i]=br.readLine();
        }
        for (int j = 0;j<names.length;j++){
            System.out.print("Enter marks of "+names[j]+" = ");
            marks[j]=Double.parseDouble(br.readLine());
            if (marks[j]>100){
                System.out.print("Marks can't be greater than 100.");
                break;
            }
        }
    }

    void subjectAvgMarks(){
        double subjAvgMarks = 0.0,sum = 0.0;
        for (int i = 0;i<marks.length;i++){
            sum+=marks[i];
        }
        subjAvgMarks = sum/50;
        System.out.println("Subject average marks = "+subjAvgMarks);
    }

    void highestMarks(){
        double max = 0.0;
        String topper="";
        for (int k = 0;k<marks.length;k++){
            if (marks[k]>max){
                max = marks[k];
                topper = names[k];
            }
        }
        System.out.println("Highest marks in the subject = "+max);
        System.out.print("Name of the candidate - "+topper);
    }
    public static void main(String[] args)throws IOException {
        HighestMarksAndSubjectAverage obj = new HighestMarksAndSubjectAverage();
        obj.input();
        obj.subjectAvgMarks();
        obj.highestMarks();
    }
}
