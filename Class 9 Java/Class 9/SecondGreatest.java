import java.io.*;
class SecondGreatest{
    public static void main()throws IOException{
        // declaration
        int a,b,c,sg;
        
        
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three numbers : ");
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        
        int g = Math.max(a,b);
        int y = Math.max(g,c);
        int g1 = Math.min(a,b);
        int y1 = Math.min(g1,c);
        
        int result = (a+b+c)-y-y1;
        // decision
        
        System.out.print("Second greatest number = "+result);
    }
}