package org.tnsif.hash;
import java.util.*;

import java.util.Map.Entry;
public class LinkedHashMapDemo {
//ordered and unsorted
	public static void main(String[] args) {
		LinkedHashMap<String, String> persons = new LinkedHashMap<String, String>();
		
		persons.put("abc@gmail.com", "abc");
		persons.put("xyz@gmail.com", "xyz");
		persons.put("pqr@gmail.com", "pqr");
		persons.put("tejashree@gmail.com", "tejashree");
		persons.put("gauri@gmail.com", "gauri");
		persons.put("gauri@gmail.com", "gauri patil");
//		persons.put("asd@gmail.com", null);       // we cannot insert null key or null value. null pointer exception will be displayed.
		System.out.println(persons);
		
		System.out.println(persons.containsKey("abc@gmail.com"));
		System.out.println(persons.containsValue("abc@gmail.com"));
		
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
	    System.out.println("--------------------------------------");

	    LinkedHashMap<Student, String> person = new LinkedHashMap<Student, String>();
		
		person.put(new Student(101,"abc",67), "Mumbai");
		person.put(new Student(102,"pqr",32), "pune");
		person.put(new Student(103,"xyz",73), "nashik");
//		person.put("tejashree@gmail.com", "tejashree");
//		person.put("gauri@gmail.com", "gauri");
	}

}
