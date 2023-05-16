class StarPattern1 {
    public static void main(String[] args) {
        for (int rows = 0;rows<4;rows++){
            for (int cols = 0;cols<=rows;cols++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int rows = 0;rows<3;rows++){
            for (int cols = 3;cols>rows;cols--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
