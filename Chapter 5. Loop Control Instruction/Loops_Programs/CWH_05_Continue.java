package Loops_Programs;

public class CWH_05_Continue {
    public static void main(String[] args) {
        // for (int o = 1; o<=6 ; o++){
        //     if (o==3){
        //         continue;
        //     }
        //     if (o==4){
        //         continue;
        //     }
        //     System.out.println(o);
        // }
        int y = 1;
        do {
                if (y==4){
                    continue;
                }
                System.out.println(y);
                y++;
                }while (y<=6);
    }
}
