import java.util.Scanner;

public class P14_DoWhileloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The No ");
		int no = sc.nextInt();

		System.out.println("Enter No Upto which you want to display table ");
		int limit = sc.nextInt();

		System.out.println("TABLE PRINT");
		//1 initialize
		int i = 1;
		do
		{
			// 2 / 5 Execute loop body
			System.out.println(no + " * " + i + " = "+ (no*i));
			//3
			i++;
		}while (i <= limit);
		      //4 Condition check if true iterate loop
		
		//if Condition false 6
		System.out.println("OUTSIDE OF DO WHILE LOOP");
	}
}