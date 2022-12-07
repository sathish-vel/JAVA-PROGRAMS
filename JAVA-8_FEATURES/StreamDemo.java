package demo;
//what is stream?
//stream is a interface like list,set,map.
//stream doesn't store the value and this operation doesn't affect the source....

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class StudentDemo{
	int id;
	int age;
	String name;
	String gender;
	int rollNo;
	public StudentDemo(int id, int age, String name, String gender, int rollNo) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.rollNo = rollNo;
	}
	
}
public class StreamDemo {

	public static void main(String[] args) {
		List <StudentDemo> myStd = new ArrayList<>();
		myStd.add(new StudentDemo(1,21,"satz","male",1234));
		myStd.add(new StudentDemo(2,20,"roman","male",1239));
		myStd.add(new StudentDemo(3,23,"captain","male",4534));
		myStd.add(new StudentDemo(4,19,"nandha","male",1894));
		myStd.add(new StudentDemo(5,24,"raji","female",1235));
		
		myStd.stream().filter(s-> s.age>20).map(sm->sm.age).forEach(System.out::println);
		myStd.stream().forEach(p->System.out.println("id : "+p.id +" age : "+p.age +" name : " +p.name +" gender : "+p.gender +" rollno : "+p.rollNo));
		
		
		
		
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= 10; i++)
			list.add(i);
		
		long count = list.stream().count();
		System.out.println("the total count of list is " +count);
		
		
		list.stream().filter(n ->n>=5).forEachOrdered(n ->System.out.println(n));
		
		
		List <Integer> lists=list.stream().map(n -> n+100).collect(Collectors.toList());
		lists.forEach(System.out::println);

	}

}
