public class CWH_02_MethodTags {
     /**
     * Returns the product of a and b. 
     * @param a Value of a
     * @param b Value of b
     * @return Product of a and b
     * @throws Exception if b = 0
     */
    static int multiply(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        System.out.println(multiply(9,3));
    }
}
