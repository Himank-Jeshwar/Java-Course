class ASG_2_Random{
    public static void main(String[] args) {
        // declaration
        int n = (int)(Math.random()*(650-500)+500);
        
        // condition
        String msg = (n%5==0)?"Divisible by 5":(n%2==0)?"IS EVEN":"IS ODD";
        
        // output
        System.out.println("Random number : "+n);
        System.out.println(msg);
    }
}