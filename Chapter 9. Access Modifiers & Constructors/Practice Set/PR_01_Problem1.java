class Cylinder{
    private double radius,height;
    
    public void setRadius(double r){
        radius = r;
    }
    public void setHeight(double h){
        height = h;
    }
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
}
public class PR_01_Problem1 {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder();
        cyl.setRadius(8.5);
        cyl.setHeight(9.5);
        System.out.println("Radius = "+cyl.getRadius()+" cm");
        System.out.println("Height = "+cyl.getHeight()+" cm");
    }
}