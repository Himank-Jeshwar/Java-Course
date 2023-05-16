package Array_Programs;

public class CWH_05_Multidimensional_Arrays {
    public static void main(String[] args) {
        int [][] rollNo = new int [3][4];
        rollNo[0][0] = 98;
        rollNo[0][1] = 67;
        rollNo[0][2] = 77;
        rollNo[0][3] = 88;
        rollNo[1][0] = 120;
        rollNo[1][1] = 110;
        rollNo[1][2] = 23;
        rollNo[1][3] = 90;
        rollNo[2][0] = 10;
        rollNo[2][1] = 19;
        rollNo[2][2] = 23;
        rollNo[2][3] = 85;

        // System.out.println(rollNo[0][3]);
        for (int i = 0;i<rollNo.length;i++){
            System.out.print("Sub Array "+(i+1)+" -> ");
            for (int k = 0;k<rollNo[i].length;k++){
                System.out.print(rollNo[i][k]);
                if (k!=rollNo[i].length-1){
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
