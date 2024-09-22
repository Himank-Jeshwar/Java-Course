import java.util.*;
class Arrange {
    int n;

    public Arrange (){
        n = 0;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        n = Math.abs(sc.nextInt());
    }

    void descending (){
        int copy = n,sort = 0;

        for (int i = 9;i>=0;i--){
            copy = n;
            while (copy>0){
                if (copy%10==i)
                    sort = sort*10+i;
                copy/=10;
            }
        }

        System.out.println("Number in descending order of their digits : "+sort);
    }

    public static void main(String[] args) {
        Arrange ob = new Arrange();
        ob.input();
        ob.descending();
    }
}
