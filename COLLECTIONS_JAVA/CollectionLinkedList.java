package demo;

import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
//Linked list similar to same as like Array list...so iam just copy the LinkedList program and modifying a little change:::
public class CollectionLinkedList {
	public static void main(String[] args) {
		List <Integer> lists = new LinkedList<>();
		lists.add(1);
		lists.add(2);
		lists.add(3);
		lists.add(4);
		lists.add(5);
		lists.add(6);
		//printing the LinkedList obj:
		System.out.println(lists);
		
		//printing the LinkedList obj using `Iterator class` and `while loop`:
		System.out.println("------------Iterating by passing `Iterator class` and `while loop`--------------"); 
		Iterator itr = lists.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());	
		
		//printing the LinkedList obj using `For Loop`:
		System.out.println("------------Iterating by passing For Loop--------------"); 
		for (int i=0;i<lists.size();i++ )
			System.out.println(lists.get(i));
			//we can set the value and get the value:
		lists.set(5,0);
		System.out.println("After set the value of index 5 : "+lists.get(5));
		
		//printing the LinkedList obj using `For Each`:
		System.out.println("------------Iterating by passing For Each Loop--------------"); 
		for (int list : lists)
			System.out.println(list);
		
		//printing the LinkedList obj using `For Each Method`:
		System.out.println("------------Iterating by passing forEach Method & lambda expression--------------"); 
		lists.forEach(list -> System.out.println(list));
		
		LinkedList<String> names= new LinkedList<>();
		names.add("satz");
		names.add("roman");
		
		names.forEach(name -> System.out.println(name));
		
		names.add(1,"sathish");
		
		System.out.println("After Adding the name");
		names.forEach(name -> System.out.println(name));
		
		LinkedList<String> names1= new LinkedList<>();
		names1.add("nandha");
		names1.add("raj");
		
		names.addAll(0,names1);
		System.out.println(names);
		System.out.println("The size of the LinkedList is : "+names.size());
		
		Collections.sort(names);
		Collections.sort(lists);

		System.out.println("After sorting : "+names);
		System.out.println("After sorting :"+lists);

		}

}
