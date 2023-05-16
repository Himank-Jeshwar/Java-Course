class Sphere{
    private double radius,height;
    private double volume,surfaceArea;
    public Sphere(){
        radius = 4;
        height = 5;
    }
    public Sphere (double radius,double height){
        this.radius = radius;
        this.height = height; 
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
    public double getSurfaceArea(){
        surfaceArea = 4*Math.PI*radius*radius;
        return surfaceArea;
    }
    public double getVolume(){
        volume = 4*Math.PI*Math.pow(radius,3)/3;
        return volume;
    }
}
public class PR_05_Problem5 {
    public static void main(String[] args) {
        Sphere sp = new Sphere(88,99);
        // sp.setRadius(8.5);
        // sp.setHeight(9.5);
        System.out.println("Radius = "+sp.getRadius()+" cm");
        System.out.println("Height = "+sp.getHeight()+" cm");
        System.out.println("Surface Area = "+sp.getSurfaceArea()+" sq. cm");
        System.err.println("Volume = "+sp.getVolume()+" cubic cm");
    }
}