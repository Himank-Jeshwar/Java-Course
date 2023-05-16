public class DisplayingArrayInNegative_to_Positive_order {
    public static void main(String[] args) {
        int [] num = {15,21,-32,-41,54,61,71,-19,-44,52};
        for (int i = 0;i<num.length;i++){
            if (num[i]<0)
                System.out.print(num[i]+"  ");
        }
        for (int j = 0;j<num.length;j++){
            if (num[j]>=0)
                System.out.print(num[j]+"  ");
        }
    }    
}