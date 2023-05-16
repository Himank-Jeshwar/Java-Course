import java.util.Scanner;
class EditName {
    String name;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        name = sc.nextLine();
        sc.close();
    }

    void edit(){
        int ind = name.lastIndexOf(" ");
        System.out.print(name.substring(ind+1)+" ");
        System.out.print(name.substring(0, ind));

    }
    public static void main(String[] args) {
        EditName ed = new EditName();
        ed.input();
        ed.edit();
    }
}
