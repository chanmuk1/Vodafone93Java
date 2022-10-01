package P5_JDBC_Update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DMLLogic 
{
  public void updateRecord()
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
		   
	  System.out.println("Enter UPDATED Email ");
	  String email = sc.next();
		   
	  System.out.println("Enter UPDATED Mobile No ");
	  String mobile = sc.next();
		   
	  String sqlquery = "update student set email=?,mobileno=? where roll=?";
	   
	  pst = mysqlconnectionobj.prepareStatement(sqlquery);
	  pst.setString(1, email);
	  pst.setString(2, mobile);
	  pst.setInt(3, roll);
		   
	  int count = pst.executeUpdate();
		   
	  if(count > 0)
	     System.out.println("RECORD UPDATED");
	  else
		  System.out.println("INVALID ROLL NO");
		   
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
