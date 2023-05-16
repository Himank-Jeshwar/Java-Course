class Cylinder2{
    private double radius,height;
    private double surfaceArea;
    private double volume;    
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
        volume = Math.PI*radius*radius*height;
        return volume;
    }
    public double getSurfaceArea(){
        surfaceArea = 2*Math.PI*radius*(radius+height);
        return surfaceArea;
    }
}
public class PR_02_Problem2 {
    public static void main(String[] args) {
        Cylinder2 cyl = new Cylinder2();
        cyl.setRadius(9);
        cyl.setHeight(12);
        System.out.println("Radius = "+cyl.getRadius()+" cm");
        System.err.println("Height = "+cyl.getHeight()+" cm");
        System.out.println("Surface Area = "+cyl.getSurfaceArea()+" sq. cm");
        System.err.println("Volume = "+cyl.getVolume()+" cubic cm");
    }
}
