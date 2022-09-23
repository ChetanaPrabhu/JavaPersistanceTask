package com.javaDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.JDBCConnection.JDBCConnection;
import com.javabeans.LoginForm;

public class LoginDao {


	public static boolean validate(LoginForm log)
	{
		boolean status = false;
		String sql = "select * from register where username = ? and empid = ?";

		try
		{
			PreparedStatement sts = JDBCConnection.getconnect().prepareStatement(sql);
			sts.setString(1, log.getUsername());
			sts.setString(2, log.getEmpid());
			
			ResultSet rs = sts.executeQuery();
			status = rs.next();
		
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		return status;
	}
	
	public static boolean insert(LoginForm log)
	{
		String sql = "insert into login values(?,?,CURRENT_TIMESTAMP)";
		try 
		{
			PreparedStatement sts = JDBCConnection.getconnect().prepareStatement(sql);
			sts.setString(1, log.getUsername());
			sts.setString(2, log.getEmpid());
	        //sts.setString(3, log.getDate());
	       
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
