interface Camera{
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
interface GPS{
    void locatePlace();
}
interface MediaPlayer{
    void playMusic();
}
class CellPhone{
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
class SmartPhone extends CellPhone implements Camera,GPS,MediaPlayer{
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
public class CWH_04_DefaultMethods {
    public static void main(String[] args) {
        SmartPhone smph = new SmartPhone();
        smph.takeSnap();
        smph.locatePlace();
        smph.recordVideo();
        smph.playMusic();
        smph.makeCall();
        smph.recordVideoin4K();
        // smph.greet() => throws an error
    }
}
