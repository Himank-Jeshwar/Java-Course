class PR_07_FascinatingNumbers {
    int n;

    public PR_07_FascinatingNumbers(int n){
        this.n = n;
    } 

    static boolean isValid (int n){
        if (n<100){
            System.out.println("NUMBERS LESS THAN 3-DIGIT ARE NOT ALLOWED !");
            return false;
        }
        return true;
    }

    boolean isFascinating(){
        String fascNumstr = n+""+n*2+""+n*3;
        int c = 0;
        
        for (char i = '1';i<='9';i++){
            c = 0;
            for (int j = 0;j<fascNumstr.length();j++){
                if (fascNumstr.charAt(j)==i)
                    c++;
            }
            if (c!=1)
                return false; 
        }
        return true;
    }

    void display(){
        if (isFascinating()==true)
            System.out.println(n+" is Fascinating number .");
        else 
            System.out.println(n+" is NOT a Fascinating number");
    }
}
