import java.io.*;
class Grade {
    int rollNum[];String names[];int STUDENTS;
    double marks1[],marks2[],marks3[],marks4[],marks5[],marks6[];
    void input()throws IOException{
        STUDENTS = 2;
        rollNum = new int[STUDENTS];names=new String[STUDENTS];
        marks1 = new double[STUDENTS];marks2 = new double[STUDENTS];marks3 = new double[STUDENTS];
        marks4 = new double[STUDENTS];marks5 = new double[STUDENTS];marks6 = new double[STUDENTS];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter names of all students = ");
        for (int i = 0;i<names.length;i++){
            names[i]=br.readLine();
        }
        for (int i = 0;i<names.length;i++){
            System.out.print("Enter roll number of "+names[i]+" - ");
            rollNum[i] = Integer.parseInt(br.readLine());
            System.out.print("Enter Subject 1 marks for "+names[i]+" - ");
            marks1[i]= Double.parseDouble(br.readLine());
            System.out.print("Enter Subject 2 marks for "+names[i]+" - ");
            marks2[i]= Double.parseDouble(br.readLine());
            System.out.print("Enter Subject 3 marks for "+names[i]+" - ");
            marks3[i]= Double.parseDouble(br.readLine());
            System.out.print("Enter Subject 4 marks for "+names[i]+" - ");
            marks4[i]= Double.parseDouble(br.readLine());
            System.out.print("Enter Subject 5 marks for "+names[i]+" - ");
            marks5[i]= Double.parseDouble(br.readLine());
            System.out.print("Enter Subject 6 marks for "+names[i]+" - ");
            marks6[i]= Double.parseDouble(br.readLine());
        }
    }
    void showGrade(){
        double fullMarks = 100*6;
        for (int j = 0;j<STUDENTS;j++){
            double marksObtained = 0.0,percentage;
            char grade;
            System.out.println("******************************\nName - "+names[j]+"\t Roll number - "+rollNum[j]);
            marksObtained = marks1[j]+marks2[j]+marks3[j]+marks4[j]+marks5[j]+marks6[j];
            percentage = marksObtained*100/fullMarks;
            System.out.println("Percentage - "+percentage+"%");
            if (percentage<40)
                grade = 'D';
            else
                if (percentage<60)
                    grade = 'C';
                else 
                    if(percentage<80)
                        grade = 'B';
                    else
                        grade = 'A';
            
            System.out.println("Grade - "+grade+"\n******************************\n");
        }
    }

    public static void main(String[] args)throws IOException {
        Grade gd = new Grade();
        gd.input();
        gd.showGrade();
    }    
}
