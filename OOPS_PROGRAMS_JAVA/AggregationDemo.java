class Employee1{
    double salary(double s){
        return (s * s);
    }
}
class Operation{
    Employee1 myEmp;
    int month = 1;
    double add(double salary){
        myEmp = new Employee1();
        double res = myEmp.salary(salary);
        System.out.println(res*month);
        return 0;
    }
}
public class AggregationDemo {

    public static void main(String[] args) {
        Operation op = new Operation();
        op.add(2500);

    }
}
