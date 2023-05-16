import java.util.*;
class PR_09_MarksRecords {
    public static void main(String[] args) {
        // declaration
        double M[][] = new double [4][5],sum = 0.0;
        String names[] = new String [4],n;
        int k;
        //input
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<names.length;i++){
            System.out.print("Enter student's name : ");
            names[i] = sc.nextLine();
            System.out.println("Enter marks according to following order (English,Hindi,Maths,Science and Computer Science) : ");
            
            for (int j = 0;j<5;j++){
                M[i][j] = sc.nextDouble();
                sum+=M[i][j];
            }
            sc.nextLine();
        } 
        System.out.print("Enter name of the student : ");
        n = sc.nextLine();

        for (k = 0;k<names.length;k++){
            if (n.equals(names[k])){
                System.out.println("Name of the student : "+n);
                System.out.println("Marks in English : "+M[k][0]);
                System.out.println("Marks of the Hindi : "+M[k][1]);
                System.out.println("Marks in Maths : "+M[k][2]);
                System.out.println("Marks in Science : "+M[k][3]);
                System.out.println("Marks in Computer Science : "+M[k][4]);
                System.out.println("Total Marks : "+sum);
                break;
            }
        }

        if (k==names.length)
            System.out.println("Student not registered.");
    }
}
