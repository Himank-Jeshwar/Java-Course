import java.util.Scanner;

class PR_10_SortingNames {
    public static void main(String[] args) {
        String names[] = new String[20],temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 names :-");
        
        // taking input
        for (int i = 0;i<names.length;i++){
            names[i]=sc.next();
        }

        // sorting
        for (int i = 0;i<names.length;i++){
            for (int j = 0;j<names.length-1;j++){
                if ((names[j].compareTo(names[j+1]))>0){
                    temp = names[j];
                    names[j]=names[j+1];
                    names[j+1]=temp;
                }
            }
        }

        System.out.println("\nOUTPUT : ");
        for (int k = 0;k<names.length;k++){
            System.out.println(names[k]);
        }
    }    
}
