/**
 * This class is to demonstrate what is javadoc and how it is used in the java industry.
 * @author Himank Jeshwar
 * @version 0.1
 * @since 2002
 * @see <a href = "https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/ArrayList.html">Java Docs</a>
 */
public class CWH_01_JavaDoc {
    public void add(int a,int b){
        System.out.println("The sum is : "+(a+b));
    }
    public static void main(String [] args){
        CWH_01_JavaDoc doc = new CWH_01_JavaDoc();
        doc.add(8,9);
    }
    @Override
    public String toString() {
        return "CWH_01_JavaDoc []";
    }
}
