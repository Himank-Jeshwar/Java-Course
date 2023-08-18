import java.util.*;
class PR_35_OccurencesOfDigits {
    int countOccurence(int a[],int n){
        int c = 0;
        for (int i = 0;i<a.length;i++){
            if (n==a[i])
                c++;
        }
        return c;
    }
    public static void main(String[] args) {
        long n,copy;
        int n_digits = 0;
        int digits [];
        String checked = "";
        PR_35_OccurencesOfDigits ob = new PR_35_OccurencesOfDigits();
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        n = sc.nextLong();
        copy = n;
        for (long i = n;i>0;i/=10,n_digits++); // counting digits
        digits = new int[n_digits];

        for (int i = 0;i<digits.length;i++){
            digits[i]=(int)copy%10;
            copy/=10;
        }

        for (int i = 0;i<digits.length;i++){
            char ch = (char)(digits[i]+48); // converting integer to char
            if (checked.indexOf(ch)==-1){
                System.out.println(digits[i]+" occurs "+ob.countOccurence(digits, digits[i])+" times in the number "+n);
                checked+=digits[i];            
            }
        }
    }
}
