package com.javaDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.JDBCConnection.JDBCConnection;
import com.javabeans.RegisterForm;

public class RegisterDao {


	public boolean insert(RegisterForm reg)
	{
		String sql = "insert into register values(?,?,?)";
		try 
		{
			PreparedStatement sts = JDBCConnection.getconnect().prepareStatement(sql);
			sts.setString(1, reg.getUsername());
	        sts.setString(2, reg.getEmail());
	        sts.setString(3, reg.getEmpid());
	        
	        return sts.executeUpdate()>0;

		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
}
