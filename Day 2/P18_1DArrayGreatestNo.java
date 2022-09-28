import java.util.Scanner;

public class P18_1DArrayGreatestNo {

	public static void main(String[] args) {
		//CREATE ARRAY
		int arr[] = new int[5];
				
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i< arr.length; i++)
		{
			System.out.println("Enter " + i + " Position Int Value ");
			arr[i] = sc.nextInt();
		}
		
		int big = arr[0];
		for(int i = 1; i< arr.length; i++)
		{
			if (big < arr[i])
				big = arr[i];
		}
		
		System.out.println("GREATEST NO IS "+big);
	}

}
