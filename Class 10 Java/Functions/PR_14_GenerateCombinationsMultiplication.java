import java.util.*;
class PR_14_GenerateCombinationsMultiplication{
    static int countFactors(int n){
        int c = 0;
        for (int i = 1;i<=n;i++){
            if (n%i==0)
                c++;
        }
        return c;
    }
    static void generateCombinations(int n){
        int factors[] = new int [countFactors(n)];
        int k = 0;
        for (int i = 1;i<=n;i++){
            if (n%i==0){
                factors[k] = i;
                k++;
            }
        }

        for (int j = 0;j<factors.length/2;j++){
            System.out.println(factors[j]+" x "+factors[factors.length-j-1]+" = "+n);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();
        generateCombinations(n);       
    }
}