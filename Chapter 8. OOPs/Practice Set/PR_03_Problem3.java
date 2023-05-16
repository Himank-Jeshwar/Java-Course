class Square {
    float side;
    float area(){
        return side*side;
    }
    float perimeter(){
        return side*4;
    }
}
public class PR_03_Problem3 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side=9;
        System.out.println("Area = "+sq.area()+" sq.cm");       
        System.out.println("Perimeter = "+sq.perimeter()+" cm"); 
    }
}
