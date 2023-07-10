import java.util.*;
class ThreeDigitNumber{
    public static void main(String[] args) {
        int a,b,c;
        int g = 0,l = 0,max = 0,min = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers between 1 to 9 : ");
        a = Math.abs(sc.nextInt());
        b = Math.abs(sc.nextInt());
        c = Math.abs(sc.nextInt());

        if (!(a<=9&&b<=9&&c<=9)){
            System.out.println("Numbers must be between 1 to 9");
            System.exit(0);
        }

        max = (a>Math.max(b,c)?a:Math.max(b,c));
        min = (a<Math.min(b,c)?a:Math.min(b,c));

        g = max*100;
        l = min*100;

        // for greatest
        if (a<max&&a>b)
            g = g+a*10+b;
        else if (b<max&&b>a)
            g = g+b*10+a;
        else if (c<max&&c>b)
            g = g+c*10+b;
        else if (a<max&&a>c)
            g = g+a*10+c;
        else 
            g = g+c*10+a;

        // for lowest number
        if (a>min&&a<b)
            l = l+a*10+b;
        else if (b>min&&b<a)
            l = l+b*10+a;
        else if (c>min&&c<b)
            l = l+c*10+b;
        else if (b>min&&b<c)
            l = l+b*10+c;
        else if (a>min&&a<c)
            l = l+a*10+c;
        else 
            l = l+c*10+a;

        System.out.println("Greatest number : "+g);
        System.out.println("Smallest number : "+l);
    }
}