package com.srm.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCTester {

	public static void main(String[] args) {
		
		
		JDBCTester obj = new JDBCTester();
		String status;
		try {
			
			//status = obj.insertUserLoginDetails("chinnasamy","erode");
			//System.out.println(status);
			
			//status = obj.updateUserLoginDetails("chinnasamy","singanallur");
			//System.out.println(status);
			
			//status = obj.deleteLoginDetails("govindsamy","bhavani");
			//System.out.println(status);
			
			
			status= obj.checkUserNameAndPassword("srmari","chinnasamy");
			System.out.println("User Status :"+status);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
	
	public String insertUserLoginDetails(String userName,String password) throws SQLException{
		String status ="";
		Connection con=null;
		try {
			con = MyDBEngine.getDBConnection();
			Statement st =con.createStatement();
			String query="insert into login values('"+userName+"','"+password+"')";
			int value  =st.executeUpdate(query);
			if(value>0){
				status="Login details inserted successfully";
			}
					
		} catch (SQLException e) {
			con.rollback();
			e.printStackTrace();
		}finally{
			if(!con.isClosed()){
				con.close();
			}
		}
		
		return status;
		
	}
	
	public String updateUserLoginDetails(String userName,String password) throws SQLException{
		String status ="";
		Connection con=null;
		try {
			con = MyDBEngine.getDBConnection();
			Statement st =con.createStatement();
			String query="update login set pwd='"+password+"' where username='"+userName+"'";
			int value  =st.executeUpdate(query);
			if(value>0){
				status="Login details updated successfully";
			}
			
						
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(!con.isClosed()){
				con.close();
			}
		}
		
		return status;
		
	}
	
	public String deleteLoginDetails(String userName,String password) throws SQLException{
		String status ="";
		Connection con=null;
		try {
			con = MyDBEngine.getDBConnection();
			Statement st =con.createStatement();
			String query="delete from login where username='"+userName+"' and pwd='"+password+"'";
			int value  =st.executeUpdate(query);
			if(value>0){
				status="Login details deleted successfully";
			}else{
				status="Login details not deleted successfully";	
			}
						
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(!con.isClosed()){
				con.close();
			}
		}
		
		return status;
		
	}
		
	
	public String checkUserNameAndPassword(String inputUserName,String inputPassword) throws SQLException{
		String userName = null;
		String pwd = null;
		String status ="";
		Connection con=null;
			try {
				con = MyDBEngine.getDBConnection();
				Statement st= con.createStatement();
				String query="select * from login where username='"+inputUserName+"' and pwd='"+inputPassword+"'";
				System.out.println(query);
				ResultSet rs =st.executeQuery(query);
				while(rs.next()){
					userName = rs.getString("username");
					System.out.println("User Name :"+userName);
					pwd = rs.getString("pwd");
					System.out.println("Password :"+pwd);
				}
				
				if(userName!=null&&pwd!=null&userName.equals(inputUserName)&&pwd.equals(inputPassword)){
					status="User is existing";	
				}else{
					status="User is not existing";	
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				if(!con.isClosed()){
					con.close();
				}
			}
		  	return status;
		}

	
}
