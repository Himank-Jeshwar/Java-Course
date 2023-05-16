public class LetterPattern {
    public static void main(String[] args) {
        String msg = "ICSE";
        for (int i = 1;i<=msg.length();i++){
            for (int j = 0;j<i;j++){
                System.out.print(msg.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}
