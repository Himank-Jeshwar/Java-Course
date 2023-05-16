import java.io.*;
class TestNumber{
    int n1,n2,n3;
    void input()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 3 numbers :-");
        n1 = Integer.parseInt(br.readLine());
        n2 = Integer.parseInt(br.readLine());
        n3 = Integer.parseInt(br.readLine());
    }
    
    void display(){
        int flag = 0,largest = 0;
        if (n1>Math.max(n2,n3))
            largest = n1;
        else
            if (n2>Math.max(n1,n3))
                largest = n2;
            else
                if (n3>Math.max(n2,n1))
                    largest = n3;
                else
                    flag = 1;
        
        if (flag!=1){
            System.out.println("Largest = "+largest+"\nSquare = "+Math.pow(largest,2)+"\tSquare root = "+Math.sqrt(largest));
            System.out.print("Cube root = "+Math.cbrt(largest));
        }
        else
            System.out.print("RESULT NOT POSSIBLE AS ALL NUMBERS ARE EQUAL.");
    }
    public static void main()throws IOException{
        TestNumber num = new TestNumber();
        num.input();
        num.display();
    }
}