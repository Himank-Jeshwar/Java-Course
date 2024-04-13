class PR_09_test
{
    void change (int a){
        a = 34;
    }

    void change (Integer a){
        a = 67;
    }

    void change (String s){
        s = new String ("Jeshwar");
    }
    public static void main  (String args[]){
        Integer a = 56;
        String s = new String("Himank");

        int b = 23;
        PR_09_test ob = new PR_09_test();

        ob.change (a);
        ob.change (b);
        ob.change(s);
        System.out.println("int b = "+b);
        System.out.println("Integer a = "+a);
        System.out.println("string = "+s);
        // int b = 23
        // Integer a = 67
    }
}