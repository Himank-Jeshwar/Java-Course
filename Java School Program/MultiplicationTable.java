import java.io.*;
class MultiplicationTable {
    int num;
    void input()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number = ");
        num = Integer.parseInt(br.readLine());
    }
    void generateTable(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }
    public static void main(String[] args)throws IOException {
        MultiplicationTable mulTable = new MultiplicationTable();
        mulTable.input();
        mulTable.generateTable();
    }
}
