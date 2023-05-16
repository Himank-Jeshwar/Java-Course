import java.util.Scanner;

class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return "InvalidInputException: "+getMessage();
    }
    @Override 
    public String getMessage(){
        return "Invalid Input.\n\tPlease enter a proper number !";
    }
}
class CannotDivideBy0Exception extends Exception{
    @Override
    public String toString(){
        return "CannotDivideBy0Exception: "+getMessage();
    }
    @Override 
    public String getMessage(){
        return "You cannot divide a number by 0.";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "MaxInputException: "+getMessage();
    }
    @Override 
    public String getMessage(){
        return "Input cannot be greater than 100000.";
    }
}
class MaxMultiplierReachedException extends Exception{
    @Override
    public String toString(){
        return "MaxMultiplierReachedException: "+getMessage();
    }
    @Override 
    public String getMessage(){
        return "Input cannot be greater than 7000 when multiplying.";
    }
}
class CustomCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char op;
        try{
            System.out.print("Enter an operator to proceed - ");
            op = sc.next().charAt(0);
            switch(op){
                case '+':
                    double sum = 0.0;
                        System.out.println("Enter numbers - ");
                        while(true){
                            double n = sc.nextDouble();
                            if (n>100000)
                                throw new MaxInputException();
                            sum+=n;
                            if(n==0){
                                System.out.println(sum);
                                break;
                            }
                        }
                    break;
                case '-':
                    int iter = 1;
                    double diff = 0.0;
                    System.out.println("Enter numbers - ");
                    while(true){
                        double n = sc.nextDouble();
                        if (n>100000)
                            throw new MaxInputException();
                        
                        else if (iter==1)    
                            diff=n;
                        else{
                            diff-=n;
                        }
                        if(n==0){
                            System.out.println(diff);
                            break;   
                        }
                        iter++;
                    }
                    break;

                case '*':
                    double product = 1.0;
                    System.out.println("Enter numbers - ");
                    while(true){
                        double n = sc.nextDouble();
                        if (n>7000)
                            throw new MaxMultiplierReachedException();
                        product*=n;
                        if(n==1){
                            System.out.println(product);
                            break;
                        }
                    }
                    break;

                case '/':
                    double div = 0.0,dividend,divisor;
                    System.out.print("Enter dividend - ");
                    dividend = sc.nextDouble();
                    System.out.print("Enter divisor - ");
                    divisor = sc.nextDouble();
                    if (dividend>100000||divisor>100000)
                        throw new MaxInputException();

                    else if (divisor==0)
                        throw new CannotDivideBy0Exception();
                    else{
                        div = dividend/divisor;
                        System.out.println(div);
                    }
                    break;
                
                default:
                    throw new InvalidInputException();
                }
            }
                        
        catch(MaxInputException m){
            System.out.println(m);
        }
        catch(MaxMultiplierReachedException e){
            System.out.println(e);
        }
        catch(CannotDivideBy0Exception c){
            System.out.println(c);
        }
        catch(InvalidInputException inp){
            System.out.println(inp);
        }
    }
}
