import java.util.*;
class PR_43_Name{
    public static void main(String[] args) {
        char l[],temp;
        String n;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your first name : ");
        n = sc.next();

        l = new char[n.length()];

        for (int i = 0; i < l.length; i++) 
            l[i]=n.charAt(i);

        // sorting in bubble sort
        for (int i = 0;i<l.length;i++){
            for (int j = 0;j<l.length-i-1;j++){
                char ch1 = Character.toLowerCase(l[j]);
                char ch2 = Character.toLowerCase(l[j+1]);
                if (ch1>ch2){
                    temp = l[j+1];
                    l[j+1] = l[j];
                    l[j] = temp;
                }
            }
        }

        // printing
        System.out.print("Sorted array : ");
        for (int i = 0;i<l.length;i++)
            System.out.print(l[i]+" ");
        System.out.println();
        
        System.out.print("Name - "+n);
    }
}