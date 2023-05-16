import java.io.*;
class Triangle{
    // declaring instance variables
    double hyp,base,ht;
    void input()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter base (in cm) = ");
        base = Integer.parseInt(br.readLine());
        System.out.print("Enter height (in cm) = ");
        ht = Integer.parseInt(br.readLine());
    }
    void display(){
        // declaration 
        double area = 0.0, perimeter = 0.0;
        hyp = Math.sqrt(ht*ht+base*base);
        
        // calculation of area and perimeter
        area = base*ht/2.0;
        perimeter = base+ht+hyp;
        
        // output
        System.out.print("Area = "+area+"sq.cm"+"\nPerimeter = "+perimeter+" cm");
    }
    
    public static void main()throws IOException{
        // object instantiation
        Triangle rightTriangle = new Triangle();
        
        rightTriangle.input();
        rightTriangle.display();
    }
}