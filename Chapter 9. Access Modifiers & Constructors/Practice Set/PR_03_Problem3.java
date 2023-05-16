class Cylinder3{
    private double radius,height;
    private double surfaceArea;
    private double volume;    
    public Cylinder3(double r , double h){
        radius = r;
        height = h;
    }
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
    public double getVolume(){
        volume = 22*radius*radius*height/7;
        return volume;
    }
    public double getSurfaceArea(){
        surfaceArea = 2*22*radius*(radius+height)/7;
        return surfaceArea;
    }
}
public class PR_03_Problem3 {
    public static void main(String[] args) {
        Cylinder3 cyl = new Cylinder3(9,12);
        // cyl.setRadius(8);
        // cyl.setHeight(9);
        System.out.println("Radius = "+cyl.getRadius()+" cm");
        System.err.println("Height = "+cyl.getHeight()+" cm");
        System.out.println("Surface Area = "+cyl.getSurfaceArea()+" sq. cm");
        System.err.println("Volume = "+cyl.getVolume()+" cubic cm");
    }
}
