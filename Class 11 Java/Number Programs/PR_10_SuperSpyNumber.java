class PR_10_SuperSpyNumber{
    int n;

    public PR_10_SuperSpyNumber(int n){
        this.n = n;
    }

    boolean isSuperSpy(){
        int s = 0,c = 0,copy = n;

        while (copy>0){
            s+=copy%10; // sum of digits
            c++; // counter for number of digits
            copy/=10;
        }
        return (s==c);
    }

    void display(){
        if (isSuperSpy()==true)
            System.out.println(n+" is a SUPERSPY number !");
        else
            System.out.println(n+" is not a SUPERSPY number!");
    }
}