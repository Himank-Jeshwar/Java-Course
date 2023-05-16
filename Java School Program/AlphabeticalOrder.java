import java.util.Scanner;
class AlphabeticalOrder {
    String names[];
    AlphabeticalOrder(){
        names = new String[20];
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 names :- ");
        for (int i = 0;i<names.length;i++){
            names[i] = sc.nextLine();
        }    
        sc.close();
     }

    void sort(){
        String temp;
        for (int i = 0;i<names.length;i++){
            for (int j = 0;j<names.length-i-1;j++){
                if ((int)(names[j].charAt(0))>(int)(names[j+1].charAt(0))){
                    temp = names[j];
                    names[j]=names[j+1];
                    names[j+1]=temp;
                }
            }
        }
        System.out.println("OUTPUT : ");
       for (String string : names) {
            System.out.println(string);
       }
    }
    public static void main(String[] args) {
        AlphabeticalOrder alphaOrder = new AlphabeticalOrder();
        alphaOrder.input();
        alphaOrder.sort();
    }
}
