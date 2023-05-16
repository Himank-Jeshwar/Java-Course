import java.io.*;
class Volume{
    public static void main() throws IOException{
        // declaration
        double v,l,b,h,r;int choice;
        
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\t\tPress 1 to find the volume of a cuboid\n\t\tPress 2 to find the volume of cylinder\n\t\tPress 3 to find the volume of a cone");
        choice = Integer.parseInt(br.readLine());
        
        // decision and calculation
        switch(choice){
            case 1:
                System.out.print("Enter length (in cm) = ");
                l = Double.parseDouble(br.readLine());
                System.out.print("Enter breadth (in cm) = ");
                b = Double.parseDouble(br.readLine());
                System.out.print("Enter height (in cm) = ");
                h = Double.parseDouble(br.readLine());
                
                v = l*b*h;
                System.out.print("Volume of cuboid = "+v+" cubic centimetre");
                break;
            
            case 2:
                System.out.print("Enter radius (in cm) = ");
                r = Double.parseDouble(br.readLine());
                System.out.print("Enter height (in cm) = ");
                h = Double.parseDouble(br.readLine());
                
                v = 22*r*r*h/7;
                System.out.print("Volume of cylinder = "+v+" cubic centimetre");
                break;
            
            case 3:
                System.out.print("Enter radius (in cm) = ");
                r = Double.parseDouble(br.readLine());
                System.out.print("Enter height (in cm) = ");
                h = Double.parseDouble(br.readLine());
                
                v = 22*r*r*h/21;
                System.out.print("Volume of cone = "+v+" cubic centimetre");
                break;
            
            default:
                System.out.print("INVALID INPUT");
        }
    }
}