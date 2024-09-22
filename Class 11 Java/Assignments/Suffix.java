class Suffix{
    private int n; // declaration
    
    public Suffix(int n){
        this.n=n;
    }
    
    static boolean isValid (int x){
        if (x>19 || x==10 || x==11 || x==12)
            return true;
        return false;
    }
    
    void printSuffix (int lastDigit){
        String suffix [] = {"st","nd","rd","th"}; // all suffixes in an array
        
        System.out.print("SUFFIX : ");
        
        // check
        if (lastDigit-1<0 || lastDigit-1>3 || (n>=10&&n<=12))
            System.out.print(n+"th");
        else
            System.out.print(n+suffix[lastDigit-1]);
        
    }
}
