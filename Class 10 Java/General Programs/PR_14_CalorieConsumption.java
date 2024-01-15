import java.util.*;
class PR_14_CalorieConsumption{
    int min,calories;
    
    void accept(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter minutes : ");
        min = sc.nextInt();
        
        if (min>=90){
            System.out.print("INVALID INPUT");
            System.exit(0);
        }
    }
    
    void calculate(){
        if (min<=15)
            calories = 30*min;
        else 
            if (min<=45)
                calories = 30*15+ 20*(min-15);
        else
            if (min<=75)
                calories = 30*15+ 20*30 + 15*(min-45);
            else
                calories = 30*15+ 20*30 + 15*30 + 35*(min-75);
    }
    
    
}