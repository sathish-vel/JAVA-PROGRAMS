class Employee{
    String name ;
    double salary;
    int empId;
    long phoneNo;
    Employee(String name,double salary,int empId ){//Parametrised Construct
        this.name = name;
        this.salary = salary;
        this.empId = empId;
    }

    Employee(Employee e){ //Copy Constructor
        this.name = e.name;
        this.salary = e.salary;
        this.empId = e.empId;
    }
    void display(){
        System.out.println("Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", empId=" + empId +
                '}');
    }

    //constructor overLoading....
    Employee(String n,double s,int e,long p ){//Employee(Employee E,long phoneNo )//copy constructor + long phoneNo
        name = n;
        salary = s;
        empId = e;
        phoneNo = p;
    }
    void displayOverloadConstructor(){
        System.out.println("Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", empId=" + empId +
                ", phoneNo=" + phoneNo +
                '}');
    }
}




public class ConstructorDEMO {
    public static void main(String[] args) {
       Employee newEmp = new Employee("satz",25000,12345);
       Employee newEmp1 = new Employee("nandha",25000,67890);
       newEmp.display();
       newEmp1.display();
       Employee newEmp3 = new Employee("Roman",25000,12345,883849597);
       newEmp3.displayOverloadConstructor();


    }
}
/*

    In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.

It is a special type of method which is used to initialize the object.
Rules for creating Java constructor

*There are two rules defined for the constructor.

1.Constructor name must be the same as its class name
2.A Constructor must have no explicit return type
3.A Java constructor cannot be abstract, static, final, and synchronized

*Types of Java constructors
There are two types of constructors in Java:

1.Default constructor (no-arg constructor)
2.Parameterized constructor

*/
