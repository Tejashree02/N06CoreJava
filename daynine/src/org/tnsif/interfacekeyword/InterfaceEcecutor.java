package org.tnsif.interfacekeyword;
//driver class
public class InterfaceEcecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we can't instantiate an interface.
		//Sony S= new Sony();
		
		SonyTV s= new SonyTV();
		s.display();
		s.show();
		Sony.accept(); // to call an static method we use (Interfcaename.staticmethod)
		
		
		//chandrayaan isro
		ISRO i= new  ISRO();
		i.status();
		
		
		Humans h= new Humans();
		h.showdrink();
	}

}
