import java.io.*;
class Series {
    int n;
    void input()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a value = ");
        n = Integer.parseInt(br.readLine());
    }
    void series1(){
        for (int i = 1,j = 1;i<=n;i++,j*=10){
            System.out.print(j+"  ");
        }
        System.out.println();
    }
    void series2(){
        for (int i = 1,j = 1;i<=n;i++,j+=j){
            if (j==1)
                System.out.print("1  ");
            else
                System.out.print("1/"+j+"  ");
        }
        System.out.println();
    }
    public static void main(String[] args)throws IOException {
        Series sr = new Series();
        sr.input();
        sr.series1();
        sr.series2();
    }
}
