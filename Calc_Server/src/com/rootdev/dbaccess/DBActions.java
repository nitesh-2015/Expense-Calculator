package com.rootdev.dbaccess;

import java.sql.*;

public class DBActions {
	
	DBConnection object = new DBConnection();
	private Connection con;
	
	public int insertUserDB(String s1, String s2, String s3, String s4,String s5, String s6, String s7, String s8,String s9) throws SQLException{
		con = object.getConn();
		int i=0;
		String query = "insert into user_login(user_creator, user_type, username, password, name, gender, email, phone, location) values(?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, s1);
			ps.setString(2, s2);
			ps.setString(3, s3);
			ps.setString(4, s4);
			ps.setString(5, s5);
			ps.setString(6, s6);
			ps.setString(7, s7);
			ps.setString(8, s8);
			ps.setString(9, s9);
			
			i = ps.executeUpdate();
			System.out.println("Records successfully inserted");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		con.close();
		
		return i;
	}
	
	public int updateUserDB(String s1, String s2, String s3, String s4,String s5, String s6, String s7, String s8, String s9, String s10) throws SQLException{
		con = object.getConn();
		int i=0;
		String query = "update user_login set username=?, password=?, user_type=?, name=?, gender=?, email=?, phone=?, "
				+ "location=?, modified_date=now(), modified_by=? where sno=?";
		System.out.println("Current row Id :: "+s1);
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, s2);
			ps.setString(2, s3);
			ps.setString(3, s4);
			ps.setString(4, s5);
			ps.setString(5, s6);
			ps.setString(6, s7);
			ps.setString(7, s8);
			ps.setString(8, s9);
			ps.setString(9, s10);
			ps.setString(10, s1);
			
			i = ps.executeUpdate();
			System.out.println(i +" Record successfully updated");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		con.close();
		return i;
	}
	
	public int deleteUserDB(String s1, String s2) throws SQLException{
		con = object.getConn();
		int i=0;
		String query = "update user_login set deleted='Yes', deleted_date=now(), deleted_by=? where sno=?";
		System.out.println("Current row Id :: "+s1);
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, s2);
			ps.setString(2, s1);
			
			i = ps.executeUpdate();
			System.out.println(i +" Record successfully updated");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		con.close();
		return i;
	}
	
	public int insertLog(String s1, String s2, String s3) throws SQLException{
		con = object.getConn();
		int i=0;
		String query = "insert into logs(username, session_id, login_attempt) values(?,?,?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, s1);
			ps.setString(2, s2);
			ps.setString(3, s3);
			
			i = ps.executeUpdate();
			System.out.println("Records successfully inserted");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		con.close();
		return i;
	}
	
	public int insertLeadDB(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, 
			String s10, String s11, String s12, String s13, String s14) throws SQLException{
		con = object.getConn();
		int i=0;
		String query = "insert into leads(lead_creator, name, lead_level, dob, gender, email, phone, location, address, occupation, "
				+ "income, marital, education, vehicle) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, s1);
			ps.setString(2, s2);
			ps.setString(3, s3);
			ps.setString(4, s4);
			ps.setString(5, s5);
			ps.setString(6, s6);
			ps.setString(7, s7);
			ps.setString(8, s8);
			ps.setString(9, s9);
			ps.setString(10, s10);
			ps.setString(11, s11);
			ps.setString(12, s12);
			ps.setString(13, s13);
			ps.setString(14, s14);
			
			i = ps.executeUpdate();
			System.out.println(i +" Records successfully inserted");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		con.close();
		return i;
	}
	
	public int updateLeadDB(String s1, String s2, String s3, String s4,String s5, String s6, String s7, String s8, String s9, String s10, String s11, String s12, String s13, String s14, String s15) throws SQLException{
		con = object.getConn();
		int i=0;
		String query = "update leads set name=?, lead_level=?, dob=?, gender=?, email=?, phone=?, location=?, address=?, occupation=?, income=?, marital=?, education=?, vehicle=?, "
				+ "modified_date=now(), modified_by=? where sno=?";
		System.out.println("Current row Id :: "+s1);
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, s2);
			ps.setString(2, s3);
			ps.setString(3, s4);
			ps.setString(4, s5);
			ps.setString(5, s6);
			ps.setString(6, s7);
			ps.setString(7, s8);
			ps.setString(8, s9);
			ps.setString(9, s10);
			ps.setString(10, s11);
			ps.setString(11, s12);
			ps.setString(12, s13);
			ps.setString(13, s14);
			ps.setString(14, s15);
			ps.setString(15, s1);
			
			i = ps.executeUpdate();
			System.out.println(i +" Record successfully updated");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		con.close();
		return i;
	}
	
	public int deleteLeadDB(String s1, String s2) throws SQLException{
		con = object.getConn();
		int i=0;
		String query = "update leads set deleted='Yes', deleted_date=now(), deleted_by=? where sno=?";
		System.out.println("Current row Id :: "+s1);
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, s2);
			ps.setString(2, s1);
			
			i = ps.executeUpdate();
			System.out.println(i +" Record successfully updated");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		con.close();
		return i;
	}
	
	public boolean checkSessionId(String s1, String s2) throws SQLException{
		con = object.getConn();
		boolean match = false;
		
		String query = "select session_id from logs where username = '" +s1 +"'";
		
		try{
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet res = ps.executeQuery();
			
			while(res.next())
			{
				if(res.getString("session_id").equals(s2)){
					System.out.println("Both session ids : " +res.getString("session_id") +" && " +s2);
					match = true;
					break;
				}
			}
			res.close();
			ps.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		con.close();
		return match;
	}
	
	public boolean authentication(String s1, String s2) throws SQLException{
		con = object.getConn();
		boolean match = false;
		
		String query = "select * from user_login";

		try{
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet res = ps.executeQuery();
			
			while(res.next())
			{
				if(res.getString("username").equals(s1) && res.getString("password").equals(s2)){
					match = true;
					break;
				}
			}

		}catch(Exception e){
			e.printStackTrace();
		}
		
		con.close();
		return match;
	}
	
	public String getUsertype(String s1) throws SQLException{
		con = object.getConn();
		String user_type = "";
		
		String query = "select user_type from user_login where username = '" +s1 +"'";
		try{
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet res = ps.executeQuery();
			
			while(res.next())
			{
				user_type = res.getString("user_type");	
			}

		}catch(Exception e){
			e.printStackTrace();
		}
		
		con.close();
		return user_type;
	}
	
	public String showLeadsDetails() throws SQLException{
		con = object.getConn();
		String response = "";
		String selectquery = "select * from leads where deleted = 'No'";

		try{
			PreparedStatement ps = con.prepareStatement(selectquery);
			ResultSet res = ps.executeQuery();
			while(res.next()){
				
				response = response + res.getString(1) +"///" +res.getString(3) +"///" +res.getString(4) +"///" +res.getString(9) +"\n\n\n";
				
			}
			res.close();
			ps.close();

		}catch(Exception e){
			e.printStackTrace();
		}
		con.close();
		return response;
	}
	
	public String showLeadsDetails(int i) throws SQLException{
		con = object.getConn();
		String response = "";
		String selectquery = "select * from leads where sno = " +i;
		
		try{
			PreparedStatement ps = con.prepareStatement(selectquery);
			ResultSet res = ps.executeQuery();
			while(res.next()){
				
				response = res.getString(3) +"///" +res.getString(4) +"///" +res.getString(5) +"///" +res.getString(6) +"///" +res.getString(7) +"///" +res.getString(8) +"///" +res.getString(9)
						+"///" +res.getString(10) +"///" +res.getString(11) +"///" +res.getString(12) +"///" +res.getString(13) +"///" +res.getString(14) +"///" +res.getString(15);
				
			}
			res.close();
			ps.close();

		}catch(Exception e){
			e.printStackTrace();
		}
		
		con.close();
		return response;
	}
	
	public String showUsersDetails() throws SQLException{
		con = object.getConn();
		String response = "";
		String selectquery = "select * from user_login where deleted = 'No'";

		try{
			PreparedStatement ps = con.prepareStatement(selectquery);
			ResultSet res = ps.executeQuery();
			while(res.next()){
				
				response = response + res.getString(1) +"///" +res.getString(3) +"///" +res.getString(4) +"///" +res.getString(10) +"\n\n\n";
				
			}
			res.close();
			ps.close();

		}catch(Exception e){
			e.printStackTrace();
		}
		con.close();
		return response;
	}
	
	public String showUsersDetails(int i) throws SQLException{
		con = object.getConn();
		String response = "";
		String selectquery = "select * from user_login where sno = " +i;
		
		try{
			PreparedStatement ps = con.prepareStatement(selectquery);
			ResultSet res = ps.executeQuery();
			while(res.next()){
				
				response = res.getString(3) +"///" +res.getString(4) +"///" +res.getString(5) +"///" +res.getString(6)
						+"///" +res.getString(7) +"///" +res.getString(8) +"///" +res.getString(9) +"///" +res.getString(10);
				
			}
			res.close();
			ps.close();

		}catch(Exception e){
			e.printStackTrace();
		}
		
		con.close();
		return response;
	}
	
	public int updateLeadLevel(String s1, String s2, String s3) throws SQLException{
		con = object.getConn();
		int i=0;
		String query = "update leads set lead_level=?, modified_date=now(), modified_by=? where sno=?";
		System.out.println("Current row Id :: "+s1);
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, s2);
			ps.setString(2, s3);
			ps.setString(3, s1);
			
			i = ps.executeUpdate();
			System.out.println(i +" Record successfully updated");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		con.close();
		return i;
	}
	
}
