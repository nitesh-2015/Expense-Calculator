package com.rootdev.dbaccess;

import java.sql.*;

class DBConnection {
	
	private Connection con;
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	Connection getConn(){
		
		String url="jdbc:mysql://localhost:3306/calc_db";
		String uname= "root";
		String pass= "DB_root@7797";
		try {
			con=DriverManager.getConnection(url, uname, pass);
			System.out.println("Connection Established");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
}
