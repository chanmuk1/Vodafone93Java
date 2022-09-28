import java.util.Scanner;

public class P06_IfElseLadder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Marks in Int ");
		int marks = sc.nextInt();
		
		if (marks >= 90)
			System.out.println("You Get A+ Grade");
		else if (marks >= 80 && marks < 90)
			System.out.println("You Get A Grade");
		else if (marks >= 70 && marks < 80)
			System.out.println("You Get B Grade");
		else if (marks >= 60 && marks < 70)
			System.out.println("You Get C Grade");
		else if (marks >= 50 && marks < 60)
			System.out.println("You Get D Grade");
		else
			System.out.println("FAIL");
	}
}
