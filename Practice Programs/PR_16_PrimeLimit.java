public class PR_16_PrimeLimit {
    boolean isPrime(int n){
        boolean checkPrimeOrNot = (n==2)?true:false;
        for (int i = 2;i<n;i++){
            checkPrimeOrNot = n%i!=0?true:false;
            if (checkPrimeOrNot==false)
                break;
        }
        
        return checkPrimeOrNot;
        }
        boolean areAllFactorsPrime(int num){
            boolean factorsPrimeOrNot = false;
            for (int i = 1;i<=num;i++){
                if (num%i==0&&i>1&&i<num)
                    if (isPrime(i)==true)
                        factorsPrimeOrNot = true;
            }
            return factorsPrimeOrNot;
            }
    public static void main(String[] args) {
        PR_16_PrimeLimit Pl = new PR_16_PrimeLimit();
        System.out.println(Pl.areAllFactorsPrime(1));
    }     
}