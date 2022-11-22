public class ExceptionDemo {
    public static void main(String[] args) {
       int a=100,b=0,c;
       // c = a / b;  -> it will throw the Error like this : Exception in thread "main" java.lang.ArithmeticException: / by zero at ExceptionDemo.main(ExceptionDemo.java:4)
       //System.out.println(c);

        int arr[] = new int[10];
        //--> so we are using Try-catch:::
        try{                        //we cannot use Try block alone. we must use Catch or Finally block.
            c = a / b;
            System.out.println(arr[11]);//it will not throws the error becoz before line got an error so if the is error occurs in try block it will throws the erros directlt to catch block
        }
        //we can give multiple catch block in one single try catch :
        catch(ArithmeticException A){System.err.println(A);}

        catch (ArrayIndexOutOfBoundsException Arr){System.err.println(Arr);}

        catch (Exception e){System.err.println(e);}
           //    --> or we can give multiple catch block in one catch block : like this
        //catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {System.out.println(e);}

        //finally block:
        finally{                    //it will executing wheather exception handled or not
            System.out.println("finally block");
        }
        //rest of the code:
        System.out.println("end of the statement executed");
    }
}
