import java.util.*;
class PR_31_SortingNumbers {
    public static void main(String[] args) {
        int min = 0,n; // declaration
        String negativeSeries = "",positiveSeries = "";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        while (sc.hasNextInt()){
            // if(sc.hasNextInt()){
                System.out.print("Enter a number : ");
                n = sc.nextInt();//
                if (n<0)
                    negativeSeries+=" "+n;
                else 
                    positiveSeries+=" "+n;
             }

        System.out.println("Sorted series : "+negativeSeries+" "+positiveSeries);    
    }    
}
