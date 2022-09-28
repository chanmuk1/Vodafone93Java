import java.util.Scanner;

public class AddTwoNoUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  1st No");
        int firstno = sc.nextInt();
        System.out.println("Enter 2nd No");
        double secondno = sc.nextDouble();
        System.out.println("THE SUM IS "+ (firstno + secondno));
        
        System.out.println("THE SUM OF "+ firstno + " AND "+ secondno + " IS "+(firstno + secondno) );
        //sc.close();
	}
}
