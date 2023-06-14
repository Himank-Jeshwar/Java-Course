import java.util.*;
import java.io.*;

class MultiCuisineRestaurant{
    static void showMenu (char dish_type,char ch)throws IOException{
        File menu = new File ("menu.txt");
        boolean printNext = false;
        Scanner file = new Scanner(menu);
        String s ;

            while (file.hasNextLine()){
                s = file.nextLine();
            
                if (dish_type=='a'&&ch=='a'){
                    if (s.equals("Veg Starters"))
                        printNext = true;
                    else if (s.equals("Non Veg Starters"))
                        break;
                
                }

                else if (dish_type=='b'&&ch=='a'){
                    if (s.equals("Non Veg Starters"))
                        printNext = true;
                    else if (s.equals("Veg Main Course"))
                        break;
                }

                else if (dish_type=='a'&&ch=='b'){
                    if (s.equals("Veg Main Course"))
                        printNext = true;
                    else if (s.equals("Non Veg Main Course"))
                        break;
                }

                else if (dish_type=='b'&&ch=='b'){
                    if (s.equals("Non Veg Main Course"))
                        printNext = true;
                    else if (s.equals("Desserts"))
                        break;
                }

                else if (ch=='c'){
                    if (s.equals("Desserts"))
                        printNext = true;
                }

                if (printNext==true)
                    System.out.println(s);
            }
            file.close();
        }

    static double calculateBill (char dishCh,char dish_type,char ch,int plates,FileWriter receiptWriter)throws IOException{
        double price = 0.0,totalBill = 0.0;
        File menu = new File ("menu.txt");
        
    
        Scanner file = new Scanner(menu);
        boolean printNext = false;
        String s,priceInText = "",dishName="";
        
            outer:  
                while (file.hasNextLine()){
                    s = file.nextLine();
                    if (dish_type=='a'&&ch=='a'){
                        if (s.equals("Veg Starters"))
                            printNext = true;
                        else if (s.equals("Non Veg Starters"))
                            break;
                    
                    }
    
                    else if (dish_type=='b'&&ch=='a'){
                        if (s.equals("Non Veg Starters"))
                            printNext = true;
                        else if (s.equals("Veg Main Course"))
                            break;
                    }
    
                    else if (dish_type=='a'&&ch=='b'){
                        if (s.equals("Veg Main Course"))
                            printNext = true;
                        else if (s.equals("Non Veg Main Course"))
                            break;
                    }
    
                    else if (dish_type=='b'&&ch=='b'){
                        if (s.equals("Non Veg Main Course"))
                            printNext = true;
                        else if (s.equals("Desserts"))
                            break;
                    }
    
                    else if (ch=='c'){
                        if (s.equals("Desserts"))
                            printNext = true;
                    }
                    
                    if (printNext==true){
                        if (s.equals(""))
                            continue;
                        if (dishCh==s.charAt(0)){
                            for (int i = 1;i<s.length();i++){
                                if (Character.isDigit(s.charAt(i))){
                                    priceInText+=s.charAt(i);
                                }
                                else if (s.charAt(i)!='/'&&s.charAt(i)!='-'){
                                    dishName+=s.charAt(i);
                                }
                            }
                                    break outer;
                        }

                    }

                }
                file.close();
            
        receiptWriter.append("==============================\nPrice per plate : "+priceInText+"\n");
        receiptWriter.append("Dish Choice : "+(ch=='a'?"Starters":ch=='b'?"Main Course":"Desserts")+"\n");
       
        if (ch!='c')
            receiptWriter.append("Dish Type : "+(dish_type=='a'?"Veg\n":"Non Veg\n"));
       
        receiptWriter.append("Dish Name : "+dishName+"\n");
        receiptWriter.append("Number of plates : "+plates+"\n==============================\n\n");


        if (priceInText.equals("")==false)
            price = Double.parseDouble(priceInText);
        
        totalBill = price*plates;
        
        return totalBill;
    }
    public static void main(String[] args) throws IOException {
        char ch,dish_type='\0',more_order,dishCh;
        int plates;
        double bill = 0.0;

        FileWriter receiptWriter = new FileWriter("receipt.txt");
        File receipt = new File("receipt.txt");
        receiptWriter.write("");
        Scanner sc = new Scanner(System.in);
        Scanner readReceipt = new Scanner (receipt);

        System.out.println("MAIN MENU\n(a) Starters (b) Main Course  (c) Deserts ");
        ch = sc.next().toLowerCase().charAt(0);
        
        if (ch!='c'){
            System.out.print("Would you like to have veg(a) or non veg(b) : ");
            dish_type = sc.next().toLowerCase().charAt(0);
        }

        do{
            showMenu(dish_type,ch);

                System.out.print("Select a dish to order : ");
                dishCh = sc.next().toLowerCase().charAt(0);
                    
                System.out.print("Enter the quantity (number of plates) : ");
                plates = sc.nextInt();                    
                    
                System.out.print("Do you want to order more (y/n) : ");
                more_order = sc.next().toLowerCase().charAt(0);
                    
                bill+=calculateBill(dishCh, dish_type,ch, plates,receiptWriter);
            
            }while(more_order=='y');
                

            bill = bill+(bill*14.5/100);
            receiptWriter.append("\n\nTOTAL BILL : Rs."+bill);
            receiptWriter.close();
            
            while (readReceipt.hasNextLine()){
                System.out.println(readReceipt.nextLine());
            }
            
            readReceipt.close();
            sc.close();
            
            }
}