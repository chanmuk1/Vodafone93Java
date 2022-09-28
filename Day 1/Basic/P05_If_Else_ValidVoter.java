import java.util.Scanner;

public class P05_If_Else_ValidVoter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age ");
		int age = sc.nextInt();
		
		if (age >= 18)
			System.out.println("Eligible To Give Vote");
		else
			System.out.println("Not Eligible To Give Vote");

	}
}
