import java.util.*;
class PR_46_Occurences {
    public static void main(String[] args) {
        int count = 0,n;
        String checked = "";
        int a[];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        n = sc.nextInt();

        a = new int[n];

        for (int i = 0;i<n;i++)
            a[i] = sc.nextInt();
        
        System.out.println("Frequency of each element : ");
        for (int i = 0;i<n;i++){
            count = 0;
            for (int j = 0;j<n;j++){
                if (a[i]==a[j])
                    count++;
            }
            if (checked.indexOf(a[i]+48)==-1){
                System.out.println(a[i]+" - "+count);
                checked+=a[i]+" ";
            }

        }
    }    
}
