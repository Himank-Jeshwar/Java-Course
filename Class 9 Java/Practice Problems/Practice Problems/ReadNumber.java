import java.io.*;
class ReadNumber{
    double num;
    void input()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a real number = ");
        num = Double.parseDouble(br.readLine());
    }
    
    void display(){
        if (num==0)
            System.out.println("zero");
        else
            if (num>0)
                System.out.println("positive");
            else
                if (num<0)
                    System.out.println("negative");
        
        if (Math.abs(num)<1)
            System.out.println("small");
        else
            if(Math.abs(num)>1000000)
                System.out.println("large");
    }
    public static void main()throws IOException{
        ReadNumber num = new ReadNumber();
        num.input();
        num.display();
    }
}