class CheckZero {
    public static void main(String[] args) {
        System.out.print("Numbers which don't contain 0 at any position are :- ");
        for (int i = 100;i<=200;i++){
            if ((i/10)%10!=0&&i%10!=0)
                System.out.print(i+"  ");
        }
    }    
}
