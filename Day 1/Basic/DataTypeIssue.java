
public class DataTypeIssue {

	public static void main(String[] args) {
		byte x = 5;
		//byte y = x * 2;
		
		int y1 = x * 2;
		byte y2 =(byte)(x * 2);
	}

}
