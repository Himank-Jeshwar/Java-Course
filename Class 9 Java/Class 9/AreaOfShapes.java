import java.io.*;
public class AreaOfShapes {
    int ch;
    void input()throws IOException{
        double b,h,sideOfTriangle,sideOfSquare,l,w,r;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Press 1 to calculate area for Right-angled Triangle\nPress 2 to calculate area for Equilateral Triangle\nPress 3 to calculate area of Square\nPress 4 to calculate area of Rectangle\nPress 5 to calculate area of Circle");
        ch = Integer.parseInt(br.readLine());
        switch(ch){
            case 1:
                System.out.print("Enter base (in cm) = ");
                b = Double.parseDouble(br.readLine());
                System.out.print("Enter height (in cm) = ");
                h = Double.parseDouble(br.readLine());
                areaOfRightTriangle(b, h);
                break;
            case 2:
                System.out.print("Enter side of the triangle (in cm) = ");
                sideOfTriangle = Double.parseDouble(br.readLine());
                areaOfEquilateralTriangle(sideOfTriangle);
                break;
            case 3:
                System.out.print("Enter side of square (in cm) = ");
                sideOfSquare = Double.parseDouble(br.readLine());
                areaOfSquare(sideOfSquare);
                break;
            case 4:
                System.out.print("Enter length of rectangle (in cm) = ");
                l = Double.parseDouble(br.readLine());
                System.out.print("Enter width of rectangle (in cm) = ");
                w = Double.parseDouble(br.readLine());
                areaOfRectangle(l,w);
                break;
            case 5:
                System.out.print("Enter radius of circle (in cm) = ");
                r = Double.parseDouble(br.readLine());
                areaOfCircle(r);
                break;
            default:
                System.out.println("INVALID CHOICE !");
        }
    }
    void areaOfRightTriangle(double base,double height){
        double areaOfRAT = 0.0;
        areaOfRAT = base*height/2;
        System.out.print("Area of right-angled triangle = "+areaOfRAT+" sq.cm");
    }
    void areaOfEquilateralTriangle(double side){
        double areaOfET = 0.0;
        areaOfET = Math.sqrt(3)*Math.pow(side,2)/4;
        System.out.print("Area of equilateral triangle = "+areaOfET+" sq.cm");
    }
    void areaOfSquare(double side){
        double squareArea = 0.0;
        squareArea = side*side;
        System.out.print("Area of square = "+squareArea+" sq.cm");
    }
    void areaOfRectangle(double length,double width){
        double rectArea = 0.0;
        rectArea = length*width;
        System.out.print("Area of rectangle = "+rectArea+" sq.cm");
    }
    void areaOfCircle(double radius){
        double circleArea = 0.0;
        circleArea = Math.pow(radius,2)*3.1416;
        System.out.print("Area of circle = "+circleArea+" sq.cm");
    }
    public static void main(String[] args) throws IOException{
        AreaOfShapes shapes = new AreaOfShapes();
        shapes.input();
    }
}
