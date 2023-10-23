package org.tnsif.hash;
import java.util.*;
import java.util.Map.Entry;

public class TreeMapDemo {
// ordered, sorted.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> persons = new TreeMap<String, String>();
		
		persons.put("abc@gmail.com", "abc");
		persons.put("xyz@gmail.com", "xyz");
		persons.put("pqr@gmail.com", "pqr");
		persons.put("tejashree@gmail.com", "tejashree");
		persons.put("gauri@gmail.com", "gauri");
		persons.put("gauri@gmail.com", "gauri patil");
		System.out.println(persons);
		// null keys are allowed null values are not allowed.
		
		System.out.println(persons.containsKey("abc@gmail.com"));
		System.out.println(persons.containsValue("abc"));
		
//	    Enumeration<String> em = persons.elements();
//	    while(em.hasMoreElements()) {
//	    	String k = em.nextElement();
//	    	System.out.println(k+" "+persons.get(k));    // elements retrieves for only values of keys.
//	    }
	    
	    System.out.println("______________________________________");
	    System.out.println(persons.get("pqr@gmail.com"));
	    
	    System.out.println("--------------------------------------");
	    Set<Entry<String,String>> dict = persons.entrySet();
	    System.out.println(dict);
	    Iterator<Entry<String,String>> it = dict.iterator();
	    while(it.hasNext()) {
	    	Entry<String, String> rec= it.next();
	    	System.out.println(rec.getKey()+" "+rec.getValue());
	    }
	    System.out.println("__________________________________________");
	    
	    Comparator<Student> comp=(s1,s2)->{ return
	  		  s1.getName().compareTo(s2.getName()); };
	    
	    
	    TreeMap<Student,String> sm = new TreeMap<Student,String>(comp);
	    sm.put(new Student(101,"abc",78), "Mumbai");
	    sm.put(new Student(102,"pqr",56), "pune");
		sm.put(new Student (13,"xyz",88), "nashik");
		System.out.println(sm);
	}

}
