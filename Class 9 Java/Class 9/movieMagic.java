import java.io.*;
public class movieMagic {
    public static void main(String[] args)throws IOException {
        // declaration
        int year;String title,feedback;float rating;
        
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the title of movie - ");
        title = br.readLine();
        System.out.print("Enter the release year of the movie - ");
        year = Integer.parseInt(br.readLine());
        System.out.print("Please give your rating for the movie \'"+title+"\' here - ");
        rating = Float.parseFloat(br.readLine());
        // decision
        if (rating<=2.0)
            feedback = "Flop";
        else
            if (rating<=3.4)
                feedback = "Semi-Hit";
            else
                if (rating<=4.4)
                    feedback = "Hit";
                else
                    feedback = "Super-Hit";
        
        // output
        System.out.print("Title of the movie - "+title+"\nFeedback - "+feedback);
    }
}
