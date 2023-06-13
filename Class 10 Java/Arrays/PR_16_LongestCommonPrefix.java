import java.util.*;
class PR_16_LongestCommonPrefix {
    static boolean isPrefixForAll(String arr[],String prefix){
        int c = 0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i].startsWith(prefix))
                c++;
        }
        
        return (c==arr.length);
    }
    public static void main(String[] args) {
        String arr[] ;
        String prefix = "";
        String check = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        arr = new String [sc.nextInt()];
        System.out.println("Enter elements : ");
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.next();
        }

        for (int k = 0;k<arr[0].length();k++){
            check+=arr[0].charAt(k);
            if (isPrefixForAll(arr,check))
                prefix=check;
        }
        
        System.out.println("Prefix : "+prefix);
    }
}