interface TVRemote{
    void volumeUp();
    void volumeDown();
    void changeChannel();
}

interface SmartTVRemote extends TVRemote{
    void speakToGoogleAssistant();
    void watchNetfix();
    void connectToBlueTooth();
}

class Tv implements TVRemote{
    @Override
    public void volumeUp() {
        System.out.println("Increasing volume...");
        
    }
    @Override
    public void volumeDown() {
        System.out.println("Decreasing volume....");
        
    }
    @Override
    public void changeChannel() {
        System.out.println("Changing channel...");
    }

}
public class PS_06_and_07_Remote {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.changeChannel();
        t.volumeUp();
        t.volumeDown();
    }    
}
