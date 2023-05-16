import java.io.*;
class CheckingPerfectSquares {
    int m,n;
    int [] numbers;
    void input ()throws IOException{
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        System.out.print("Enter m : ");
        m = Integer.parseInt(br.readLine());
        System.out.print("Enter n : ");
        n = Integer.parseInt(br.readLine());
        numbers = new int[n-m+1];
    }    

    void display(){
        int sq_root = 0;
        for (int i = 0;m<=n;m++,i++){
            numbers[i]=m;
        }
        
        System.out.print("Perfect Square numbers are : ");
        for (int i = 0;i<numbers.length;i++){
            sq_root = (int)Math.sqrt(numbers[i]);
            if (sq_root*sq_root==numbers[i]){
                System.out.print(numbers[i]+"  ");
            }
        }
    }
    public static void main(String[] args)throws IOException {
        CheckingPerfectSquares perfectSquares = new CheckingPerfectSquares();
        perfectSquares.input();
        perfectSquares.display();
    }
}
