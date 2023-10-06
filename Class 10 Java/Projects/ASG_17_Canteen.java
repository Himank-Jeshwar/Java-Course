import java.util.*;
class ASG_17_Canteen{
    double b[],s[],n[],fr[]; // declaration
    public ASG_17_Canteen(){
        // allocating space
        b = new double[5];
        s = new double[5];
        n = new double[5];
        fr = new double[5];
    }

    void accept(){
        Scanner sc = new Scanner (System.in);
        for (int i = 0;i<5;i++){
            // inputs
            System.out.println("DAY - "+(i+1));
            System.out.print("Enter sales for burger : ");
            b[i] = sc.nextDouble();
            System.out.print("Enter sales for sandwiches : ");
            s[i] = sc.nextDouble();
            System.out.print("Enter sales for noodles : ");
            n[i] = sc.nextDouble();
            System.out.print("Enter sales for fried rice : ");
            fr[i] = sc.nextDouble();

            System.out.println(); // a new line after each day
        }
    }
    String popular(){
        // declaration
        String nm[] = {"Burger","Sandwiches","Noodles","Fried Rice"};
        String pop = "";
        double sum[] = new double [4];
        double max = 0.0;

        for (int i = 0;i<5;i++){
            sum[0]+=b[i];
            sum[1]+=s[i];
            sum[2]+=n[i];
            sum[3]+=fr[i];
        }

        // finding most popular item
        for (int i = 0;i<4;i++){
            if (sum[i]>max){
                max = sum[i];
                pop = nm[i];
            }
        }
        return pop;
    }

    double netSales(){
        double ns = 0.0; // declaration

        // calculating net sales
        for (int i = 0;i<5;i++)
            ns+=b[i]+s[i]+n[i]+fr[i];

        return ns;
    }

    public static void main(String[] args) {
        // instantiation
        ASG_17_Canteen ob = new ASG_17_Canteen();
        ob.accept();

        // output
        System.out.println("Net sales for the week : Rs."+ob.netSales());
        System.out.println("Most popular item : "+ob.popular());
    }
}