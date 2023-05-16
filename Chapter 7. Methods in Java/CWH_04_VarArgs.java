public class CWH_04_VarArgs {
    static int sum(int x,int...arr){
        int total = x;
        for(int el:arr){
            total+=el;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.print(sum(9,8));
    }
}
