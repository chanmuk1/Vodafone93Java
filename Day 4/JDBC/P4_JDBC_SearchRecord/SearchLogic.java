package P4_JDBC_SearchRecord;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SearchLogic 
{
	public void searchRecord()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Roll No ");
		int roll = sc.nextInt();
		  
		PreparedStatement pst = null;
		ResultSet rs = null;
		Connection mysqlconnectionobj = null;
		try
		{
			//STEP - 3 GET CONNECTION OBJECT
			mysqlconnectionobj = MySQLDBConnect.getMySQLConnection();
	    
		   //STEP - 4 CREATE QUERY
			String sqlquery = "select * from student where roll = ?";
			pst = mysqlconnectionobj.prepareStatement(sqlquery);
			pst.setInt(1, roll);
		  	
		  // STEP 5 - EXECUTE QUERY 
		  rs = pst.executeQuery();
		  boolean flag = false;
		  // STEP 6 - PROCESS RECEIVED DATA/RECORD FROM DATABASE
		  while (rs.next())
		  {
			flag = true;
			System.out.println("Roll is " + rs.getInt(1));
			System.out.println("Name is " + rs.getString(2));
			System.out.println("Email id is " + rs.getString(3));
			System.out.println("Mobile No is " + rs.getString(4));
			System.out.println();
		  }
		  
		  if(flag == false)
			  System.out.println("INVALID ROLL NO");
			   
		} catch (SQLException e) { e.printStackTrace();}
		  finally 
		  { // CLOSE CONNECTION
			try 
			{
			  if(pst != null)
				pst.close();	
					
			  if(rs != null)
				pst.close();
			  
			  if(mysqlconnectionobj != null)
				mysqlconnectionobj.close();
			
			} catch (SQLException e) {e.printStackTrace();}
		 }
	}
}
