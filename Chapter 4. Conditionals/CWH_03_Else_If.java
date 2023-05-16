public class CWH_03_Else_If {
    public static void main(String[] args) {
        int marks = 90;
        if (marks == 100){
            System.out.println("SuperBuster !");
        }

        else if (marks>=80){
            System.out.println("Brilliant !"); 
        }

        else if (marks>=70){
            System.out.println("Excellent !");
        }
        else if (marks>=50){
            System.out.println("Good !");
        }

        else if (marks>=40){
            System.out.println("Pass ! ");
        }

        else {
            System.out.println("Fail !");
        
        }

    }
}
