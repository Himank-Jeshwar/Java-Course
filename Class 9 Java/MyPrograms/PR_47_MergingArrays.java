import java.util.*;
class PR_47_MergingArrays{
    public static void main(String[] args) {
        // declaration
        int p[],q[],r[],lenp,lenq;

        //inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length for array p : ");
        lenp = sc.nextInt();
        System.out.print("Enter length for array q : ");
        lenq = sc.nextInt();

        // initializing length of arrays
        p = new int [lenp];
        q = new int [lenq];
        r = new int [lenp+lenq];

        for (int i = 0;i<r.length;i++){
            if (i<lenp){
                System.out.print("Enter element for p : ");   
                p[i] = sc.nextInt(); 
                r[i]=p[i];
            }

            else{
                System.out.print("Enter element for q : ");
                q[i-lenp] = sc.nextInt();
                r[i]=q[i-lenp];
            }

        }

        for (int el:r){
            System.out.print(el+" ");
        }

}
}