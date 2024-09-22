import java.util.*;
class PR_05_Vectors{
    static double resultant (int a,int b,int angle){
        return Math.sqrt(a*a+b*b+2*a*b*(int)(Math.cos(Math.PI*angle/180.0)));
    }
    public static void main(String[] args) {
        double n = (int)(resultant(10, 10, 90)*100)/100.0;
        System.out.println(n);
    }
}