import java.util.Scanner;
class TestChar {
    int [] arr;
    void input(){
        arr = new int [10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<arr.length;i++){
            System.out.print("Enter character : ");
            arr[i]=sc.next().charAt(0);
        }
    }

    int countUpper(){
        int c = 0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]>=65&&arr[i]<=90)
                c++;
        }
        return c;
    }

    int countVowels(){
        int c = 0;
        for (int j = 0;j<arr.length;j++){
            switch(arr[j]){
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u':
                    c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        TestChar testCh = new TestChar();
        testCh.input();
        System.out.println("Number of uppercase : "+testCh.countUpper());
        System.out.println("Number of vowels : "+testCh.countVowels());
    }
}
