import java.util.Scanner;

public class P11_LogicalOperatorCheckLeapyear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ANY Year ");
		int year = sc.nextInt();
		// 1 2 4               4    5              5 2    3                                   3 1   
		if ( ( (year % 100 == 0) && (year % 400 == 0)) || ((year % 100 != 0) &&(year % 4 == 0)) )
				System.out.println(year + " IS LEAP YEAR");
			else
				System.out.println(year + " IS NOT LEAP YEAR");
	}
}
