public class Practice_04_Detector {
    public static void main(String[] args) {
        String sen = "Hello my  name is   Himank   Jeshwar";
        int doubleSpaces = sen.indexOf("  ");
        int tripleSpaces = sen.indexOf("   ");
        System.out.println("Double Spaces Present at Index "+doubleSpaces);
        System.out.println("Triple Spaces Present at Index "+tripleSpaces);
    }
}
