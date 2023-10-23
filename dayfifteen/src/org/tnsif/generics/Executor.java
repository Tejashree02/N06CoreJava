package org.tnsif.generics;
import java.util.*;
public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer arr[]= {5,10,15,20};
		String str[]={"Python","java","Cpp","C"};
		Float prices[]= {56.06f,56f,98.98f};
		
		ArrayOperations.display(arr);
		ArrayOperations.display(str);
		ArrayOperations.display(prices);
		
		Student st[]= new Student[] { new Student(20,"abc",87),new Student(30,"def",78),new Student(40,"ghi",89),new Student(50,"pqr",56),new Student(60,"xyz",99)};
		ArrayOperations.display(st);

		ArrayOperations.sortArray(arr);
		ArrayOperations.display(arr);
		ArrayOperations.sortArray(str);
		ArrayOperations.display(str);
		ArrayOperations.sortArray(prices);
		ArrayOperations.display(prices);
		
		ArrayOperations.display(st);
		
		
		System.out.println("--------------------------");
		Integer val=10;
		Float f=20f;
		GenericConstruction obj=new GenericConstruction(val);
		obj.show();
		
		obj=new GenericConstruction(f);
		obj.show();
		
		System.out.println("--------------------------");
		MinMaxImp<Integer> intObj=new MinMaxImp<Integer>(arr);
		System.out.println("Minimum of Int array is : "+intObj.getMinimum());
		System.out.println("Maximum of Int array is : "+intObj.getMaximum());
		
		
		MinMaxImp<String> strObj=new MinMaxImp<String>(str);
		System.out.println("Minimum of String array is : "+strObj.getMinimum());
		System.out.println("Maximum of String array is : "+strObj.getMaximum());
		
		MinMaxImp<Float> floatObj=new MinMaxImp<Float>(prices);
		System.out.println("Minimum of Float array is : "+floatObj.getMinimum());
		System.out.println("Maximum of Float array is : "+floatObj.getMaximum());
		
		Employee emp[]=new Employee[] {new Employee(2000, "Meet", 67000, "Jr. Software Developer"), new Employee(4000, "Pankaj", 45000, "Accountant"), new Employee(1000, "Prakash", 120000, "Manager")};
		
		MinMaxImp<Employee> empObj=new MinMaxImp<Employee>(emp);
		System.out.println("Minimum of Employee array is : "+empObj.getMinimum());
		System.out.println("Maximum of Employee array is : "+empObj.getMaximum());
		
		
		System.out.println("--------------------------");
		
		List<Integer> intList=Arrays.asList(arr);
		LowerBoundedWildCard objOne=new LowerBoundedWildCard();
		objOne.displayNumbers(intList);
		
		
		List<String> strList=Arrays.asList(str);
		//objOne.displayNumbers(strList);
		
		List<Float> floatList=Arrays.asList(prices);
//		objOne.displayNumbers(floatList);
		
		Byte[] larray= {12,56,77,78};
		List<Byte> longList=Arrays.asList(larray);
//		objOne.displayNumbers(longList);
		
		Number numArray[]= {12.0,77.0,55.0}; 
		List<Number> numList=Arrays.asList(larray);
		objOne.displayNumbers(numList);
		
		UpperBoundWildCard objTwo=new UpperBoundWildCard();
		System.out.println(objTwo.sumOfList(numList));
		System.out.println(objTwo.sumOfList(floatList));
		System.out.println(objTwo.sumOfList(intList));
		
		
		
	}

}
