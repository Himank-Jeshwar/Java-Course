import java.util.Scanner;
class PR_10_MergingElements {
    public static void main(String[] args) {
        // declaration
        int P[] = new int [6],Q[]=new int[4],R[] = new int [P.length+Q.length];

        // inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter for P : ");
        for (int i = 0;i<P.length;i++){
            System.out.print("Enter the element: ");
            P[i]=sc.nextInt();
        }

        System.out.println("Enter for Q : ");
        for (int i = 0;i<Q.length;i++){
            System.out.print("Enter the element: ");
            Q[i]= sc.nextInt();
        }
        for (int j = 0,u = 0;j<R.length;j++){
            if (j<P.length)
                R[j]=P[j];
            else {
                R[j]=Q[u];
                u++;
            }
        }

        System.out.print("P[] = {");
        for (int i = 0;i<P.length;i++){
            System.out.print(P[i]);
            if (i<P.length-1)
                System.out.print(",");
        }
        System.out.println("}");

        System.out.print("Q[] = {");
        for (int i = 0;i<Q.length;i++){
            System.out.print(Q[i]);
            if (i<Q.length-1)
                System.out.print(",");
        }
        System.out.println("}");

        System.out.print("R[] = {");
        for (int i = 0;i<R.length;i++){
            System.out.print(R[i]);
            if (i<R.length-1)
                System.out.print(",");
        }
        System.out.println("}");
    }
}
