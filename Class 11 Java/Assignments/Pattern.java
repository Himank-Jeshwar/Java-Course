class Pattern{
    private int n;
    
    public Pattern(int x){
        n=x;
    }
    
    
    public static boolean isValid (int n){
        if (n<0){
            System.out.println("Negative Input !");
            return false;
        }
        else 
            if (n>10){
                System.out.println("Cannot be more than 10 !");
                return false;
            }
        return true;
    }
    
    void Floyd(){
        int k = 1;
        
        for (int i = 0;i<n;i++){
            for (int j = 0;j<=i;j++){
                System.out.print(k+"\t");
                k++;
            }
            System.out.println();
        }
    }
}