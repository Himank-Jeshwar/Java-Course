import java.util.*;
class PR_14_CityRecords {
    static void searchCity(String n,String cities[],int std[]){
        int j;
        for (j = 0;j<cities.length;j++){
            if (cities[j].equals(n)){
                System.out.println("Search Successful\n");
                System.out.println("Name of city - "+cities[j]);
                System.out.println("STD - "+std[j]);
                break;
            }
        }

        if (j==cities.length)
            System.out.println("Search unsuccessful, no such city in the list");
    }
    public static void main(String[] args) {
        // declaration
        String cities[] = new String[5];
        int std[] = new int [5];
        String n;

        // input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter names of 10 cities and their corresponding STD : ");
        for (int i = 0;i<cities.length;i++){
            cities[i]=sc.next();
            std[i] = sc.nextInt();
            System.out.println();
        }
        System.out.print("Enter name of city : ");
        n = sc.next();

        searchCity(n,cities,std); // search city and print accordingly
    }
}
