import java.util.*;
class PR_04_ShowRoom{
    // declaration
    String name;
    long mobno;
    double cost,dis,amount;

    PR_04_ShowRoom(){
        // initialization
        name = null;
        mobno = 0L;
        cost = 0.0;
        dis = 0.0;
        amount = 0.0;
    }

    void input(){
        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        name = sc.nextLine();
        System.out.print("Enter mobile number : ");
        mobno = sc.nextLong();
        System.out.print("Enter cost price (in Rs.) : ");
        cost = sc.nextDouble();
    }

    void calculate(){
        // decision
        if (cost<=10000)
            dis = cost*5/100.0;
        else if (cost<=20000)
            dis = cost*10/100.0;
        else if (cost<=35000)
            dis = cost*15/100.0;
        else
            dis = cost*20/100.0;

        amount = cost-dis; // final amount
    }

    void display(){
        // output
        System.out.println("Name : "+name+"\nMobile number : "+mobno);
        System.out.println("Amount after discount : Rs. "+amount);
    }

    public static void main(String[] args) {
        // instantiation
        PR_04_ShowRoom sRoom = new PR_04_ShowRoom();
        sRoom.input();
        sRoom.calculate();
        sRoom.display();
    }
}