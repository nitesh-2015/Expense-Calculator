<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.rootdev.dbaccess.DBConnection" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>

<% 
	
	DBConnection object = new DBConnection();
	Connection con = object.getConn();
	String selectquery = "select * from user_login";

	try{
		PreparedStatement ps = con.prepareStatement(selectquery);
		ResultSet res = ps.executeQuery();
		while(res.next()){
			out.println(res.getString("id")+"<br>");
		}
		res.close();
		ps.close();

	}catch(Exception e){
		e.printStackTrace();
	}
	con.close();
	
%>