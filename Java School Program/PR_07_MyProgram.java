import java.io.*;
class MyProgram
{
    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        String n,date;
        System.out.print("Enter name and date of birth ");
        n = br.readLine();
        date = br.readLine();
        System.out.println("My name is "+n);
        System.out.print("My birthday is "+date);

    }
}