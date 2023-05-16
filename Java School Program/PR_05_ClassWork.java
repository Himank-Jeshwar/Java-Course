import java.io.*;
class PR_05_ClassWork
{
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader m = new BufferedReader(r);
        char c;
        c = m.readLine().charAt(0);
        System.out.println(c);
        System.out.println(c+" "+c);
        System.out.println(c+" "+c+" "+c);
    }
}