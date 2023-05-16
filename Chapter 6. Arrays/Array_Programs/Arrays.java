package Array_Programs;
public class Arrays {
    public static void main(String[] args) {
        int [][][] arr = new int [3][4][5];
        arr[0][0][0] = 12;
        arr[0][0][1] = 23;
        arr[0][1][0] = 34;
        arr[0][1][1] = 67;
        arr[0][1][2] = 90;
        arr[0][2][1] = 99;
        arr[1][2][4] = 108;
        arr[1][2][3] = 100;

        for (int i = 0;i<arr.length;i++){
            for (int d2arr = 0;d2arr<arr[i].length;d2arr++){
                for (int d3arr = 0;d3arr<arr[i][d2arr].length;d3arr++){
			System.out.print("Array "+i+":-\n");
			System.out.print("2-D array "+d2arr+" -> ");
			System.out.print(arr[i][d2arr][d3arr]);
                }
            }
        }
    }
}