/*
in 2020 , due to COVID-19, 130 people died and 450 took birth
in a village , find what was the population at the end and find the
percentage of people died . 
*/
public class PR_22_Villagers {
    public static void main(String[] args) {
        int births = 450 , deaths = 130 , pop = 1650;
        int popLeft = (pop+births)-deaths;
        double deathPercent = (deaths*100)/(pop+births);
        System.out.print("Population at the end = "+popLeft+"\nDeath Percentage = "+deathPercent+" %");
    }
}
