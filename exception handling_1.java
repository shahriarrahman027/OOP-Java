class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}
class NID{
    private int age;
    NID(int age){
        this.age=age;
    }
    void setAge(int age){
        this.age=age;
    }
    void adult() throws InvalidAgeException{
        if (age<18){
            throw new InvalidAgeException ("not eligible");
            }
        System.out.print("You are eligible");
        }
}
public class Basic{
    public static void main(String[] args){
        try{
            NID n1=new NID(19);
            NID n2=new NID(17);
            n1.adult();

            n2.adult();
        }catch (InvalidAgeException e){
            System.out.print(" \n");
            System.out.print(e.getMessage());
        }
    }
}
