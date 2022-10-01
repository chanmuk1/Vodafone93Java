package P1_JDBC_Insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DMLLogic 
{
  public void insertRecord()
  {
	PreparedStatement pst = null;
	Connection mysqlconnectionobj = null;
	try
	{
	   mysqlconnectionobj = MySQLDBConnect.getMySQLConnection();
    
	  //USER INPUT
	  Scanner sc = new Scanner(System.in);
		   
      System.out.println("Enter Roll No ");
	  int roll = sc.nextInt();
		   
	  System.out.println("Enter Name ");
	  String name = sc.next();
		   
	  System.out.println("Enter Email ");
	  String email = sc.next();
		   
	  System.out.println("Enter Mobile No ");
	  String mobile = sc.next();
		   
	  String sqlquery = "insert into student(roll,name,email,mobileno) values(?,?,?,?)";
		   
	  pst = mysqlconnectionobj.prepareStatement(sqlquery);
	  pst.setInt(1, roll);
	  pst.setString(2, name);
	  pst.setString(3, email);
	  pst.setString(4, mobile);
		   
	  int count = pst.executeUpdate();
		   
	  if(count > 0)
	     System.out.println("No of RECORD INSERTED = " + count);
		   
	} catch (SQLException e) { e.printStackTrace();}
	  finally 
	  { // CLOSE CONNECTION
		try 
		{
		  if(pst != null)
			pst.close();	
				
		  if(mysqlconnectionobj != null)
			mysqlconnectionobj.close();
		
		} catch (SQLException e) {e.printStackTrace();}
	 }
  }
}
