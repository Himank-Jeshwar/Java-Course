import java.util.*;
class PR_26_PrintTopStudents{
    static void input (String name[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter all names below : ");
        for (int i = 0;i<name.length;i++){
            name[i] = sc.nextLine();
        }
    }
    static void input (int marks[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter all names below : ");
        for (int i = 0;i<marks.length;i++){
            marks[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {
        // String names[] = {"Rohan","Harry","Samuel","Harshit","George","Joe","Karan","Dravid","Kevin","Mohit","Rohit"};
        // int marks[] = {67,89,22,10,90,90,99,78,89,100,95};
        String names[] = new String [50];
        int marks[] = new int[50];
        
        input(names);
        input(marks);

        int temp_for_marks;
        String temp_for_names;
        for (int i = 0;i<marks.length;i++){
            for (int j = 0;j<marks.length-i-1;j++){
                if (marks[j]<marks[j+1]){
                    temp_for_marks = marks[j+1];
                    marks[j+1] = marks[j];
                    marks[j] = temp_for_marks;
                    
                    temp_for_names = names[j+1];
                    names[j+1] = names[j];
                    names[j] = temp_for_names;
                }
            }
        }
        System.out.println("TOP 5 STUDENTS :\nNames\tMarks\n");
        for(int i = 0;i<5;i++){
            System.out.println(names[i]+"\t"+marks[i]);
        }
    }
}