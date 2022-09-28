import java.util.Scanner;

public class P07_SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Int No from 1 to 5 ");
		int no = sc.nextInt();
		
		switch (no) {
		case 1: {
			System.out.println("You Enter ONE");
			break;
		}
		case 2: {
			System.out.println("You Enter TWO");
			break;
		}
		case 3: {
			System.out.println("You Enter THREE");
			break;
		}
		case 4: {
			System.out.println("You Enter FOUR");
			break;
		}
		case 5: {
			System.out.println("You Enter FIVE");
			break;
		}
		default:{
			System.out.println("INVALID INPUT");
			break;
		}
	  } // End Switch
	} //End Main Function
} //End Class
