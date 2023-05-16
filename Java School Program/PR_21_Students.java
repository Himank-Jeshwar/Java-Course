public class PR_21_Students {
    public static void main(String[] args) {
        int total = 400;
        int l1 = (63*total)/100;
        int rm = total-l1;
        int l2 = rm/4;
        int left = rm-l2;
        System.out.print("Students left now = "+left);
    }
}
