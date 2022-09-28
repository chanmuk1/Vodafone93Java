import java.util.Scanner;

public class P12_ForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The No ");
		int no = sc.nextInt();

		System.out.println("Enter No Upto which you want to display table ");
		int limit = sc.nextInt();

		
		System.out.println("TABLE PRINT");
		//       1     2/5       4
		for(int i = 1;i<=limit; i++)
		{
			//if true 3
			System.out.println(no + " * " + i + " = "+ (no*i));
		}
		//if  False 6
		System.out.println("OUTSIDE OF THE FOR LOOP");

		
	}

}
