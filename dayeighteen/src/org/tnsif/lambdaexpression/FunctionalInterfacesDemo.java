package org.tnsif.lambdaexpression;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class FunctionalInterfacesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> mySupplier;
		mySupplier= ()->"Hello";
		System.out.println(mySupplier.get());
		
		Consumer<Integer> myConsumer;
		
		myConsumer =(n)-> {if(n>0) System.out.println(n+" positive");
		else 
			System.out.println(n+" Negative");
		};
		
		myConsumer.accept(10);
		myConsumer.accept(-10);
		
		
		Predicate<Integer> numbers;
		
		numbers=(no)->no%2==0;
		System.out.println(numbers.test(10)? "Even":"Odd");
		System.out.println(numbers.test(11)? "Even":"Odd");
		
		Function<Integer,String>fun;
		fun=(no)->no>0?"positive":"negative or zero";
		System.out.println(fun.apply(10));
		System.out.println(fun.apply(0));
		
		
		fun=(no)->no%2==0?"even":"odd";
		System.out.println(fun.apply(10));
		System.out.println(fun.apply(21));
		
		BiFunction<Integer,Integer,Integer> bfun;
		bfun=(a,b)-> a>b?a:b;
		System.out.println("Maximun is"+ bfun.apply(10, 20));
		
		bfun=(a,b)->a<b?a:b;
		System.out.println("Minimum is"+ bfun.apply(10,20));
		
		bfun=(a,b)->a+b;
		System.out.println("Addition is"+ bfun.apply(10,20));
		
		
		BiFunction<String, String, String> fun1;
		fun1=(s1,s2)->s1.equals(s2)?"Same":"Not Same";
		
		System.out.println(fun1.apply("Hello", "Hello"));
		System.out.println(fun1.apply("Hello", "Hi"));
		
	}

}
