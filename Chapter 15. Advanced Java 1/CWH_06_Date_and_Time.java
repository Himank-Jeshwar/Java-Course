public class CWH_06_Date_and_Time {
    public static void main(String[] args)throws InterruptedException {
        /*
         * 1000 ms = 1 s
         * 3600 s = 1 hr
         * 24 hr = 1 day
         * 365 days = 1 year
         */

        long ms = System.currentTimeMillis();// print no. of milliseconds passed since 1 Jan,1970.
        long yr = ms/(1000*3600*24L*365);
        long hrs = ms/(1000L*3600);
        long min = ms/(1000L*60); // minutes passed since 1 Jan, 1970.
        System.out.println(ms);
        System.out.println(yr);// years passed since 1 Jan,1970.
        System.out.println(min);
        System.out.println(hrs);
    }    
}
