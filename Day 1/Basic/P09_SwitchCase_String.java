import java.util.Scanner;

public class P09_SwitchCase_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any No in Word(UPPERCASE) from 1 to 5 ");
		String no = sc.next();
		
		switch (no) {
		case "ONE": {
			System.out.println("You Enter 1");
			break;
		}
		case "TWO": {
			System.out.println("You Enter 2");
			break;
		}
		case "THREE": {
			System.out.println("You Enter 3");
			break;
		}
		case "FOUR": {
			System.out.println("You Enter 4");
			break;
		}
		case "FIVE": {
			System.out.println("You Enter 5");
			break;
		}
		default:{
			System.out.println("INVALID INPUT");
			break;
		}
	  } // End Switch

	}
}
