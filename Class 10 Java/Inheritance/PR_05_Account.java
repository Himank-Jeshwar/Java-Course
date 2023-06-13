class Account {
    int acno;
    float balance;

    Account (){
        // default constructor
        balance = 0;
        acno = 0;
    }
    
    Account (int a,int b){
        acno = a;
        balance = b;
    }

    void withdraw(int w){
        if (w>balance)
            System.out.println("Insufficient Balance.");
        else 
            balance-=w;
    }

    void deposit (int d){
        balance+=d;
    }
}

class Calculate extends Account{
    int r,t;
    float si,amt;

    Calculate(int a,int b){
        super(a, b);
    }
    void accept(int x,int y){
        r = x;
        t = y;
        amt = 0;
    }   

    void compute(){
        si = (balance*r*t)/100;
        amt+=si;
    }

    void display (){
        System.out.println("Account number : "+acno);
        System.out.println("Balance : Rs."+balance);
        System.out.println("Interest : Rs."+si);
        System.out.println("Amount : Rs."+amt);
    }

}

class PR_05_Account{
    public static void main(String[] args) {
        Calculate cal = new Calculate(39381,396);

        cal.deposit(1920);
        cal.accept(5, 2);
        cal.compute();
        cal.display();
    }
}