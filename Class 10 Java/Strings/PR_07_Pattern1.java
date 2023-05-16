public class PR_07_Pattern1 {
    public static void main(String[] args) {
        String str = "ABCDE";
        String str1 = str;
        for (int i = 0;i<str.length();i++){
            System.out.println(str1);
            str1 = str.substring(0,str.length()-i-1) + str.substring(0,i+1);
        }
    }
}
