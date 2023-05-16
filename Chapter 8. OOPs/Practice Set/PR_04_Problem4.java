class Rectangle{
    float length,breadth;
    float area(){
        return length*breadth;
    }
    float perimeter(){
        return 2*(length+breadth);
    }
}
public class PR_04_Problem4 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.length=4;
        rec.breadth=5;
        System.out.println("Area = "+rec.area()+" sq.cm");
        System.out.println("Perimeter = "+rec.perimeter()+" cm");

        
    }
}
