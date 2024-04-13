import java.util.*;
class PR_01_ZigZag{
    char[][] convert (String s,int numRow){
        char arr[][] = new char[numRow][1000];
        int row = 0,col = 0,n=numRow;

        for (int i = 0;i<s.length();i++){
            if (row<n-1){
                arr[row][col] = s.charAt(i);
                row++;
            } 
            else if (row==n-1){
                arr[row][col] = s.charAt(i);
                row--;
                col++;
                n--;
            }

            if (row<0){
                row=1;
                col--;
                n = numRow;
            }

        }

        return arr;
    }

    public static void main(String[] args) {
        PR_01_ZigZag ob = new PR_01_ZigZag();
        Scanner sc = new Scanner(System.in);
        int numRow;
        String s = "",str;

        System.out.print("Enter string : ");
        str = sc.next();
        System.out.print("Enter number of rows : ");
        numRow = sc.nextInt();

        char arr[][] = ob.convert(str, numRow);

        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                s+=arr[i][j];
            }
        }

        System.out.println("New Text : "+s);

    }
}