import java.util.*;
class PR_11_PositionCalculator {
    static int extractAtomicNumber(String element){
        String el [] = {"H","He","Li","Be","B","C","N","O","F","Ne","Na","Mg","Al","Si","P","S","Cl","Ar","K","Ca"};
        int atNum = 0;
        for (int i = 0;i<el.length;i++){
            if (el[i].equals(element)){
                atNum = i+1;
                return atNum;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int atNum,period = 1,group = 0,k = 0,sum = 0;
        
        String element;
        String elecConfig = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element (symbol) under 20 elements only : ");
        element = sc.nextLine().trim();

        atNum = extractAtomicNumber(element);
        // works for first 20 elements
        if (atNum<=20){
            for (int i = 0;i<atNum;){
                k++;
                sum++;
                if (sum==atNum){  
                    if (k<3)
                        group = k;
                    else 
                        group = k+10;
                    elecConfig+=k;
                    break;
                }

                if (k==2&&period==1){  // dublet rule 
                    period++;
                    elecConfig+=k+" ";
                    k = 0;
                }
                
                else if (k==8){ // octet rule 
                    period++;
                    elecConfig+=k+" ";
                    k = 0;
                }

            }
        }
        System.out.println("Atomic number : "+atNum);
        System.out.println("Group "+group+" Period "+period);
        System.out.println("Electronic configuration : "+elecConfig);
        
    }
}
