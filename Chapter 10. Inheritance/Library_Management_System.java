import java.util.Scanner;
class Library{
    // methods - showAvailableBooks,issueBook,returnBook,addBook
    // properties - Array to store the available books
    // properties - Array to store the issued books
     String [] availableBooks = {"Harry Potter","The 80/20 Principle","The Jungle Book"},copyofavailableBooks = availableBooks,
    issuedBooks = {},copyOfissuedBooks = issuedBooks;int [] issuedBookNumbers = {};
    void addBook(String bookName){
        copyofavailableBooks = new String[availableBooks.length+1];
        for (int i = 0;i<availableBooks.length;i++){
            copyofavailableBooks[i]=availableBooks[i];
        }
        copyofavailableBooks[copyofavailableBooks.length-1]=bookName;
        availableBooks=copyofavailableBooks;
        System.out.println("Thank You for donating this book\n\tHave a nice day ahead !");    
    }
    void issueBook(String bookName){
        boolean isBookthere = false;
        for (int j = 0;j<availableBooks.length;j++){
            if (availableBooks[j].equals(bookName)){
                availableBooks[j]="";
                isBookthere = true;
                break;
            }
        }
        if (isBookthere==true){
            copyOfissuedBooks = new String[issuedBooks.length+1];
            for (int i = 0;i<issuedBooks.length;i++){
                copyOfissuedBooks[i]=issuedBooks[i];
            }
            
            copyOfissuedBooks[copyOfissuedBooks.length-1]=bookName;
            issuedBooks = copyOfissuedBooks;
            System.out.println("The book \'"+bookName+"\' has been issued to you.\n\tPlease return it on time or else a fine of 500/- will be charged.\n\tThank You.");
            }
            
        
        else{
            System.out.println("The book \'"+bookName+"\' is currently unavailable.");
        }    
    }
    void returnBook(String bookName){
        boolean isBookthere = false;
        for (int i = 0;i<issuedBooks.length;i++){
            if (issuedBooks[i].equals(bookName)){
                issuedBooks[i]="";
                isBookthere = true;
                break;
            }
        }
        if (isBookthere==true){
            for (int j = 0;j<availableBooks.length;j++){
                if (availableBooks[j].equals("")){
                    availableBooks[j]=bookName;
                    break;
                }
            }
            System.out.println("Thank you for returning the book.\n\tHope You Enjoyed Reading\n\tHave a nice day ahead !");
        }
        else{
            System.out.println("The book \'"+bookName+"\' is never issued.\n\tPlease check the spelling for any spelling mistake.");
        }
    }   
    void showAvailableBooks(){
        for (int i = 0;i<availableBooks.length;i++) {
            System.out.println(availableBooks[i]);
        }
    }   
}
public class Library_Management_System {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        String choice ;
        String nameOfBook;

        while (true){
            System.out.println("\n\t\t\t\t\tPRESS \'a\' TO TAKE A BOOK\n\t\t\t\t\tPRESS \'b\' TO DONATE/ADD A BOOK\n\t\t\t\t\tPRESS \'c\' TO RETURN A BOOK\n\t\t\t\t\tPRESS \'d\' TO SHOW AVAILABLE BOOKS\n\t\t\t\t\tPRESS \'e\' TO EXIT");    
            System.out.print("\n\t\t\t\t\tEnter Your Choice : ");
            choice = sc.nextLine();
            switch(choice){
                case "a":
                    System.out.print("\n\t\t\t\t\tEnter the book number to take : ");
                    nameOfBook = sc.nextLine();
                    lib.issueBook(nameOfBook);
                    break;
                case "b":
                    System.out.print("\n\t\t\t\t\tEnter the book name to donate or add : ");
                    nameOfBook = sc.nextLine();
                    lib.addBook(nameOfBook);
                    break;
                case "c":
                    System.out.print("\n\t\t\t\t\tEnter the book name to return : ");
                    nameOfBook = sc.nextLine();
                    lib.returnBook(nameOfBook);
                    break;
                case "d":
                    System.out.println("\nAvailable books are listed below :- \n");
                    lib.showAvailableBooks();
                    break;
                case "e":
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nINVALID INPUT\n\tPlease try again.");
                sc.close();
            }
        }
        }
        
    }
