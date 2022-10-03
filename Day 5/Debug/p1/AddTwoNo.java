package p1;

class Logic
{
    public double add(int fno, double sno)
    {
    	double sum = fno + sno;
    	return sum; 
    }
}

class AddTwoNo {

	public static void main(String[] args) {
		
		int firstno = 55;
		double secondno = 66.5;
		
		Logic obj = new Logic();
		
		double sum = obj.add(firstno, secondno);
		System.out.println("SUM IS "+ sum);

		if (sum > 100.5)
			System.out.println("Hi");
		else
			System.out.println("HELLO");
	}
}