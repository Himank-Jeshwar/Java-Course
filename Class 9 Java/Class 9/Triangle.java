import java.io.*;
class Triangle{
    public static void main ()throws IOException{
        // declaration
        int a,b,c;
        
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three angles : ");
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        
        // decision
        if (a+b+c==180){
            if (a<90&&b<90&&c<90)
                System.out.print("Acute-angled triangle");
            else if ((a>90&&b<90&&c<90)||(a<90&&b>90&&c<90)||(a<90&&b<90&&c>90))
                System.out.print("Obtuse-angled triangle");
            else if (a==90||b==90||c==90)
                System.out.print("Right-angled triangle");
            }
        else
            System.out.print("A Triangle is not possible");
        
    }
}