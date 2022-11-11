interface Bike{
    String colour(String c);
    String prize(int p);
}
class Yamaha implements Bike{
    @Override
    public String colour(String c) {
        return "The bike colour is " +c;
    }
    @Override
    public String prize(int p) {
        return "The bike Prize is " +p;
    }
}
class R15 implements Bike{
    @Override
    public String colour (String c ){
        return "The bike colour is " +c;
    }
    @Override
    public String prize(int p) {
        return "The bike Prize is " +p;
    }
}
class Scooty{
    private Bike b;
    public void twoWheller(Bike b){
        this.b=b;
    }
    public String colour (String c ){
        return b.colour(c);
    }
    public String prize(int p) {
        return b.prize(p);
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Scooty obj = new Scooty();
        obj.twoWheller(new R15());
        System.out.println( obj.colour("Black"));
        System.out.println( obj.prize(20000));

        obj.twoWheller(new Yamaha());
        System.out.println( obj.colour("Black"));
        System.out.println( obj.prize(10000));



    }
}
