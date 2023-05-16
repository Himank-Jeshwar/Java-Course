import java.io.*;
class TestData{
    // declaration
    double n1,n2;
    
    void input()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Enter two real numbers :- ");
        n1 = Double.parseDouble(br.readLine());
        n2 = Double.parseDouble(br.readLine());
        
        n1 = Math.round(n1*1000);
        n1=n1/1000;
        System.out.print(n1);
    }
    public static void main()throws IOException{
        TestData td = new TestData();
        td.input();
    }
}