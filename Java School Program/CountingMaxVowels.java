import java.util.Scanner;
class CountingMaxVowels {
    String sentence;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        sentence = sc.nextLine().trim()+" ";
        sc.close();
    }

    void display(){
        int length = 0,startIndex = 0,endIndex = 0,count = 0,maxCount = 0;
        for (int i = 0;i<sentence.length();i++){
            if (sentence.charAt(i)==' '){
                String str = sentence.substring(i-length, i).toLowerCase();
                for (int j = 0;j<str.length();j++){
                    switch(str.charAt(j)){
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            count++;
                    }
                }
                if (count>maxCount){
                    maxCount = count;
                    startIndex = i-length;
                    endIndex = i;
                }
                length = 0;
                count = 0;
            }

            else
                length++;
        }
        System.out.println("Word with maximum vowels : "+sentence.substring(startIndex, endIndex));
    }
    public static void main(String[] args) {
        CountingMaxVowels displayLetter = new CountingMaxVowels();
        displayLetter.input();
        displayLetter.display();
    }
}
