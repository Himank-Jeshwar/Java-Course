import java.util.*;
class ASG_16_SelectionSort {
    // declaration
    String words[];

    public ASG_16_SelectionSort(){
        words = new String[10];
    }
    void input (){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 10 words below : ");
        for (int i = 0;i<10;i++)
            words[i] = sc.next().toUpperCase(); // converting to upper case
    }

    void sort(){
        // declaration
        String t = "";
        int min = 0;

        // sorting in alphabetical order
        for (int i = 0;i<9;i++){
            min = i;
            for (int j = i+1;j<10;j++)
                if (words[j].compareTo(words[min])<0)
                    min = j;
            
            // swap
            t = words[i];
            words[i] = words[min];
            words[min] = t;
        }
    }

    void display(){
        for (int i = 0;i<10;i++)
            System.out.print(words[i]+" ");
    }
    public static void main(String[] args) {
        ASG_16_SelectionSort ob = new ASG_16_SelectionSort();
        ob.input();
        ob.display();

        System.out.println("\nSorted list of words :-");
        ob.sort();
        ob.display();        
    }    
}
