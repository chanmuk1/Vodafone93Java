import java.util.Scanner;

public class P17_2DArrayInputOutput {

	public static void main(String[] args) {
		//CREATE ARRAY
		//int arr[][] = new int[3][3];
		//int[][] arr = new int[3][3];
		int[] arr[] = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		for(int row = 0; row< 3; row++)
		{
			for(int column = 0; column < 3; column++)
			{
				System.out.println("Enter VALUE for [" + row + "][" + column +"]");
				arr[row][column] = sc.nextInt();
			}
		}		
		
		System.out.println("DISPLAY ARRAY");
		for(int row = 0; row< 3; row++)
		{
			for(int column = 0; column < 3; column++)
			{
				System.out.print(arr[row][column] + " ");
			}
			System.out.println();
		}
	}
}