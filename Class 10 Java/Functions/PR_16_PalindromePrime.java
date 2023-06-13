class PR_16_PalindromePrime {
    static boolean isPrime(int n){
        for (int i = 2;i<=n/2;i++){
            if (n%i==0&&i!=2)
                return false;
        }
        return (n!=1)?true:false;
    }    
    
    static boolean isPalindrome(int n){
        int rev = 0,copy = n;
        while (copy>0){
            rev = rev*10+copy%10;
            copy/=10;
        }
        return (rev==n);
    }

    public static void main(String[] args) {
        int c = 0,i=1;
        System.out.println("First 100 prime palindromes: ");
        while(c!=100){
            if (isPalindrome(i)&&isPrime(i)){
                System.out.println(i);
                c++;
            }
            i++;
        }
    }
}
