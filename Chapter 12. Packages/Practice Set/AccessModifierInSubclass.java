import Phones.CellPhone;

class Smartphone extends CellPhone{
    void display(){
        System.out.println(modelNo);
        // System.out.println(ramInGB);
    }
}
public class AccessModifierInSubclass {
    public static void main(String[] args) {
    Smartphone smph = new Smartphone();
    smph.display();        
    }    
}
