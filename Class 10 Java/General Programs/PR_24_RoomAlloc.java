import java.util.*;
class PR_24_RoomAlloc {
    public static void main(String[] args) {
        String n[] = new String [6];
        int R[][] = new int [2][3];
        int ind = 0,r,row=0,col=0;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter names of the customer : ");

        for (int i = 0;i<R.length;i++){
            for(int j = 0;j<R[i].length;j++){
                n[ind] = sc.nextLine();
                R[i][j] = ind;
                ind++;
            } 
        }
        ind = 0; // reinitialization 

        System.out.println("Enter a room number : ");
        r = sc.nextInt();

        // calculation
        row = r/R[0].length;
        col = r-R[0].length*row;

        /* Explanation
         say room input - 245
         row no = (room no.)/(no.of rooms in each floor)
         col no. = (room no.)-(no.of rooms in each floor*row no.)
         row no. = 245/50 = 4  (5th floor)
         col no. = 245-50*4 = 245-200 = 45 
         hence : row = 4 col = 45 
         */
        ind = R[row][col]-1;

        System.out.println("Name of the customer is : "+n[ind]);
        System.out.println("Floor number : "+(row+1));


    }
}
