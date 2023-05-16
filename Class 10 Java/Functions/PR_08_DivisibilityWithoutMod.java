
class PR_08_DivisibilityWithoutMod{
    static boolean isDivisible (int fx,int gx){
        // if f(x) = g(x).q(x) = then g(x) is factor of f(x)
        return (fx==gx*(fx/gx)); // O(1)
    }
   
    public static void main(String[] args) {
        int a=720000,b=29;
        System.out.println(isDivisible(a, b));
    }
}