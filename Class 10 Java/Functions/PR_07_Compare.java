class PR_07_Compare{
    void compare(int a,int b){
        System.out.println("Maximum of two numbers : "+Math.max(a,b));
    }
    void compare (char a,char b){
        char max = (char)(Math.max((int)a,(int)b));
        System.out.println("Character with higher numeric value : "+max);
    }
    void compare(String a,String b){
        int maxLength = Math.max(a.length(), b.length());
        if (maxLength==a.length())
            System.out.println("Longer string : "+a);
        else if (maxLength==b.length())
            System.out.println("Longer string : "+b);
        else {
            System.out.println("Both the strings are equal");
        }
    }
    public static void main(String[]args){
        PR_07_Compare cmp = new PR_07_Compare();
        cmp.compare(34,56);
        cmp.compare('A', 'y');
        cmp.compare("Explanation", "Satisfy");
    }
}