class Main{
public static void main(String[] args){
	String name = "satz";
	String fName = "roman";
	String lName = "sathish";
	String concat = fName+lName;
	String num1 = "22";
	System.out.println(num1+22);
	System.out.println(fName.concat(lName));
	System.out.println(concat);
	int len = name.length();
	String uppercase = name.toUpperCase();
	System.out.println(len);	
	System.out.println(uppercase);	
	System.out.println("the length of the name is : "+ name.length());
	System.out.println("to UPPERCASE OF THE NAME : " + name.toUpperCase());
	System.out.println("to lowercase of thr name : " + name.toLowerCase());
	System.out.println("index  of the a is " + name.indexOf('a'));
	System.out.println("hiiii");	
	
	//random number in java....
	int random=(int)(Math.random()*101);
	System.out.println(random);
	
	//if ,else ,else if........
	int a = 10;
	if (a>=20){
		System.out.println("a is greater than or equal");
	}
	else{
		System.out.println("a is  lesser than or equal");
	}
	
	//Short hand of if , else(Ternary opreator)....
	int b = 20;
	String result = (b>=20)? "yes b is a greter than of 20. " :  " yes b is lessar than of 20";
	System.out.println(result);
	
	//switch case .....
	int c = 4;
	switch(c){
		case 1 :
			System.out.println("hiii iam one");
			break;
		case 2 :
			System.out.println("hii iam second ");
			break;
		case 3 :
			System.out.println("hiii iam three");
			break;
		case 4 :
			System.out.println("hii iam four ");
			break;
		default:
			System.out.println("none");
	}//ending switch case
	
	//Arrays...
	
	int count = 0;
	int marks[] = {11,22,33,44,55};
	System.out.println(marks[0]);
	
	//(1)	using for loop through an array(for loop is a used to execute bloack of code ,when condion reached or when its true)
	System.out.println("using for loop an array...");

	for (int i = 0; i<marks.length; i++){
		System.out.println(marks[i]);		
		count++;
	}	
	
	//(2)	using for each loop an array...
	System.out.println("using for each loop an array...");
	for (int i : marks){
		System.out.println(i);
	}
	
	//(3)	while loop through an array
	System.out.println("using while loop through an array");

	int i=0;
	while (i!=marks.length){
		System.out.println(marks[i]);
		i++;
	}
	System.out.println(" finding the length of the array using predifined function 		  : " +marks.length);
	System.out.println(" finding the length of the array without using predifined funtion : " +count);
	
}
}