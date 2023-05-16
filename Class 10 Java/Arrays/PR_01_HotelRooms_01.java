import java.util.*;
class PR_01_HotelRooms_01{
    String names[];
    int R[][];
    int roomNum,copy;
    PR_01_HotelRooms_01(){
        names = new String [50*10];
        R = new int [10][50];
        roomNum = 1;
        copy = roomNum;
        for (int i = 0;i<10;i++){
            for (int j = 0;j<50;j++){
                R[i][j] = copy;
                copy++;
            }
        }
    }

    void bookRoom(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        names[roomNum-1] = sc.nextLine();
        roomNum++;
    }
    void displayDetails(){

        System.out.println("\nFLOOR\tROOMS\tCUSTOMER NAME\n");
        for (int i = 0;i<10;i++){

            for (int j = 0;j<50;j++){
                System.out.print(i+"\t"+R[i][j]+"\t");
                if (names[R[i][j]-1]==null)
                    System.out.println("vacant");
                else 
                    System.out.println(names[R[i][j]-1]);

            }
            System.out.println();    
        }
    }

    public static void main(String[] args) {
        PR_01_HotelRooms_01 hotel = new PR_01_HotelRooms_01();
        hotel.bookRoom();
        hotel.bookRoom();
        hotel.bookRoom();
        hotel.displayDetails();
    }
}