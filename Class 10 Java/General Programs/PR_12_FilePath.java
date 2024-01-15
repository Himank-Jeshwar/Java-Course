import java.util.*;
class PR_12_FilePath{
    public static void main(String args[]){
        String inp,path,fname,ext;
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter path : ");
        inp = sc.nextLine();
        
        path = inp.substring(0,inp.lastIndexOf('\\')+1);
        fname = inp.substring(inp.lastIndexOf('\\')+1 ,inp.indexOf('.'));
        ext = inp.substring(inp.indexOf('.')+1);
        
        System.out.println("Path : "+path);   
        System.out.println("File name : "+fname);
        System.out.println("Extension : "+ext);

    }
}