import java.util.*;
class PR_06_CountryCapital {
    public static void main(String[] args) {
        // declaration
        String country[] = new String[10],capital[] = new String [10];

        // inputs
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<country.length;i++){
            System.out.print("Enter country name : ");
            country[i]=sc.nextLine();
            System.out.print("Enter its capital : ");
            capital[i]=sc.nextLine();
        }

        System.out.println("\nCountry Names\tCapital");
        for (int j = 0;j<country.length;j++){
            switch(country[j].toLowerCase().charAt(0)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(country[j]+"\t\t"+capital[j]);
                    break;
            }
        }
    }    
}
