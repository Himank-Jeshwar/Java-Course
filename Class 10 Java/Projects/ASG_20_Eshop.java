import java.util.*;
class ASG_20_Eshop {
    String name;
    double price;

    void accept(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter name of the item : ");
        name = sc.nextLine();
        System.out.print("Enter price : ");
        price = sc.nextDouble();
    }

    void calculate(){
        double dis = 0.0; // declaration

        if (price>=1000)
            if (price<=25000)
                dis = price*5/100.0;
            else 
                if (price<=57000)
                    dis = price*7.5/100.0;
                else 
                    if (price<=100000)
                        dis = price*10/100.0;
                    else 
                        dis = price*15/100.0;
        price = price-dis; // net amount
    }

    void display(){
        System.out.println("Name of the item : "+name);
        System.out.println("Price of the item : Rs."+price);
    }

    public static void main(String[] args) {
        ASG_20_Eshop ob = new ASG_20_Eshop();
        ob.accept();
        ob.calculate();
        ob.display();    
    }    
}
