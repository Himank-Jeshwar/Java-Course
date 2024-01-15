import java.util.*;
class PR_06_AgeCalculator {
    public static void main(String[] args) {
        String dob,currentDate;
        int dd1 = 0,mm1 = 0,yy1 = 0,dd2 = 0,mm2 = 0,yy2 = 0;
        int ddDiff = 0,mmDiff = 0, yyDiff = 0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Date of Birth (dd/mm/yy) : ");
        dob = sc.next();
        System.out.print("Enter current date (dd/mm/yy) : ");
        currentDate = sc.next();

        // finding difference in dates
        dd1 = Integer.parseInt(dob.substring(0, dob.indexOf('/')));
        dd2 = Integer.parseInt(currentDate.substring(0, currentDate.indexOf('/')));
        ddDiff = Math.abs(dd2-dd1);

        // finding months
        mm1 = Integer.parseInt(dob.substring(dob.indexOf('/')+1, dob.lastIndexOf('/')));
        mm2 = Integer.parseInt(currentDate.substring(currentDate.indexOf('/')+1, currentDate.lastIndexOf('/')));
        mmDiff = Math.abs(mm2-mm1);
        
        // finding years
       mm1 = Integer.parseInt(dob.substring(dob.indexOf('/')+1, dob.lastIndexOf('/')));
        mm2 = Integer.parseInt(currentDate.substring(currentDate.indexOf('/')+1, currentDate.lastIndexOf('/')));
        mmDiff = Math.abs(mm2-mm1);
    }

}
