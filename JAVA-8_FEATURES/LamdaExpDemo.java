package demo;

import java.util.*;
import java.util.stream.Collectors;

//What is lambda expression?
//Lambda expression is provide Code functionality and code concise.it's lot of times savings.
//also reduce lots of code

interface Interface {
	public void abstractMethod1();
}

interface Interface_1 {
	public String abstractMethod2(int a, int b);
}

public class LamdaExpDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= 10; i++)
			list.add(i);

		
		list.forEach(n -> System.out.println(n));// lambda expresion in ForEach method
		
		
		list.forEach(n -> {
			String res = (n == 0 || n == 2 || n == 4 || n == 6 || n == 8 || n == 10) ? "yes this is Even number"
					: "yes this is Odd number";
			System.out.println(res);
		});
		
		long count = list.stream().count();
		System.out.println("the total count of list is " +count);
		
		
		list.stream().filter(n ->n>=5).forEachOrdered(n ->System.out.println(n));
		
		
		List <Integer> lists=list.stream().map(n -> n+100).collect(Collectors.toList());
		lists.forEach(System.out::println);
		
		
		// Anonmyous interface class......without lambda:

//		Interface obj = new Interface() {
//			public void abstractMethod1() {
//				System.out.println("iam abstract method one ...");
//			}
//		};

		// with lambda expression:
		//Interface class 1
		Interface obj = () -> System.out.println("iam abstract method one ...");
		obj.abstractMethod1();

		//Interface class 2
		Interface_1 obj1 = (a, b) -> {
			String res = (a > b) ? "yes a is Greater than" : "yes a is smaller than";
			return res;
		};
		String res = obj1.abstractMethod2(50, 100);
		System.out.println(res);
	}
}
