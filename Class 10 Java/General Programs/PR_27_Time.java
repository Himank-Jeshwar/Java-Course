import java.util.*;
class PR_27_Time {
    public static void main(String[] args) {
        int sec,hr,min;

        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter seconds : ");
        sec = sc.nextInt();

        if (sec<0){
            System.out.println("Invalid input");
            System.exit(0);
        }
        
        hr = sec/3600;
        sec = sec%3600;
        min = sec/60;
        sec = sec%60;

        System.out.println(hr+" hours "+min+" minutes "+sec+" seconds");
    }   
}
