package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Indexservlet")
public class Indexservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public Indexservlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		String id = request.getParameter("empid");
	
		 out.println("<html><body>");
	        
	        try
	        {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con  =  DriverManager.getConnection("jdbc:mysql://localhost:3306/soprasteria", "root", "Yaari@123");
	            java.sql.Statement stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery("select * from login where empid = "+id+"");
	            out.println("<table border=1 width=50% height=50%>");  
	            out.println("<tr><th>Employee ID</th><th>Employee Name</th><th>Login Time</th><tr>");  
	            while(rs.next())
	            {
	                String n = rs.getString("username");  
	                String nm = rs.getString("empid");  
	                String s = rs.getString("time");   
	                out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td></tr>");
	            }
	            out.println("</table>");  
	            
	            out.println("</html></body>");  
	            con.close();
	            
	        }
	        catch (ClassNotFoundException | SQLException e)
	        {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }



	   /**
	     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	     */
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        // TODO Auto-generated method stub
	        doGet(request, response);
	    }




		
	}

	