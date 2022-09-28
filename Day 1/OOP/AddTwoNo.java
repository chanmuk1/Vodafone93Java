import java.util.Scanner;
//P1
class AddLogic
{
   private int firstno;
   private double secondno;
   private double result;
   
   //AddLogic(){firstno=0;secondno=0.0;result=0.0;}
   
   public void userInput()
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter 1st No ");
	   firstno = sc.nextInt();
       System.out.println("Enter 2nd No");
       secondno = sc.nextDouble();
   }
   
   public void calc()
   {
	   result = firstno + secondno;
   }
   
   public void display()
   {
	   System.out.println("THE SUM OF "+ firstno + " AND "+ secondno + " IS "+result );
   }
}

//P2
public class AddTwoNo {

	public static void main(String[] args) {
		AddLogic obj1 = new AddLogic();
		AddLogic obj2 = new AddLogic();

		obj1.userInput();
		obj2.userInput();
		
		obj2.calc();
		obj1.calc();
		
		obj1.display();
		obj2.display();
		
	}

}
