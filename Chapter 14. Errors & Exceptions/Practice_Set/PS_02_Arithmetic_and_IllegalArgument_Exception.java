public class PS_02_Arithmetic_and_IllegalArgument_Exception {
    static int getTimePeriod(int l,int g)throws IllegalArgumentException {
        if (l==0)
            throw new IllegalArgumentException();
        else{
            return (int)(2*Math.PI*Math.sqrt(l/g));
        }
    }
    public static void main(String[] args) {
        try{
            System.out.print(getTimePeriod(0,4));
        }
        catch(IllegalArgumentException argException){
            System.out.println("HeHe");
        }
        catch(ArithmeticException arthException){
            System.out.println("HaHa");
        }
    }
}
