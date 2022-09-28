import java.util.Scanner;

public class P16_1DArrayInputOutput {

	public static void main(String[] args) {
		//CREATE ARRAY
		//int arr[] = new int[5];
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i< arr.length; i++)
		{
			System.out.println("Enter " + i + " Position Int Value ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("DISPLAY ARRAY");
		for(int i = 0; i< arr.length; i++)
		{
			System.out.print(arr [i] + " ");
		}
	}

}
