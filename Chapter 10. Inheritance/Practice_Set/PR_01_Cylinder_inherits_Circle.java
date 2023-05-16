package Practice_Set;
class Circle{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    double baseArea (){
        return Math.PI*radius*radius;
    }
    public double circumference(){
        return 2*Math.PI*this.radius;
    }
}
class Cylinder extends Circle{
    double height;
    Cylinder(double radius,double height){
        super(radius);
        this.height = height;
    }
    public double surfaceArea() {
        return circumference()*this.height+circumference()*this.radius;
    }
    public double volume() {
        return baseArea()*this.height;
    }
    public double lateralSurfaceArea(){
        return circumference()*this.height;
    }
}
public class PR_01_Cylinder_inherits_Circle {
    public static void main(String[] args) {
        Cylinder cd = new Cylinder(8,9);
        Circle cir = new Circle(9);
        System.out.println(cir.baseArea());
        System.out.println(cd.lateralSurfaceArea());
    }
}