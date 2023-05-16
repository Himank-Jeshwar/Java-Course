import java.util.Scanner;

class SearchElement {
    int n , search;
    int arr [];
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0;i<arr.length;i++){
            System.out.print("Enter element :");
            arr[i]=sc.nextInt();
        }
        System.out.print("\nEnter element to search :");
        search = sc.nextInt();
    }    

    void display(){
        boolean isThere = false;
        for (int i = 0;i<arr.length;i++){
            if(search==arr[i]){
                isThere = true;
                break;
            }
        }

        if (isThere)
            System.out.println(search);
        else
            System.out.println("NO SUCH ELEMENT");
    }
    public static void main(String[] args) {
        SearchElement searchElement = new SearchElement();
        searchElement.input();
        searchElement.display();
    }
}
