package org.tnsif.jdbc.mvc;
import java.sql.*;

//import com.mysql.jdbc.Connection;
//import java.util.ArrayList;
import java.util.List;

public class Executor {
	public static void main(String args[]) {
//		StudentServiceImp service = new StudentServiceImp();
		List<student1> studlist;
		student1 st;
		int n;
		StudentServiceImp service;
		
		try {
			service= new StudentServiceImp();
			studlist = service.getAllStudents();
			System.out.println(studlist);
			
			System.out.println("____________add_student__________________");
			st = new student1(72,"Tejashree",65);
			service.addStudent(new student1(12,"abc",76));
			service.addStudent(new student1(22,"def",65));
			service.addStudent(new student1(32,"ahi",54));
			service.addStudent(new student1(42,"jkl",74));
			service.addStudent(new student1(52,"ano",63));
			service.addStudent(new student1(62,"pqr",88));
			
			
			
			System.out.println("_____________get_by_percent______________________");
			studlist=service.getStudentByPer(76);
			System.out.println(studlist);
			
//			System.out.println("___________name_start_with_a___________________");
//			studlist=service.getStudentNameStartsWih("a%");
//			System.out.println(studlist);
			
//			System.out.println("___________________delete______________________");
//			n=service.deleteAllStudents();
//			System.out.println(n>=0?n+"records deleted!!!":"No record");
			
			
//			System.out.println("_____________delete_by_rollno_______________");
//			n=service.deleteByRollno(45);
//			System.out.println(n>=0?n+"records deleted!!!":"No record");
			
			System.out.println("_____________update_per_______________");
			n=service.updateStudentsPer(52);
			System.out.println(n>=0?n+"records updated":"No record");
			
			
			System.out.println("____________update_by_rollnumber_________________");
			n=service.updateStudentsPerByRollno(32,6);
			System.out.println(n>=0?n+"records updated":"No record");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//		java.sql.Connection cn=DBUT.getCn();
	}

}


