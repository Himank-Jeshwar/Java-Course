import java.util.*;
class PR_07_SortingUsingCompareTo {
    public static void sort(String names[],String telephone[]){
        int index;
        String temp1,temp2;
        for (int i = 0;i<names.length;i++){
            index = i;
            for (int j = i+1;j<names.length;j++){
                if (names[j].compareTo(names[index])<0)
                    index = j;
            }
            temp1 = names[index];
            names[index]=names[i];
            names[i]=temp1;

            temp2 = telephone[index];
            telephone[index]=telephone[i];
            telephone[i]=temp2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names[]=new String[10],telephoneNos[]=new String[20];
        
        for (int i = 0;i<names.length;i++){
            System.out.print("Enter the user name : ");
            names[i]=sc.nextLine();
            System.out.print("Enter telephone number : ");
            telephoneNos[i]=sc.nextLine();
        }

        //sorting names
        sort(names,telephoneNos);
        
        System.out.println("\nOUTPUT:-");
        for(int j = 0;j<names.length;j++){
            System.out.println("Name - "+names[j]);
            System.out.println("Telephone no. - "+telephoneNos[j]+"\n");
        }
    }    
}
