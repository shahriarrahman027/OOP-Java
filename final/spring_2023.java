import java.util.Scanner;

interface Calculator {

    void addition();

    void subtraction();

    void quotient();

    void remainder();

}

abstract class Operation implements Calculator {

    private int num1;

    private int num2;

    Operation(int num1, int num2) {

        this.num1 = num1;

        this.num2 = num2;

    }

    int getNum1() {

        return num1;

    }

    int getNum2() {

        return num2;

    }

}

class Calculate extends Operation {

    Calculate(int num1, int num2) {

        super(num1, num2);

    }

    @Override

    public void addition() {

        System.out.println("Addition = " + (getNum1() + getNum2()));

    }

    @Override

    public void subtraction() {

        System.out.println("Subtraction = " + (getNum1() - getNum2()));

    }

    @Override

    public void quotient() {

        System.out.println("Quotient = " + (getNum1() / getNum2()));

    }

    @Override

    public void remainder() {

        System.out.println("Reminder = " + (getNum1() % getNum2()));

    }

}
public class Basic {
    public static void main(String[] args){
        Operation o1= new Calculate(13,11);
        o1.addition();
        o1.subtraction();
        o1.quotient();
        o1.remainder();
    }
}
