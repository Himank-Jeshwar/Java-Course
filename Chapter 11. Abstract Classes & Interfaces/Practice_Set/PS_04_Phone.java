abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone{
    @Override
    void ring(){
        System.out.println("Ringing....");
    }
    @Override
    void lift(){
        System.out.println("Call started.");
    }
    @Override
    void disconnect(){
        System.out.println("Call ended.");
    }

    void watchYoutube(){
        System.out.println("Watching youtube...");
    }
    void locatePlace(){
        System.out.println("Locating place on map...");
    }
    void playMusic(){
        System.out.println("Playing music...");
    }
}
public class PS_04_Phone {
    public static void main(String[] args) {
        Telephone st = new SmartTelephone();
        st.ring();
        st.lift();
        st.disconnect();
    }
}
