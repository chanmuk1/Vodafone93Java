import java.util.Scanner;

public class P13_WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The No ");
		int no = sc.nextInt();

		System.out.println("Enter No Upto which you want to display table ");
		int limit = sc.nextInt();

		
		System.out.println("TABLE PRINT");
		//1
		int i = 1;
		//         2/5
		while (i <= limit)
		{
			//If true 3 
			System.out.println(no + " * " + i + " = "+ (no*i));
			// 4
			i++;
		}
		//if false 6
		System.out.println("OUTSIDE OF THE WHILE LOOP");

	}

}
