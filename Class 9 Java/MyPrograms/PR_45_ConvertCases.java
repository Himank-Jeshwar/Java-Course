// without using toUpperCase() and toLowerCase()
import java.util.*;
class PR_45_ConvertCases {
    static String upper(String s){
        String upString = ""; 
        for (int i = 0;i<s.length();i++){
            int j = 0;
            for (;j<26;j++){

            /* if any lower case alphabet exists replace it with its 
            corresponding upper case alphabet, if any lower case character exists
            it will replace and terminate the inner loop (and so j<26). In case 
            no lower case character exists then : j=26, meaning that inner loop
            executed completely and no lower case character was found.*/
                if ((char)(97+j)==s.charAt(i))
                {
                    upString+=(char)(65+j);
                    break;
                }  
            }

            /* if no lower case letter exists then concatenate the same
            character at index i in the new string (eg. uppercase,symbols,numbers) */
            if (j==26)
                upString+=s.charAt(i);

        }
        return upString;
    }
    static String lower(String s){
        String upString = ""; 
        for (int i = 0;i<s.length();i++){
            int j = 0;
            for (;j<26;j++){

                /* if any upper case alphabet exists replace it with its 
            corresponding upper case alphabet, if any upper case character exists
            it will replace and terminate the inner loop (and so j<26). In case 
            no upper case character exists then : j=26, meaning that inner loop
            executed completely and no upper case character was found.*/
                if ((char)(65+j)==s.charAt(i))
                {
                    upString+=(char)(97+j);
                    break;
                }  
            }

            /* if no upper case letter exists then concatenate the same
            character at index i in the new string (eg. lowercase,symbols,numbers) */
            if (j==26)
                upString+=s.charAt(i);

        }
        return upString;
    }
    public static void main(String[] args) {
        // declaration
        String str;
        int ch;

        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choice : ");
        ch = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a sentence below : -");
        str = sc.nextLine();

        // converting
        switch(ch){
            case 1:
                System.out.println(upper(str));
                break;
            case 2:
                System.out.println(lower(str));
                break;
                
            default:
                System.out.println("INVALID INPUT !");
            }
    }    
}
