import java.util.Scanner;
//package com.jojuskills;
class Input{
	static Scanner input = new Scanner(System.in);
	int z = 10;
	static void index(){
		System.out.println("hiiiiiiii");
	}
	void integer(){
		System.out.println("enter the number : ");
		int num1 = input.nextInt();
		System.out.println(num1);
	}
	void name(){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the name : ");
		String str = input.nextLine();
		System.out.println(str);
	}
	void character(){
		System.out.println("enter the initial : ");
		char c = input.next().charAt(0);
		System.out.println(c);
	}
	public static void main(String[] args){
		
	index();
	Input obj =  new Input();//creating object for class
	obj.integer();
	obj.name();
	obj.character();
	
	//int array through for each
	int a[]={1,2,3,4,5};
	for(int i : a){
		System.out.println(i);
	}
	
	//String array through for each
	String names[] = {"satz","roman","captain"};
	for (String i : names){
		System.out.println(i);
	}
	
	//char array through for each 
	char c[]={'a','b','c','d'};
	for (char i : c){
		System.out.println(i);
	}
	
	//array through normal for loop
	int arr [] ={9,8,7,6};
	for (int i = 0; i<arr.length; i++){
		System.out.println(arr[i]);
	}
	
	String name2[]={"nandha","pravin","sathisg"};
	for(int i =0; i<name2.length; i++){
		System.out.println(name2[i]);
	}
	char c1[]={'c','p','i'};
	for(int i =0; i<c1.length; i++){
		System.out.println(c1[i]);
	}
		//getting integer input array from user
	Scanner input = new Scanner(System.in);
	int array[]=new int[5];
	for (int i=0; i<5; i++){
		array[i]=input.nextInt();
	}
		//print the value using by for loop
	for (int i=0; i<5; i++){   
		System.out.println(array[i]);
	}
		//getting string input array from user
	String str[] =new String[5];
	for (int i=0; i<5;i++){
		str[i]=input.nextLine();
	}
	//System.out.println(Arrays.toString(str));
	}
}