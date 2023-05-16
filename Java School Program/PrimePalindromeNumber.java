
class PrimePalindromeNumber{
    static boolean checkPrime(int n){
        boolean isPrime = (n==2)?true:false;
        for (int i = 2;i<n;i++){
            if (n%i==0){
                isPrime = false;
                break;
            }
            else
                isPrime = true;
        }
        return isPrime;
    }
    static boolean checkPalindrome(int n){
        int n1=n;
        int revNum = 0;
        while (n1>0){
            revNum=revNum*10+n1%10;
            n1/=10;
        }
        return (revNum==n)?true:false;
        
    }

    public static void main(String[] args) {
        System.out.print("Prime palindrome numbers are : ");
        for (int i = 10;i<=1000;i++){
            if (checkPrime(i)&&checkPalindrome(i))
                System.out.print(i+"  ");
        }
    }
}