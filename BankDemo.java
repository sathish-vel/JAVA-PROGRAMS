interface Bank{
    void getIntrest(double d);
}

class SBI implements Bank{
    @Override
    public void getIntrest (double d){
        System.out.println("The Intrest of SBI Bank is : " +d);
    }
}

class IOB implements Bank{

    @Override
    public void getIntrest(double d) {
        System.out.println("The Intrest of IOB Bank is : " +d);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        IOB myObj = new IOB();
        myObj.getIntrest(10000);

        SBI myObj1 = new SBI();
        myObj1.getIntrest(20000);
    }
}
