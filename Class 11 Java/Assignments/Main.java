import java.util.*;
public class Main {
	public static void main(String args[]) {
        	int arr[] = new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}