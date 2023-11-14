import java.util.*;
class PR_46_ContinuousSubArraySum {
    public static void main(String[] args) {
        int a[],n,num,s=0;
        String subArr = "";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        n = sc.nextInt();
        System.out.print("Enter a number : ");
        num = sc.nextInt();

        a = new int[n];

        // input for array
        System.out.println("Enter elements : ");
        for (int i = 0;i<n;i++)
            a[i] = sc.nextInt();

        
        // continuous sub array sum
        outer:
        for (int i = 0;i<n;i++){
            s = 0;
            subArr = "";
            for (int j = i;j<n;j++){
                // System.out.print(a[j]+" ");
                s+=a[j];
                subArr+=a[j]+" ";
                
                if (s==num){
                    System.out.println("SubArray whose sum is "+num+" : ");
                    System.out.print(subArr);
                    break outer;
                }
                
                // System.out.println(a[i]+" "+a[j]+" "+s);
                // System.out.println(a[j]);
                // System.out.println(s);
                // System.out.println(subArr);
            }

            // System.out.println("Sum is : "+s);

        }

    }    
}
