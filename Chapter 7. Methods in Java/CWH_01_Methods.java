/**
 * CWH_01_Methods
 */
class Methods {
    int mul(int a , int b){
        int c = a*b;
        return c;
    }
    public static void main(String[] args) {
        int x = 6 , y = 9;
        Methods obj = new Methods();
        int multiply = obj.mul(x,y);  
        System.out.println(multiply);
    }
}