import java.util.*;
class TrignometricFunctions {
    static int factorial (int n){
        int f = 1;
        for (int i = 1;i<=n;i++)
            f*=i;
        return f;
    }

    static double sine(double degrees){
        double radians = Math.PI*degrees/180.0;
        double sin = radians;

        int i = 1;
        double n = 0;
        int f = 1;
        while(f<999999){  //factorial significant up to 6 max digits
            f = factorial(2*i+1);
            n = Math.pow(radians,2*i+1);
            if (i%2==1) // if odd
                sin-=n/f;
            else // if even
                sin+=n/f;
            i++;
        }
        return sin;
    }

    static double cosine(double degree){
        double radians = Math.PI*degree/180.0;
        double cos = 1;

        int f = 1,i=1;
        double n=0;
        while (f<999999){
            n = Math.pow(radians, 2*i);
            f = factorial(2*i);
            
            if (i%2==1)
                cos-=n/f;
            else
                cos+=n/f;
            i++;
        }
        return cos;
    }

    static double tangent(double degrees){
        return sine(degrees)/cosine(degrees);
    }
    public static void main(String[] args) {
        System.out.println(sine(0));
        System.out.println(cosine(0));
        System.out.println(tangent(0));
    }
}
