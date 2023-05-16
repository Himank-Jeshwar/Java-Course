class Phone{
    public void on(){
        System.out.println("Turning on Phone ....");
   }
    public void showClock(){
        System.out.println("Time is 9 am");
    }
}
class SmartPhone extends Phone{
    @Override
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
    public void playYoutube(){
        System.out.println("Playing youtube...");
    }
}
public class CWH_05_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Phone ph = new SmartPhone(); // Allowed
        // SmartPhone smph = new Phone(); -> Not allowed
        ph.on();
        ph.showClock();
        // ph.playYoutube(); // Not allowed
    }
}
