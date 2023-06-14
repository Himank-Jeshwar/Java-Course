class Account {
    int acno;
    float balance;

    Account (){
        // default constructor
    }
    
    Account (int a,int b){
        // initializing
        acno = a;
        balance = b;
    }

    void withdraw(int w){
        // checking whether withdrawal amount exceeds balance
        if (w>balance)
            System.out.println("Insufficient Balance.");
        else 
            balance-=w;
    }

    void deposit (int d){
        balance+=d; // taking deposit
    }
}

class Calculate extends Account{
    // declaration
    int r,t; 
    float si,amt;

    Calculate(){
        // default constructor
    }
    Calculate(int a,int b){
        super(a, b); // passing to base class constructor
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
        // instantiation
        Calculate cal = new Calculate(39381,396);

        cal.deposit(1920);
        cal.accept(5, 2);
        cal.compute();
        cal.display();
    }
}