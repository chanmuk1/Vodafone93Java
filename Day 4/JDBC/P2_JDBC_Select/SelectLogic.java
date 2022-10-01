package P2_JDBC_Select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectLogic 
{
	public void fetchAllRecord()
	{
		PreparedStatement pst = null;
		ResultSet rs = null;
		Connection mysqlconnectionobj = null;
		try
		{
			//STEP - 3 GET CONNECTION OBJECT
			mysqlconnectionobj = MySQLDBConnect.getMySQLConnection();
	    
		   //STEP - 4 CREATE QUERY
		   String sqlquery = "select * from student";
		   pst = mysqlconnectionobj.prepareStatement(sqlquery);
		  	
		  // STEP 5 - EXECUTE QUERY 
		  rs = pst.executeQuery();
		
		  // STEP 6 - PROCESS RECEIVED DATA/RECORD FROM DATABASE
		  while (rs.next())
		  {
			System.out.println("Roll is " + rs.getInt(1));
			System.out.println("Name is " + rs.getString(2));
			System.out.println("Email id is " + rs.getString(3));
			System.out.println("Mobile No is " + rs.getString(4));
			System.out.println();
		  }
			   
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
