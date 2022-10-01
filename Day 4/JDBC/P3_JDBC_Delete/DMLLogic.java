package P3_JDBC_Delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DMLLogic 
{
  public void deleteRecord()
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
		   
	  String sqlquery = "delete from student where roll =?";
		   
	  pst = mysqlconnectionobj.prepareStatement(sqlquery);
	  pst.setInt(1, roll);
	  
	  int count = pst.executeUpdate();
		   
	  if(count > 0)
	     System.out.println("RECORD DELETED ");
	  else
		  System.out.println("INVALID ROLL NO ");
		   
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
