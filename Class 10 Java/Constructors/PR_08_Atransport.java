import java.util.*;
class PR_08_Atransport {
    String name;
    int w,charge;

    void accept(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter name : ");
        name = sc.nextLine();

        System.out.print("Enter weight : ");
        w = sc.nextInt();

    }

    void calculate(){

        if (w<=10)
            charge = 25*w;
        else 
            if (w<=30)
                charge = 25*10 + 20*(w-10);
            else
                charge = 25*10 + 20*20 + 10*(w-30);
        
        // calculating and adding surchage
        charge+=charge*5/100;
    }

    void print(){
        System.out.println("Name\tWeight\tBill amount");
        System.out.println(name+"\t"+w+"\t"+charge);
    }
    public static void main(String[] args) {
        PR_08_Atransport ob = new PR_08_Atransport();
        ob.accept();
        ob.calculate();
        ob.print();
    }
}
