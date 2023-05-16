public class Quadrilateral {
    public static void main(String[] args) {
        int r1 = 3,r2 = 4,r3 = 5,r4 = 6,angle1,angle2,angle3,angle4;
        int sum = r1+r2+r3+r4;
        angle1 = r1*360/sum;
        angle2 = r2*360/sum;
        angle3 = r3*360/sum;
        angle4 = r4*360/sum;
        System.out.print("Angle 1 : "+angle1+" degrees\tAngle 2 : "+angle2+" degrees\nAngle 3 : "+angle3+" degrees\tAngle 4 : "+angle4+" degrees");
    }
}
