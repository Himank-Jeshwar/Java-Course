import java.util.Scanner;

class PR_52_FirstAndLastNameFormat {
    public static void main(String[] args) {
        String name,fname="";
        int c = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name : ");
        name = " "+sc.nextLine().trim();
        // _ABC CDE FGH IJK     i = 12
        // A.C.F.IJK
        for (int i = 0;i<name.length();i++){
            if (name.charAt(i)==' ' && name.lastIndexOf(' ')!=i){
                fname += (char)(name.charAt(i+1))+".";
            }
            else if (name.lastIndexOf(' ')==i)
                fname+=name.substring(i+1);
        }
            
        System.out.println(fname);
            
        }
    }

