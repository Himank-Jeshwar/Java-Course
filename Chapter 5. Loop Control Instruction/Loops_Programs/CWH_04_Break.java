package Loops_Programs;

public class CWH_04_Break {
    public static void main(String[] args) {
        System.out.println("Break Statement in For Loop :-");
        for (int i = 0; i<=5 ; i++){
            System.out.println(i);
            if (i==2){
                break;
            }
        }
        // System.out.println("Break Statement in While Loop :-");
        // int x = 0;
        // while (x<=5){
        //     System.out.println(x);
        //     if (x==2) {
        //         break;
        //     }
        //     x++;
        
        // System.out.println("Break Statement in Do-While Loop :-");
        // int y = 0;
        // do {
        //     System.out.println(y);
        //     if (y==3){
        //         break;
        //     }
        //     y++;
        //     }while (y<=5);
           
    }
}