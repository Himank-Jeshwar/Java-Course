import java.util.*;
class ASG_18_Matrix {
    int m[][]; // declaration

    void input (){
        m = new int [10][3];// allocate space
        Scanner sc = new Scanner (System.in);
        
        for (int i = 0;i<m.length;i++){
            for (int j = 0;j<m[i].length;j++){
                System.out.print("Enter no. of medicines : ");
                m[i][j] = sc.nextInt();
            }
        }
    }

    void rowSum(){
        int s = 0;

        for (int i = 0;i<10;i++){
            s = 0;
            for (int j = 0;j<3;j++)
                s+=m[i][j];
            System.out.println("Sum of row "+(i+1)+" : "+s);
        }
    }

    void colSum(){
        int s = 0;

        for (int j = 0;j<3;j++){
            s = 0;
            for (int i = 0;i<10;i++)
                s+=m[i][j];
            System.out.println("Sum of column "+(j+1)+" : "+s);
        }
    }

    void display(){
        for (int i = 0;i<10;i++){
            for (int j = 0;j<3;j++)
                System.out.print(m[i][j]+"\t");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ASG_18_Matrix ob = new ASG_18_Matrix();
        ob.input();
        ob.display();
        ob.rowSum();
        ob.colSum();
    }    
}
