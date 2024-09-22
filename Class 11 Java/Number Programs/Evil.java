import java.util.*;
class Evil {
    private int nnum;
    private long bin;

    public Evil(){
        nnum = 0;
        bin = 0L; 
    }

    void acceptNum(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        nnum = Math.abs(sc.nextInt());
    }

    void rec_bin(int x){
        int i = 1;        
        while (x!=0){
            bin = (x%2)*i+bin;
            x/=2;
            i*=10;
        }

        System.out.println("Binary equivalent : "+bin);
    }

    void check(){
        int c = 0;
        rec_bin(nnum);

        long copy = bin;

        while(copy!=0){
            if (copy%10==1)
                c++;
            copy/=10;
        } 

        if (c%2==0)
            System.out.println(nnum+" is an Evil Number.");
        else
            System.out.println(nnum+" is NOT an Evil Number.");
    }

    public static void main(String args[]){
        Evil ob = new Evil();
        ob.acceptNum();
        ob.check();
    }
}
