// volume of cuboid = base area * height
// Total surface area of cuboid 
// = perimeter*h + area*2 or lateral surface area * height + area*2
// Lateral surface area of cuboid = perimeter*h
package Practice_Set;
class Rectangle{
    double length,breadth;
    Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double baseArea(){
        return this.length*this.breadth;
    }
    double perimeter(){
        return 2*(length+breadth);
    }
}
class Cuboid extends Rectangle{
    double height;
    Cuboid(double length,double breadth,double height){
        super(length,breadth);
        this.height = height;
    }
    double volume(){
        return baseArea()*this.height;
    }
    double lateralSurfaceArea(){
        return perimeter()*height;
    }
    double totalsurfaceArea(){
        return lateralSurfaceArea() + baseArea()*2;
    }
}
public class PR_02_Cuboid_inherits_Rectangle {
    public static void main(String[] args) {
        Cuboid cub = new Cuboid(2, 4, 6);
        Rectangle rec = new Rectangle(9, 2);
        System.out.println(cub.lateralSurfaceArea());
        System.out.println(rec.perimeter());
    }
}
