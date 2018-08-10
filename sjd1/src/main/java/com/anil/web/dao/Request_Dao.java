package com.anil.web.dao;
import java.sql.*;

import com.anil.web.model.Request;
import com.sun.org.apache.bcel.internal.generic.Select;

public class Request_Dao {
	public Request getrequest(int id)
	{
		Request per = new Request();
		/*per.setId(100);
		per.setName("nil");
		per.setRn(591);*/
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("running1");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sjd", "root", "root");
			//System.out.println("running2");
			Statement st = con.createStatement();
			//System.out.println("running3");
			ResultSet rs = st.executeQuery("select * from t1 where id="+id);
			//System.out.println("running4");
			//rs.next();
			//System.out.println("running5");
			if(rs.next())
			{
				//System.out.println("running6");
				per.setId(rs.getInt(1));
				per.setName(rs.getString(2));
				per.setRn(rs.getInt(3));
			}
		} 
		
		catch (Exception e) {
			//System.out.println("yes Catch is running");
		
			e.printStackTrace();
		}
		
				
		return per;
	}

}
