@FunctionalInterface
interface FuncInterface{
    void meth1();
}
class Phone{
    void playGame(){
        System.out.println("Playing snake game...");
    }
    void call(){
        System.out.println("Calling ...");
    }
    }
class SmartPhone extends Phone{
    void playYoutube(){
        System.out.println("Playing youtube...");
    }

    @Override
    public void playGame(){
        System.out.println("Playing PUBG...");
    }

    @Deprecated
    public int sum(int a,int b){
        return a+b;
    }
}   

public class CWH_03_Annotations {
    // @SuppressWarnings("deprecation")
    public static void main(String[] args) {
    SmartPhone smph = new SmartPhone();
    smph.playGame();    
    int s = smph.sum(8,9);
    System.out.println(s);
    }
}
