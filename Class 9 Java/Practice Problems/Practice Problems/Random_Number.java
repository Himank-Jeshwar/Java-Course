class Random_Number{
    public static void main(){
        int randNum = (int)(Math.random()*(125-95))+95;
        switch(randNum){
            case 95:
                System.out.print("Ninety-five");
                break;
            case 96:
                System.out.print("Ninety-six");
                break;
            case 97:
                System.out.print("Ninety-seven");
                break;
            case 98:
                System.out.print("Ninety-eight");
                break;
            case 99:
                System.out.print("Ninety-nine");
                break;
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
                double c_root = 0.0;
                c_root = Math.cbrt(randNum);
                System.out.print("Cube root = "+c_root);
                break;
            default:
                double s_root = 0.0;
                s_root = Math.sqrt(randNum/2.0);
                System.out.print("Square root = "+s_root);
        }
    }
}