// demonstrate the CRUD 

package org.tnsif.jdbc;

import java.sql.*;

public class JdbcDemo {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver"); // loads a driver
			System.out.println("Driver loaded successfully");

			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", ""); // created a connection.
			System.out.println(cn);
			System.out.println("Connection Established");
			// statement used for static queries
			Statement st = cn.createStatement();
			// Retrieving data from student table.
			ResultSet rs = st.executeQuery("SELECT * from Student1");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2)); // 1 and 2 are the column numbers.
			}
			rs.close();
			// inserting data into student table.
			int n = st.executeUpdate("INSERT INTO Student1 VALUES (19,'art',87)"); // executeQuery gives the number of
																					// Rows affected
			if (n == 1) {
				System.out.println("Record Inserted successfully");
			} else {
				System.out.println("Unable to Inserted ");
			}
			// delete students whose name start with a.
			n = st.executeUpdate("DELETE FROM Student1 WHERE Name Like 'a%'"); // executeQuery gives the number of Rows
																				// affected
			if (n >= 1) {
				System.out.println(n + "Record Deleted successfully");
			} else {
				System.out.println("No such record found ");
			}
			// update student percent increased by 5.

			
			  n=st.executeUpdate("UPDATE Student1 SET Per=Per+3"); // executeQuery gives the number of Rows affected 
			  System.out.println("Record Inserted successfully"); 
			  if (n >= 1) {
					System.out.println(n + "Record updated successfully");  
		}
		else {
			  System.out.println("Unable to Updatte "); }
			cn.close(); // if we close connection statements and result set is also closed
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
