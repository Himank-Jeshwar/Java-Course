// package folder.folderL1.folderL2;
class Calculator {
    int add(int x,int...numbers){
        int sum = x;
        for (int i = 0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        return sum;
    }   
    int substract(int x,int...numbers){
        int diff = x;
        for (int i = 0;i<numbers.length;i++){
            diff-=numbers[i];
        }
        return diff;
    }
    int mul(int x,int...numbers){
        int product = x;
        for (int i = 0;i<numbers.length;i++){
            product*=numbers[i];
        }
        return product;
    }
    double div(double x,double...numbers){
        double quotient = x;
        for (int i = 0;i<numbers.length;i++){
            quotient/=numbers[i];
        }
        return quotient;
    }     
}
class ScCalculator extends Calculator{
    int logOf(int base,int result){
        int power = 0,permanentBase = base;
        if (result!=1){
            for (;base!=result;power++){
                if (power==1||power==0)
                    continue;
                base*=permanentBase;
                if (base==result)
                    break;
            }
        }
        else if (result==1)
            power = 0;
        return power;
    }
    int absoluteValue (int num){
        if (num<0)
            num*=-1;
        return num;
    }
}

public class HybridCalculator extends ScCalculator{
    public static void main(String[] args) {
        HybridCalculator hc = new HybridCalculator();
        System.out.println(hc.add(1,2,3,4,5,6,7,8,9,10));
        System.out.println(hc.absoluteValue(-10));
        System.out.println(hc.logOf(9, 531441));

    }    
}


