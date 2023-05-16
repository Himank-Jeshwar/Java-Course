class NegativeDimensionsException extends Exception{
    @Override
    public String toString(){
        return "NegativeDimensionsException: ";
    }

    @Override
    public String getMessage(){
        return toString()+"Dimensions cannot be negative or 0.";
    }
}
public class CWH_07_throw_and_throws {
    public static int divide(int a,int b)throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static double volumeOfCube(double l,double b,double h)throws NegativeDimensionsException{
        if (l<=0||b<=0||h<=0){
            throw new NegativeDimensionsException();
        }
        double volume = l*b*h;
        return volume;
    }
    public static void main(String[] args){
        try{
            int c = divide(6, 0);
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("can't divide with 0");
        }
        try{
            double v = volumeOfCube(-5,9,8);
            System.out.println(v);
        }
        catch(NegativeDimensionsException n){
            System.out.println(n.getMessage());
        }
        

    }
}