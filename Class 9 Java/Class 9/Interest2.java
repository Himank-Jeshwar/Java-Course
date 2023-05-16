import java.io.*;
class Interest2{
    double p,r,t;
    void input()throws IOException{
        int choice;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter principal (in Rs) = ");
        p = Double.parseDouble(br.readLine());
        System.out.println("PRESS 1 for S.I\nPRESS 2 for C.I");
        choice = Integer.parseInt(br.readLine());
        switch(choice){
            case 1:
                sInterest();
                break;
            case 2:
                cInterest();
                break;
            default:
                System.out.print("INVALID CHOICE");
        }
    }
    void sInterest(){
        t = 5.0;r = 15.75;
        double amtBySI = p+(p*r*t)/100;
        System.out.print("Amount by S.I = Rs."+amtBySI);
    }

    void cInterest(){
        t = 5.0;r=15.75;
        double amtByCI = p*Math.pow(1+r/100,t);
        System.out.println("Amount by C.I = Rs."+amtByCI);
    }
    public static void main(String[]args)throws IOException{
        Interest2 ist2 = new Interest2();
        ist2.input();
    }
}

/*
 * DATA LIST
 * Name | Type | Use
 * =================
 * p    |double|
 */