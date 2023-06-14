import java.util.*;
class Sale{
    // declaration
    String title,author,publication;
    double price;

    void input(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter title : ");
        title = sc.nextLine();
        System.out.print("Enter author : ");
        author = sc.nextLine();
        System.out.print("Enter publication : ");
        publication = sc.nextLine();
        System.out.print("Enter price : ");
        price = sc.nextDouble();
    }

    void display(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Publication : "+publication);
        System.out.println("Price : "+price);
    }
}

class Purchase extends Sale{
    int noc,amount; // declaration
    
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of copies = ");
        noc = sc.nextInt();
    }

    void calculate(){
        // calculation
        amount = (int)(noc*price);
    }

    void show(){
        display(); // printing base class elements too.
        System.out.println("Number of copies purchased : "+noc);
        System.out.println("Amount to be paid : Rs."+amount);
    }
}

class PR_06_Sale{
    public static void main(String[] args) {
        // instantiation
        Purchase p = new Purchase();
        p.input();
        p.accept();
        p.calculate();
        p.show();
    }
}