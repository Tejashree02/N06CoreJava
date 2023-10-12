package org.tnsif.jdbc.mvc;
import java.sql.SQLException;
import java.util.*;
public interface IStudentService {
	
	
	void addStudent(student1 student) throws SQLException;
	
	List<student1> getAllStudents()throws SQLException;
	
	List <student1> getStudentByPer(int value) throws SQLException;
	
	List<student1> getStudentNameStartsWih(String str) throws SQLException;
	
	int deleteAllStudents() throws SQLException;
	
	int deleteByRollno(int value) throws SQLException;
	
	int updateStudentsPer(int value) throws SQLException;
	
	int updateStudentsPerByRollno(int rvalue, int pvalue) throws SQLException;
	
}
