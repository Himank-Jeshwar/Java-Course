public class PR_16_Alloy {
    public static void main(String[] args) {
        // declaration
        int copper = 13 , zinc = 7 , nickel = 5;
        // calculation
        int total = copper+zinc+nickel;
        double copperPercent = (copper*100)/total;
        double zincPercent = (zinc*100)/total;
        double nickelPercent = (nickel*100)/total;
        //output
        System.out.println("Copper percentage = "+copperPercent+" %");
        System.out.println("Zinc percentage = "+zincPercent+" %");
        System.out.println("Nickle percentage = "+nickelPercent+" %");
    }
}
