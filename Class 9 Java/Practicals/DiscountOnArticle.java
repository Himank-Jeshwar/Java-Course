import java.io.*;
class DiscountOnArticle {
    public static void main(String[] args)throws IOException {
        // declaration
        double price,p1,p2,p3,dis1,dis2,dis3;

        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the price of the article (in Rs.) = ");
        price = Double.parseDouble(br.readLine());

        // calculation
        dis1 = price*0.3;
        p1 = price-dis1;
        dis2 = price*0.2;
        p2 = price-dis2;
        dis3 = p2*0.1;
        p3  = price-(dis2+dis3);

        // output
        System.out.println("Price after 30 % discount = Rs."+p1+"\n30 % discount = "+dis1);
        System.out.println("Price after 20 % and 10 % discount = "+p3);
        System.out.println("20 % discount = "+dis2+"\n10 % discount = "+dis3);
    }    
}
