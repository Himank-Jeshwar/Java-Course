public class PR_05_Pattern
{
    public static void main(String[] args) {
        int i = 1;
        int k = 5;
        int j = 1;
        int ln = 1;
        while (i<=5){
            k=i;
            while (k>=1){
                System.out.print("*");
                k--;
            }
        System.out.println();
        i++;
        }    
        while (ln<=5){
            j=ln;
            while (j<5){
                System.out.print("*");
                j++;
            }
        System.out.println();
        ln++;
        }   
    }
}