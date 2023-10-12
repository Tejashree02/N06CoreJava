package org.tnsif.jdbc.mvc;
import java.sql.*;
import java.util.*;
import java.io.*;
public class DBUT {
	
	static Connection cn;
	static 
	{
	Properties prop = new Properties();
	try {
		prop.load(new FileInputStream("src/db.properties"));
		Class.forName(prop.getProperty("driver_name"));
		System.out.println("Driver Loaded Sucessfully !!");
		
		// establish  Connection.
		
		cn = DriverManager.getConnection(prop.getProperty("db_url"),prop.getProperty("username"),prop.getProperty("password")); // created a connection.
		System.out.println(cn);
		System.out.println("Connection Established Successfully !!");
		
		
	} catch (IOException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException  e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
//		catch (FileNotFoundException e) {
//		e.printStackTrace();
//	}
	}
	public static Connection getCn() {
	return cn;
}}
