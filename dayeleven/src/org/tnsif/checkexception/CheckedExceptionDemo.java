package org.tnsif.checkexception;
import java.io.FileInputStream;
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
		FileInputStream f = new FileInputStream("C:\\Users\\Tejashree\\OneDrive\\Desktop\\java.txt");
		System.out.println("File is exist");
	}
		
	catch(Exception e)
	{
		System.out.println("exception handeled "+e);
	}
	}
}
