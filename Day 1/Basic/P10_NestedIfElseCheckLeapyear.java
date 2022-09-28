import java.util.Scanner;

public class P10_NestedIfElseCheckLeapyear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ANY Year ");
		int year = sc.nextInt();
		
		if (year % 100 == 0)
		{
			if (year % 400 == 0)
				System.out.println(year + " IS LEAP YEAR");
			else
				System.out.println(year + " IS NOT LEAP YEAR");
		}
		else
		{
			if (year % 4 == 0)
				System.out.println(year + " IS LEAP YEAR");
			else
				System.out.println(year + " IS NOT LEAP YEAR");
		}
	}

}
