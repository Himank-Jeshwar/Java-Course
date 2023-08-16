import java.util.*;
class PR_31_MarksMatrix {
    public static void main(String[] args) {
        // declaration
        double marksForSecA[][] = new double[4][3];
        double marksForSecB[][] = new double[4][3];

        double total = 0.0,avg = 0.0;
        Scanner sc = new Scanner (System.in);
        // inputs for section A
        System.out.println("ENTER MARKS FOR SECTION-A");
        for (int i = 0;i<marksForSecA.length;i++){
            System.out.println("\nEnter marks for Student-"+(i+1));
            for (int j = 0;j<marksForSecA[i].length;j++){
                System.out.print("Enter marks for subject "+(j+1)+" : ");
                marksForSecA[i][j] = sc.nextInt();
            }
        }
        //inputs for section B
        System.out.println("ENTER MARKS FOR SECTION-B");
        for (int i = 0;i<marksForSecB.length;i++){
            System.out.println("\nEnter marks for Student-"+(i+1));
            for (int j = 0;j<marksForSecB[i].length;j++){
                System.out.print("Enter marks for subject "+(j+1)+" : ");
                marksForSecB[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nMARKS FOR SECTION A - ");
        // calculation for section A
         for (int i = 0;i<marksForSecA.length;i++){
            total = 0.0;
            for (int j = 0;j<marksForSecA[i].length;j++){
                total+=marksForSecA[i][j];
            }
            avg = total/3.0; 
            System.out.println("Marks for Student-"+(i+1)+" : "+total);
            System.out.println("Average marks for Student-"+(i+1)+" : "+avg);
        }

         System.out.println("\nMARKS FOR SECTION B - ");
        // calculation for section B
         for (int i = 0;i<marksForSecB.length;i++){
            total = 0.0;
            for (int j = 0;j<marksForSecB[i].length;j++){
                total+=marksForSecB[i][j];
            }
            avg = total/3.0; 
            System.out.println("Marks for Student-"+(i+1)+" : "+total);
            System.out.println("Average marks for Student-"+(i+1)+" : "+avg);

        }
    }    
}
