import java.util.*;
public class PR_03_SortAlpha {
    String sent;
    int n;

    public PR_03_SortAlpha(){
        sent = "";
        n = 0;
    }

    void acceptsent(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter sentence : ");
        sent = sc.nextLine().toUpperCase();
        n = sent.split(" ").length;
    }

    void sort(PR_03_SortAlpha P){
        String sorted = "",key = "";
        String sortedWords[] = new String[n];
        int i=0,j = 0;
        
        sortedWords = P.sent.split(" ");

        // insertion sort
        for (i=1;i<n;i++){
            key = sortedWords[i];
            j = i-1;

            while(j>=0 && sortedWords[j].compareTo(key)>0){
                sortedWords[j+1] = sortedWords[j];
                j--;
            }
            sortedWords[j+1] = key;
        }

        for (i=0;i<n;i++)
            sorted+=sortedWords[i]+" ";

        this.sent = sorted;
    }

    void display(){
        PR_03_SortAlpha P = this;
        System.out.println("Original sentence : "+P.sent);
        sort(P);
        System.out.println("Sorted sentence : "+sent);
    }
}
