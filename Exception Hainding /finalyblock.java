public class Main{
    public static void main(String[] args){
        System.out.println("Start");
        try {
            int a=10;
            int b=0;
            System.out.println(a / b);
        } catch(ArithmeticException e){
            System.out.println("Can't devided by Zero");
        }
        finally {
            System.out.println("Finished");
        }
        System.out.println("END");
    }
}
