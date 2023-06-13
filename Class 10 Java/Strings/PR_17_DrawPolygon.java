class PR_17_DrawPolygon {
    void polygon(){
        char ch = 'A';
        for (int i = 0;i<4;i++){
            for (int j = 0;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }        
    }

    void polygon(int n,char ch){
        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    void polygon(int x,int y){
        for (int i = 0;i<x;i++){
            for (int j = 0;j<y;j++){
                System.out.print('@'+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PR_17_DrawPolygon shape = new PR_17_DrawPolygon();
        shape.polygon();
        shape.polygon(8, '*');
        shape.polygon(5, 8);
    }    
}
