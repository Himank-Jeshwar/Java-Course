import java.util.*;
class PR_15_ISBN{
    void checkISBN(long isbn){
        int sum = 0;
        for (int i = 10;i>0;i--){
            sum += (i*isbn%10);
            isbn/=10;
        }
        if (sum%11==0)
            System.out.println("Legal ISBN");
        else
            System.out.println("Illegal ISBN");
    }
    public static void main(String[] args) {
        long isbn;
        PR_15_ISBN obj = new PR_15_ISBN();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ISBN : ");
        isbn = sc.nextLong();

        if (!(isbn>=1000000000L&&isbn<=9999999999L)){
            System.out.println("Illegal ISBN");
            System.exit(0);
        }

        obj.checkISBN(isbn);
    }
}