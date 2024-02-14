import java.util.*;
class PR_60_Hotel {
    public static void main(String args[]){
        // declaration
        String M [][] = new String [2][3];
        
        String nm;
        int r=-1,col=-1;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter names of the people :-");
        for (int i = 0;i<M.length;i++)
            for (int j = 0;j<M[i].length;j++)
                M[i][j] = sc.nextLine();

        System.out.print("Enter the name of a visitor to search : ");
        nm = sc.nextLine();

        for (int i = 0;i<M.length;i++){
            for (int j = 0;j<M[i].length;j++){
                if (nm.equalsIgnoreCase(M[i][j])){
                    r = i+1;
                    col = j+1;
                    System.out.println("Floor : "+r);
                    System.out.println("Room number : "+col);
                }
            }
        }

        if (r==-1||col==-1)
            System.out.println("NAME NOT FOUND !");
    }
}
