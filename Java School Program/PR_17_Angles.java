public class PR_17_Angles {
   public static void main(String[] args) {
       int a = 14 , b = 6 , c = 8 , d = 10;
       int sum = a+b+c+d;
       double angleA = (a*360.0)/sum;
       double angleB = (b*360.0)/sum;
       double angleC = (c*360.0)/sum;
       double angleD = (d*360.0)/sum;
       System.out.print("Angle a = "+angleA+" degree\tAngle B = "+angleB+" degree\nAngle C = "+angleC+" degree\t Angle D = "+angleD+" degree");
   } 
}
