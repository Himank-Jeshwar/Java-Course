interface Camera2{
    void takeSnap();
    void recordVideo();
    default void recordVideoin4K(){
        greet();
        System.out.println("Recording in 4k...");
    }
    private void greet(){
        System.out.println("Good morning !");
    }
}
interface GPS2{
    void locatePlace();
}
interface MediaPlayer2{
    void playMusic();
}
class CellPhone2{
    void makeCall(){
        System.out.println("Calling...");
    }
    void receiveCall(){
        System.out.println("Receiving Call...");
    }
    void rejectCall(){
        System.out.println("Rejecting call...");
    }
}
class SmartPhone2 extends CellPhone2 implements Camera2,GPS2,MediaPlayer2{
    public void takeSnap(){
        System.out.println("Taking picture...");
    }
    public void locatePlace(){
        System.out.println("Locating place...");
    }
    public void playMusic(){
        System.out.println("Playing music...");
    }
    public void recordVideo(){
        System.out.println("Recording...");
    }
    // public void recordVideoin4K(){
    //     System.out.println("Taking snap and recording in 4k...");
    // }
    
}
public class CWH_06_PolymorphismUsingInterfaces {
    public static void main(String[] args) {
        GPS2 g = new SmartPhone2();
        MediaPlayer2 mp = new SmartPhone2();
        CellPhone2 cp = new SmartPhone2();
        SmartPhone2 smph2 = new SmartPhone2(); // Can use all methods present in the SmartPhone2 class.
        g.locatePlace(); // Can only use GPS2 methods
        mp.playMusic(); // This is a smartphone please use it as a media player or else it will throw error.
        cp.makeCall();
        
        smph2.makeCall();
        smph2.locatePlace();
        smph2.takeSnap();
        // g.takeSnap(); => throws Error
    }
}
