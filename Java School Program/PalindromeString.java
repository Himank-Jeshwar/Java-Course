class PalindromeString {
    static String revString(String str){
        String rev = "";
        for (int i = str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }        
        return rev;
    }
    public static void main(String[] args) {
        System.out.print(revString("Himank"));
    }    
}
