import java.io.*;
class Divisible_by_Five {
    public static void main(String[] args)throws IOException {
        int numbers [] = new int[50],c = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 50 numbers below :-");
        for (int i = 0;i<numbers.length;i++){
            numbers[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("Numbers ending with 5 : ");
        for (int el = 0;el<numbers.length;el++) {
            if (el%5==0)
                if (el%10==5)
                    System.out.print(el+" ");
                else
                    c++;

        }
        System.out.println();
        System.out.print("Number of integers ending with 0 : "+c);
    }    
}
