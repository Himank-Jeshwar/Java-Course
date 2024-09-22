class PR_06_SmithNumber {
    private int n;

    public PR_06_SmithNumber(int n){
        this.n = n;
    }

    boolean isPrime(int x){
        for (int i = 2;i<=x/2;i++){
            if (x%i==0 && x!=2)
                return false;
        }

        return (x==1 || x==0)?false:true;
    }

    int sumDigits(int x){
        int s = 0; // declaration

        while (x>0){
            s+=x%10;
            x/=10;
        }
        return s;
    }

    boolean isSmith(){
        int sumFactors = 0,dividend = n,divisor = 2;
        
        // for (int i = 1;i<=n;i++){
        //     if (n%i==0){ // is factor
        //         if (isPrime(i)==true){ // factor is prime 
        //             copy = i;
        //             while (copy>0){
        //                 sumFactors+=copy%10;
        //                 copy/=10;
        //             }
        //         }
        //     }
        // }

        while (dividend!=1){
            // dividend/=divisor;

            while (dividend%divisor!=0){
                divisor = divisor + 1;
            }

            if (divisor<=9)
                sumFactors+=divisor;
            else
                sumFactors+=sumDigits(divisor);

            dividend/=divisor;
        }
        
       System.out.println("\nSum of prime factors : "+sumFactors);
       System.out.println("Sum of digits : "+sumDigits(n));

    return (sumDigits(n)==sumFactors);
    }

    void display(){
        if (isSmith()==true)
            System.out.println(n+" is a Smith number.");
        else
            System.out.println(n+" is NOT a Smith number.");
    }
}
