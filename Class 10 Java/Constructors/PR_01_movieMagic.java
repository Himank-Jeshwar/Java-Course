import java.util.Scanner;

class movieMagic {
    // declaration
    int year;
    String title;
    float rating;

    movieMagic(){
        // initialization
        year = 0;
        title = "";
        rating = 0.0f;
    }

    void accept(){
        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter title of the movie : ");
        title = sc.nextLine();
        System.out.print("Enter rating : ");
        rating = sc.nextFloat();
    }

    void display(){
        System.out.println("Title - "+title);
        if (rating>=0.0&&rating<=2.0f)
            System.out.println("Flop");
        else if (rating<=3.4f)
            System.out.println("Semi-hit");
        else if (rating<=4.5f)
            System.out.println("Hit");
        else if (rating>4.5f&&rating<=5.0)
            System.out.println("Super Hit");
        else 
            System.out.println("INVALID RATING !");
    }
    public static void main(String[] args) {
        movieMagic movie = new movieMagic();
        movie.accept();
        movie.display();
    }
}
