class Circle{
    float radius;
    float area(){
        return 22*radius*radius/7;
    }
    float circumference(){
        return 2*22*radius/7;
    }
}
public class PR_06_Problem6 {
    public static void main(String[] args) {
        Circle cr = new Circle();
        cr.radius=6;
        System.out.println("Area = "+cr.area()+" sq.cm");
        System.out.println("Circumference = "+cr.circumference()+" cm");
    }    
}
