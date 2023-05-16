class Rectangle{
    double length,breadth;
    public Rectangle(){
        length = 4;
        breadth = 5;
    }
    public Rectangle(double l, double b){
        length = l;
        breadth = b;
    }
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
}
public class PR_04_Problem4 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(12,56);
        System.out.println("Length : "+rec.getLength()+" cm");
        System.out.println("Breadth : "+rec.getBreadth()+" cm");
    }
}
