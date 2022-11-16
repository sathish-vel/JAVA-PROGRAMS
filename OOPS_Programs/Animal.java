record Animal(String l,String t,String e) {
    Animal(){
        this("null","null","null");
    }
record Person(String name,String male,long phoneNo,int age){
        Person(){
            this("null","null",0,0);
        }
}
record Student(String name,long phoneNo,int id){
    Student(){
        this("null",0,0);
    }
}
record Employee(String name,double salary,long phoneNo,int id){
    Employee(){
        this("null",0,0,0);
    }
}
record Vehicle (String color,String Brand, int no ,double amt){
    Vehicle(){
        this("null","null",0,0);
    }
}
    public static void main(String[] args) {
        Animal myAnimal= new Animal("Lion","Tiger","Elephant");
        System.out.println(myAnimal);

        Person myPerson = new Person("sathish","male",12345678,12);
        System.out.println(myPerson);

        Student myStudent = new Student("sathish",987654321,789123);
        System.out.println(myStudent);

        Employee myEmployee = new Employee("nandha",30000,45678901,456);
        System.out.println(myEmployee);

        Vehicle myVechicle = new Vehicle("Red","Audi",9871,100000);
        System.out.println(myVechicle);
    }
}
