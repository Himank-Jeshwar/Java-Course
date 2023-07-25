import java.util.*;
class PR_27_SevenWonders {
    static void input (String countries[],String wonders[]){
        Scanner sc = new Scanner (System.in);
        for (int i = 0;i<wonders.length;i++){
            System.out.println("Enter name of the country : ");
            countries[i] = sc.nextLine();
            System.out.println("Enter name of the wonder : ");
            wonders[i] = sc.nextLine();
        }
    }

    static void show(String countries[],String wonders[]){
        for (int i = 0;i<wonders.length;i++){
            System.out.println(countries[i]+" : "+wonders[i]);
        }
    }

    public static void main(String[] args) {
        // String wonders[] = {"Taj Mahal","Great Pyramid of Giza","Christ the Redeemer","Great Wall of China","Colosseum","Machu Picchu","Petra"};
        // String countries[] = {"India","Egypt","Brazil","China","Italy","Peru","Jordan"};       
        String wonders[]=new String[7],countries[] = new String[7];
        String temp_of_wonders,temp_of_countries;
        String wonder_name;

        int st = 0,ed=wonders.length-1,mid;
        input(countries, wonders);
        show(countries, wonders);
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter wonder name : ");
        wonder_name = sc.nextLine();

        System.out.println();
        for (int i = 0;i<wonders.length;i++){
            for (int j = 0;j<wonders.length-i-1;j++){
                if (wonders[j].compareTo(wonders[j+1])>0){
                    temp_of_wonders = wonders[j+1];
                    wonders[j+1]=wonders[j];
                    wonders[j] = temp_of_wonders;

                    temp_of_countries = countries[j+1];
                    countries[j+1]=countries[j];
                    countries[j] = temp_of_countries;

                }
            }
        }

       while (st<=ed){
            mid = (st+ed)/2;
            if (wonder_name.equals(wonders[mid])){
                System.out.println("Country name : "+countries[mid]);
                break;
            }
            else if (wonder_name.compareTo(wonders[mid])<0)
                ed = mid-1;
            else 
                st = mid+1;
       }

       if (st>ed)
            System.out.println("Sorry Not Found !");
    }    
}
