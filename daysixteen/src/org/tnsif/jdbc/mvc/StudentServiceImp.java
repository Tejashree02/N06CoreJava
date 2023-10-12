package org.tnsif.jdbc.mvc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImp implements IStudentService {
	Connection cn;
	Statement st;
	PreparedStatement pst;
	public StudentServiceImp() {
		cn=DBUT.getCn();
		
		try {
			st=cn.createStatement();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void addStudent(student1 student) throws SQLException {
//		String sql="INSERT INTO Student1 VALUES("+student.getRollno()+",'"+student.getName()+"',"+student.getPer()+")"
//		int n =st.executeUpdate(sql);
		pst=cn.prepareStatement("INSERT INTO Student1 VALUES(?,?,?)");
		pst.setInt(1,student.getRollno());
		pst.setString(2,student.getName());
		pst.setInt(3,student.getPer());
		int n = pst.executeUpdate();
		
		System.out.println("added");
	}

	@Override
	public List<student1> getAllStudents() throws SQLException {
		List<student1> studlist = new ArrayList<student1>() ;
		ResultSet rs= st.executeQuery("SELECT * from student1");
		while(rs.next()) {
			student1 st = new student1(rs.getInt(1),rs.getString(2),rs.getInt(3));
			studlist.add(st);
		}rs.close();
		return studlist;
		
	
	}

	@Override
	public List<student1> getStudentByPer(int value) throws SQLException {
		// TODO Auto-generated method stub
		List<student1> studlist = new ArrayList<student1>();
		pst=cn.prepareStatement("SELECT * FROM student1 Where Per>=?");
		
		pst.setInt(1, value);
		ResultSet rs= pst.executeQuery();
		while(rs.next()){
			student1 st = new student1(rs.getInt(1),rs.getString(2),rs.getInt(3));
			studlist.add(st);
		}
		rs.close();
		pst.close();
		
		return studlist;
	}

	@Override
	public List<student1> getStudentNameStartsWih(String str) throws SQLException {
		List<student1> studlist = new ArrayList<student1>();
		pst=cn.prepareStatement("SELECT * FROM student1 Where Name LIKE ?");
		
		pst.setString(1, str);
		ResultSet rs= pst.executeQuery();
		while(rs.next()){
			student1 st = new student1(rs.getInt(1),rs.getString(2),rs.getInt(3));
			studlist.add(st);
		}
		rs.close();
		pst.close();
		
		return studlist;
	}

	@Override
	public int deleteAllStudents() throws SQLException {
		return st.executeUpdate("DELETE FROM student1");
	}

	@Override
	public int deleteByRollno(int value) throws SQLException {
		int n = st.executeUpdate("DELETE FROM student1 where rollno="+value);
		return n;
	}

	@Override
	public int updateStudentsPer(int value) throws SQLException {
		pst=cn.prepareStatement("UPDATE student1 SET Per=Per+?  WHERE Per<=?");
		pst.setInt(1, value);
		pst.setInt(2, 100-value);
		int n = pst.executeUpdate();
		
		return n ;
	}

	@Override
	public int updateStudentsPerByRollno(int rvalue,int pvalue) throws SQLException {
		pst=cn.prepareStatement("UPDATE student1 SET Per=?  WHERE Rollno=?");
		pst.setInt(1, pvalue);
		pst.setInt(2, rvalue);
		int n = pst.executeUpdate();
		
		return n ;
		
	}

}
