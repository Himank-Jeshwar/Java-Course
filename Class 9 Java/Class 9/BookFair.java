import java.io.*;
class BookFair {
    public static void main(String[] args)throws IOException {
        // declaration
        String Bname; double price;

        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name of the book - ");
        Bname = br.readLine();
        System.out.print("Enter the price of the book - ");
        price = Double.parseDouble(br.readLine());

        // decision and calculations
        if (price<=1000)
            price-=price*2/100;
        else
            if(price<=3000)
                price-=price*10/100;
            else
                price-=price*15/100;
        System.out.print("\nName of the book - "+Bname+"\nPrice after discount - Rs."+price);

    }
}
