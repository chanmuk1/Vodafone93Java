package FileHandle_ArrayList_CRUD_Serach_FileHandling_StudentManagement;

import java.util.Scanner;

public class StudentArrayListMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String reply="";
		StudentInfoLogic obj1 = new StudentInfoLogic();
		int userchoiceoption;
		do
		{
			// MENU DISPLAY
			System.out.println("1. ADD STUDENT ");
			System.out.println("2. SEARCH STUDENT ");
			System.out.println("3. UPDATE STUDENT DETAILS ");
			System.out.println("4. SORT STUDENTS BY THEIR MARKS ");
			System.out.println("5. DELETE STUDENT ");
			System.out.println("6. DISPLAY ALL STUDENT ");
			
			// USE CHOICE INPUT
			System.out.println("ENTER UR CHOICE ");
			userchoiceoption = sc.nextInt();
			
			//CALL METHOD ACCORDINGLY
			switch(userchoiceoption)
			{
			  case 1 : obj1.addNewStudent();
			           obj1.writeArrayListToFile();
			           break;
			  
			  case 2: 
	               	   obj1.readArrayListFromFile();
	               	   obj1.searchStudentByRoll();
	                   break;
			  
			  case 3: 
		               obj1.readArrayListFromFile();
		               obj1.updateStudentDetailsByRoll();
		               System.out.println("After Update ");
		   		       obj1.displayAllStudents();
		   		       obj1.writeArrayListToFile();
	                   break;         
			  
			  case 4: 
			           obj1.readArrayListFromFile();
			           obj1.sortObjectByTotalMarks();
			           System.out.println("After Sort ");
			   		   obj1.displayAllStudents();
		               break;
			  
			  case 5: 
		           	   obj1.readArrayListFromFile();
		           	   obj1.deleteStudent();
		           	   obj1.displayAllStudents();
		           	   System.out.println("After Delete ");
		           	   obj1.writeArrayListToFile();
		           	   break;
			  
			  case 6: 
				      obj1.readArrayListFromFile();
				      obj1.displayAllStudents();
			          break;
			  
			  default :
				  System.out.println("PLZ ENTER VALID OPTION ");
			
			}
			
			// ASKING FOR CONTINUATION
			System.out.println("Want To GO TO MAIN MENU Y/N");
			reply = sc.next();
			
		}while(reply.equalsIgnoreCase("y"));

	}

}
