import java.util.*;
class PR_12_Cities{
    void takeInput(String cities[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter names of "+cities.length+" cities :");
        for (int i = 0;i<cities.length;i++){
            cities[i] = sc.nextLine();
        }
    }

    boolean isVowel(char ch){
        if (Character.isLetter(ch)){
            switch(Character.toLowerCase(ch)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String cities[] = new String[10];
        PR_12_Cities cityObj = new PR_12_Cities();
        cityObj.takeInput(cities);

        System.out.println("The cities that start with consonant but end with vowel are : ");
        for (int i = 0;i<cities.length;i++){
            if (cityObj.isVowel(cities[i].charAt(cities[i].length()-1))){
                if (!(cityObj.isVowel(cities[i].charAt(0))))
                    System.out.println(cities[i]);
            }

        }
    }
}