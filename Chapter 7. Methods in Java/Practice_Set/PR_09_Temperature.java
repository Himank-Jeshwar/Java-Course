public class PR_09_Temperature {
    static double celsiusTofahrenheit(double c){
        double f = c*9/5+32;
        return f;
    }
    public static void main(String[] args) {
        double celsius = 56;
        System.out.print("Temperature in fahrenheit = "+celsiusTofahrenheit(celsius));
    }
}
