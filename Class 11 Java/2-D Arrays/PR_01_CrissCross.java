/* 0 - Player 1 wins
 * 1 - Player 2 wins
 * 2 - Neutral 
 */
import java.util.*;
class PR_01_CrissCross{
    private int n;
    private String table[][],player1_name,player2_name;
    private String player1_sym,player2_sym;

    public PR_01_CrissCross(int n,String n1,String n2){
        this.n = n;
        table = new String[n][n]; 
        player1_name = n1;
        player2_name = n2;

        int pos = 1;

        for (int i = 0;i<n;i++)
            for (int j = 0;j<n;j++)
                table[i][j] = String.valueOf(pos++);
    }

    void input(){
        Scanner sc = new Scanner (System.in);

        System.out.println("Select Symbol (X/O) : ");
        player1_sym = sc.next();

        player2_sym = (player1_sym.equals("X"))?"O":"X";
    }

    void fillByUser(){
        int s;

        Scanner sc = new Scanner(System.in);
        System.out.println("Select Number : ");
        s = sc.nextInt();

        String num = String.valueOf(s);
        boolean flag = false;

        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                if (table[i][j].equals(num)){
                    table[i][j] = player1_sym;
                    flag = true;
                }
            }
        }

        if (flag==false)
            System.out.println("SORRY ! THIS POSITION IS ALREADY SECURED.");
    }

    void fillByComp(){
        int s;
        String num;
        boolean flag;

        do{
            s = (int)(Math.random()*99+1); // random choice by computer
            
            num = String.valueOf(s);
            flag = false;

            for (int i = 0;i<n;i++){
                for (int j = 0;j<n;j++){
                    if (table[i][j].equals(num)){
                        table[i][j] = player2_sym;
                        flag = true;
                    }
                }
            }
        }while(flag==false);

    }

    public static boolean isValid(int n){
        if (n<3){
            System.out.println("BELOW RANGE");
            return false;
        }
        else 
            if (n>10){
                System.out.println("ABOVE RANGE");
                return false;
            }
        return true;
    }

    int checkColumnWise(){
        String column[] = new String[n];
        int k = 0,flag = 2;

        for (int i = 0;i<n;i++){
            k = 0;
            for (int j = 0;j<n;j++)
                column[k++] = table[j][i];          
        }
        
        k = 0;
        for (int i = 0;i<n;i++){
            if (player1_sym.equals(column[k++]))
                flag = 0;
        }

        k = 0;
        for (int i = 0;i<n;i++){
            if (player2_sym.equals(column[k++]))
                flag = 1;
        }
        
    }

    boolean checkRowWise(){
        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++)
                if (player1_sym.equals(table[i][j])==false)
                    return false;
        }

        return true;
    }

    boolean checkleftDiagonalWise(){

        for (int i = 0;i<n;i++)
            if (player1_sym.equals(table[i][i])==false)
                return false;

        return true;
    }

    boolean checkRightDiagonalWise(){

        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                if (i+j==n-1){
                    if (player1_sym.equals(table[i][j])==false)
                        return false;
                }
            }
        }

        return true;
    }

    void displayTable(){
        for (int i = 0;i<n;i++){
            System.out.print("\t\t\t");
            for (int j = 0;j<n;j++){
                System.out.print(table[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }


    void displayResult(){
        if (checkRowWise()==true || checkColumnWise()==true || checkRightDiagonalWise()==true || checkleftDiagonalWise()==true){
            System.out.println(player1_name+" wins !");
            System.out.println(player2_name+" loses !");
        }

        else{
            System.out.println(player2_name+" wins !");
            System.out.println(player1_name+" loses !");
        }
        
    
    }
}