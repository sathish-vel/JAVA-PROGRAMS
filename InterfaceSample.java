interface Father{//interface class
    //ABSTRACT METHOD.....
    void eat(String name );

    //DEFAULT METHOD.....
    default void sing(String name ){
        System.out.println(name +" is Singing");
    }

    //STATIC METHOD.......
    static void walk(String name ){
        System.out.println(name +" is Walking");
    }
}
class Son implements Father{//SON CLASS IMPLEMENTS FROM EXISTING PARENT INTERFACE CLASS
    public void eat(String name ){
        System.out.println(name +" is Eating");
    }
}

public class InterfaceSample {
    public static void main(String[] args) {
        Father myFather = new Son();//CREATING OBJECT FOR SON CLASS

        myFather.eat("RAJESH");//calling abstract method

        myFather.sing("RAMESH");//calling default method

        Father.walk("SURESH");//calling static method

    }
}
