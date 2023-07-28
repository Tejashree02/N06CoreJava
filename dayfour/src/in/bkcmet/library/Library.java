//Program to demonstrate the  access specifiers
package in.bkcmet.library;

public class Library {
	//Different access specifiers.
	public String libraryName;
	private int userId;
	int noOfBooks;
	//public method
	public void displayPublic() {
		System.out.println("Library Name: "+libraryName);
	}
	
	//private method
	private void displayPrivate() {
		System.out.println("User ID: "+userId);
	}
//	Default method
	void displayDefault() {
		
		System.out.println("Num Of Books: "+noOfBooks);
	}
}
