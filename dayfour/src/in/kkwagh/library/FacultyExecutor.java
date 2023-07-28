//Program to demonstrate the  access specifiers
//Driver class
package in.kkwagh.library;
//import in.bkcmet.library.*; for including all the classes
import in.bkcmet.library.Library; 
public class FacultyExecutor {

	public static void main(String[] args) {
		Library lib = new Library();
		lib.libraryName= "Bhujbal Library";
		lib.displayPublic();
		
//		User id and displayPrivate method is private so we can access into another package or class only we can access inside the same clas.
//		lib.userId=110;
//		lib.displaayPrivate()
//		lib.noOfBooks=8;  cannot access; default is accessed in the same package.
		
		
	}

}
