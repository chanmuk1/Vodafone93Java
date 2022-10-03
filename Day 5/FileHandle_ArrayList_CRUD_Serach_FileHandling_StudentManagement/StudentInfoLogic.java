package FileHandle_ArrayList_CRUD_Serach_FileHandling_StudentManagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class StudentInfoLogic 
{
	private Scanner sc = new Scanner(System.in);
    private String reply="";
    
    private ArrayList<StudentInfoModel> studentarraylist = new ArrayList<StudentInfoModel>();
    
    public void addNewStudent()
	{
       do
       {
    	  System.out.println();
    	  System.out.println("Enter New Student Information ");
    	  
    	  StudentInfoModel studentobj = new StudentInfoModel();
		  
    	  System.out.println("Enter Roll ");
    	  studentobj.setRoll(sc.nextInt());
	    
	      System.out.println("Enter Name ");
	      studentobj.setName(sc.next());
	    
	      System.out.println("Enter Sub1 Marks ");
	      studentobj.setSub1(sc.nextDouble());
	    
	      System.out.println("Enter Sub2 Marks ");
	      studentobj.setSub2(sc.nextDouble());
	      
	      studentobj.setTotalmarks(studentobj.getSub1() + studentobj.getSub2());
	      
	      studentarraylist.add(studentobj);
	      
	      System.out.println("Want To Add More Student Y/N");
		  reply = sc.next();
		  		
	    }while(reply.equalsIgnoreCase("y"));
	}
    
    public void searchStudentByRoll()
   	{
    	System.out.println("Enter Roll No ");
    	int roll = sc.nextInt();
    	StudentInfoModel tempstobj = null;
    	
    	//SEARCH OBJECT BY ROLL NO IN THE ARRAY LIST
    	for(StudentInfoModel stobj:studentarraylist)
		{
    		if (stobj.getRoll() == roll)
    		{
    			tempstobj = stobj;
    			break;
    		}
		}
    	
    	if(tempstobj != null)
    	{
    	   	System.out.println("Roll No is "+ tempstobj.getRoll());
    	   	System.out.println("Name is "+ tempstobj.getName());
    	   	System.out.println("Sub1 Marks is "+ tempstobj.getSub1());
    	   	System.out.println("Sub2 Marks is "+ tempstobj.getSub2());
    	   	System.out.println("Total Marks is "+ tempstobj.getTotalmarks());
    	   	System.out.println();
    	}
    	else
    		System.out.println("INVALID ROLL NO ");
   	}
    
    public void updateStudentDetailsByRoll()
   	{
    	System.out.println("Enter Roll No ");
    	int roll = sc.nextInt();
    	StudentInfoModel tempstobj = null;
    	int loc = -1;
    	//SEARCH OBJECT BY ROLL NO IN THE ARRAY LIST
    	for(int index =0; index < studentarraylist.size();index++)
		{
    		tempstobj = studentarraylist.get(index);
    		if (tempstobj.getRoll() == roll)
    		{
    			loc = index;
    			break;
    		}
		}
    	//CHECK OBJECT IS FOUND OR NOT
        if(loc != -1)
        {
        	//IF OBJECT IS FOUND
           //TAKE UPDATED VALUE
           System.out.println("Enter Name ");
           tempstobj.setName(sc.next());
   	    
   	       System.out.println("Enter Sub1 Marks ");
   	       tempstobj.setSub1(sc.nextDouble());
   	    
   	       System.out.println("Enter Sub2 Marks ");
   	       tempstobj.setSub2(sc.nextDouble());
   	      
   	       tempstobj.setTotalmarks(tempstobj.getSub1() + tempstobj.getSub2());
		
   	       //UPDATE ARRAY LIST
   	       studentarraylist.set(loc, tempstobj);
   	       
   	       System.out.println("Student Information Updated ");
        }
        else
        	System.out.println("INVALID ROLL NO ");
   	}
    
    public void sortObjectByTotalMarks()
   	{
    	Collections.sort(studentarraylist);
   	}
    
    public void deleteStudent()
   	{
    	System.out.println("Enter Roll No ");
    	int roll = sc.nextInt();
    	StudentInfoModel tempstobj = null;
    	
    	//SEARCH OBJECT BY ROLL NO IN THE ARRAY LIST
    	//IF FOUND STORE IT IN TEMP OBJ
    	for(StudentInfoModel stobj:studentarraylist)
		{
    		if (stobj.getRoll() == roll)
    		{
    			tempstobj = stobj;
    			break;
    		}
		}
    	//CHECK OBJECT IS FUND OR NOT
        if(tempstobj != null)
        {
        	//IF OBJECT IS FOUND
        	// REMOVE OBJECT FROM ARRAYLIST
        	studentarraylist.remove(tempstobj);
			System.out.println("Student Information Deeted ");
        }
        else
        	System.out.println("INVALID ROLL NO ");
   	}
        
    public void displayAllStudents()
	{   
    	System.out.println("ALL STUDENTS DETAILS ");
    	//FOR EACH LOOP
		for(StudentInfoModel stobj:studentarraylist)
		{
		   System.out.println("Roll No is "+ stobj.getRoll());
		   System.out.println("Name is "+ stobj.getName());
		   System.out.println("Sub1 Marks is "+ stobj.getSub1());
		   System.out.println("Sub2 Marks is "+ stobj.getSub2());
		   System.out.println("Total Marks is "+ stobj.getTotalmarks());
		   System.out.println();
	    }
	}
    
    public void writeArrayListToFile()
	{
	  try	
	  {
		FileOutputStream fout = new FileOutputStream("D:\\Student.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		//WRITE ARRAYLIST OBJECT INTO FILE 
		oout.writeObject(studentarraylist);
		
		System.out.println("FILE WRITING DONE....");
	  
	  }catch(FileNotFoundException e){System.out.println(e.toString());}
	   catch(IOException e) {System.out.print(e.toString());}
	   catch(Exception e) {System.out.print(e.toString());}
	}
	
	public void readArrayListFromFile()
	{
	  try
	  {
		FileInputStream fin=new FileInputStream("D:\\Student.txt");
		ObjectInputStream oin=new ObjectInputStream(fin);
		//READ DATA FROM FILE AND STORE IT IN ARRAYLIST 
		studentarraylist = (ArrayList<StudentInfoModel>)oin.readObject();
	  
		System.out.println("READING FROM FILE COMPLETED.....");
	  }catch(FileNotFoundException e){System.out.println(e.toString());}
	   catch(IOException e) {System.out.print(e.toString());}
	   catch(Exception e) {System.out.print(e.toString());}
	}	
}