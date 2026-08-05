package exceptionhandling;

public class Basic {
    public static void main(String[] args) {
        System.out.println("Start");
        int x=10;
        int  y=0;
        System.out.println(x/y);
        System.out.println("end");
    }
}
/*output will be:Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exceptionhandling.Basic.main(Basic.java:8)**/

// with exception handling :
public class Basic{
    public static void main(String[] args){
        System.out.println("Start");
        try{
            int x=10;
            int y=0;
            System.out.println(x/y);
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by the zero.");
        }
        System.out.println("End");
    }
}
