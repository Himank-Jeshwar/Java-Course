/*
                                                          **************
                                                          **************
                                                          **************
                                                          **************
                                                          **************
                                                          **************
                                                          
                                                                        
                                                          ************
                                                          ************
                                                          ************
                                                          ************
                                                          ************ 
                                                          ************
                                                          
                                                          ***********
                                                            *********
                                                              *******
                                                                *****
                                                                  ***
                                                                    *
                                                            
                                                          i = 7 , j = 6.5
                                                          *
                                                          ***
                                                          *****
                                                          *******
                                                          *********
                                                          ***********
                                                          
                                                          i = 1 , j = 0.5;
                                                          ***********
                                                          
                                                          
                                                          
                                                                    
 */
class Pattern {
    public static void main (){
        for (int i = 1;i<=6;i++){
            System.out.print("\t\t\t\t\t\t\t      ");
            for (float j = 1.0f;j<=i;j+=0.5f){
                System.out.print("*");
            }
           for (float k = 6.0f;k>=i;k-=0.5f){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}