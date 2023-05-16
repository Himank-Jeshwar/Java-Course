public class PR_15_TrainSpeed {
    public static void main(String[] args) {
        // declaring
        double dist1 = 120.5 , time1 = 2.3;
        double dist2 = 160.75 , time2 = 3.5;
        double dist3 = 140.9 , time3 = 5.5;
        double avg = 0.0;
        // calculating
        double totalDist = dist1+dist2+dist3;
        double totalTime = time1+time2+time3;
        avg = totalDist/totalTime;
        // output
        System.out.println("Average speed of the train = "+avg+" km/h");
    }
}
