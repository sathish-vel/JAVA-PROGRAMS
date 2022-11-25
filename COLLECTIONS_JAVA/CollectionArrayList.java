/*
-->Java ArrayList class uses a dynamic array
-->for storing the elements. It is like an array, but there is no size limit. We can add or remove elements anytime.
-->The ArrayList in Java can have the duplicate elements also. 
-->The ArrayList maintains the insertion order internally. 
 */
package demo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class CollectionArrayList {
	public static void main(String[] args) {
	List <Integer> lists = new ArrayList<>();
	lists.add(1);
	lists.add(2);
	lists.add(3);
	lists.add(4);
	lists.add(5);
	lists.add(6);
	//printing the Arraylist obj:
	System.out.println(lists);
	
	//printing the Arraylist obj using `Iterator class` and `while loop`:
	System.out.println("------------Iterating by passing `Iterator class` and `while loop`--------------"); 
	Iterator itr = lists.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());	
	
	//printing the Arraylist obj using `For Loop`:
	System.out.println("------------Iterating by passing For Loop--------------"); 
	for (int i=0;i<lists.size();i++ )
		System.out.println(lists.get(i));
		//we can set the value and get the value:
	lists.set(5,0);
	System.out.println("After set the value of index 5 : "+lists.get(5));
	
	//printing the Arraylist obj using `For Each`:
	System.out.println("------------Iterating by passing For Each--------------"); 
	for (int list : lists)
		System.out.println(list);
	
	//printing the Arraylist obj using `For Each Method`:
	System.out.println("------------Iterating by passing forEach Method & lambda expression--------------"); 
	lists.forEach(list -> System.out.println(list));
	
	ArrayList<String> names= new ArrayList<>();
	names.add("satz");
	names.add("roman");
	
	names.forEach(name -> System.out.println(name));
	
	names.add(1,"sathish");
	
	System.out.println("After Adding the name");
	names.forEach(name -> System.out.println(name));
	
	ArrayList<String> names1= new ArrayList<>();
	names1.add("nandha");
	names1.add("raj");
	
	names.addAll(0,names1);
	System.out.println(names);
	System.out.println("The size of the arrayList is : "+names.size());
	
	Collections.sort(names);
	Collections.sort(lists);

	System.out.println("After sorting : "+names);
	System.out.println("After sorting :"+lists);

	}
}
