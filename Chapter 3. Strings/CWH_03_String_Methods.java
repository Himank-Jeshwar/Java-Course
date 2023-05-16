public class CWH_03_String_Methods {
    public static void main(String[] args) {
        
        // DECLARATION OF STRINGS
        String name2 = new String("      Rohit      ");
        String name = "Himank";
        String word = "heel";
        String word2 = "Hlleorl";
        // (1) length() - returns the length of the string 
        int len = name.length(); 
        System.out.format("(1) Length of word '%s' = %d", name, len);
        System.out.println();
        
        // (2) toLowerCase() - returns string in lowercase
        String lowerString = name.toLowerCase(); 
        System.out.format("(2) String '%s' in lowercase = %s",name ,lowerString);
        System.out.println();

        // (3) toUpperCase() - returns string in UPPERCASE
        String UpperCase = name.toUpperCase();
        System.out.format("(3) String '%s' in UPPERCASE = %s",name ,UpperCase);
        System.out.println();
        
        /* (4) trim() - returns string without extra spaces 
        at starting and end */
        
        String trimmedName = name2.trim();
        System.out.format("(4) String '%s' without spaces = '%s' ",name2,trimmedName);
        System.out.println(); 
        
        /*(5) Substring () */
        /*(5i) substring (int start) - returns a substring from 
        start to end. */
        String pString = name.substring(3);
        System.out.println("(5i) Substring of index 3 to end = "+pString);
        /* (5ii) substring (int start , int end) - returns a 
        substring from specified start index to specified end index. */
        String dString = name.substring(1,4);
        System.out.println("(5ii) Substring of index 1 to 3 to end = "+dString);

        /* (6) replace(oldword,newWord) - returns a new string 
        after replacing oldword with newWord. */
        String rString = word.replace("eel","ell");
        System.out.format("(6) Replaced word for '%s' is '%s' ",word,rString);
        System.out.println();

        /* (7) startswith(String "letters") -> returns true if string startswith 
        with the specified argument. */
        boolean cString = trimmedName.startsWith("R");
        System.out.println("(7) Answer of startswith = "+cString);

        /* (8) endswith(String "letters") ->returns true if string endswith 
        with the specified argument. */
        boolean nString = name.endsWith("Hi");
        System.out.println("(8) Answer of endswith   = "+nString);

        /* (9) charAt(int index) - returns the character at specified
        index. */
        int index = 3;
        char letter = name.charAt(index);
        System.out.format("(9) Character at index %d is '%c' ",index,letter);
        System.out.println();

        // (10) indexOf() method 
        /* (10i) indexOf(String "letter") - returns the index of a 
        given string. */ 
            String letter2 = "e";
            int qr = word.indexOf(letter2);
            System.out.format("(10i) Index of '%s' in word '%s' = %d ",letter2,word,qr);
            System.out.println();
        /* (10ii) indexOf(string "char",int index) - returns the 
        index of the given string starting from the given index no. */
            int sr = name.indexOf("m",2);
            System.out.format("(10ii) Index of %s in word %s is %d","m",name,sr);
            System.out.println();

        // (11) lastIndexOf ()  
        /* (11i) lastIndexOf(String "n") - returns the last index 
        of a given string */
        System.out.println("(11i) Index number of last occurence of 'e' = "+word.lastIndexOf("e"));
        
        /* (11ii) lastIndexOf(String "n",int index) -returns the last 
        index of a given string before the given index No. */
        System.out.println("(11ii) Index number of last occurence of 'e' = "+word2.lastIndexOf("e",4));
        
        /* (12) equals()-returns true if the string is equal 
        to the given string. */ 
        boolean y = word.equals("Heel");
        System.out.println("(12) Word is Equal ? --> "+y);

        /* (13) equalsIgnoreCase () - returns true if the string is 
        equal to the given string ignoring case-sensitivity. */
        boolean x = word.equalsIgnoreCase("hEeL");
        System.out.println("(13) Word is Equal ? --> "+x);
}
}
