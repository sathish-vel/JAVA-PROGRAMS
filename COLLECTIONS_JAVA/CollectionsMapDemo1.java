import java.util.*;
public class CollectionsMapDemo1 {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes"); 
		   System.out.println(map);
		   for (Map.Entry m : map.entrySet())
				System.out.println(m.getKey() +" "+m.getValue()  );
	}
}
