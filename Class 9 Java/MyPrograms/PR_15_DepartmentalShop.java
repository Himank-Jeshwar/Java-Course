import java.util.Scanner;

class PR_15_DepartmentalShop {
    public static void main(String[] args) {
        // declaration
        double [][] m = new double[2][3];
        double sales = 0; 
        // inputs
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<m.length;i++){
            sales=0;
            for (int j = 0;j<m[i].length;j++){
                System.out.print("Enter sales for Store "+i+" Department "+j+" : ");
                m[i][j]=sc.nextDouble();
            }
            System.out.println();
        }
         for (int i = 0; i < m.length; i++) {
            sales=0;
            for (int j = 0; j < m[i].length; j++) {
                sales+=m[i][j];
            }
            System.out.println("Sales of Stores : Rs."+sales);
         }


    }    
}
