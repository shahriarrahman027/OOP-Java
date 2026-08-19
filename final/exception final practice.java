class BankAccount{
    private String name;
    private int balance;
    int amount;
    BankAccount(String name, int balance){
        this.balance=balance;
        this.name=name;
    }
    void setName(String name){
        this.name=name;
    }
    void setBalance(int balance){
        this.balance=balance;
    }
    void withdraw(int amount) throws ArithmeticException{
        if (amount<=0){
            throw new ArithmeticException("Amount is zero or negative");
        }
        if( balance < amount) {
            throw new IllegalArgumentException("Amount is grater than balance");
        }
        balance=balance-amount;
        System.out.print("New balance is "+balance);
    }

}
public class Basic{
    public static void main(String[] args){
        try{
            BankAccount b1=new BankAccount("Shahriar",5000);
            b1.setName("Shahriar");
            b1.setBalance(5000);
            b1.withdraw(0);
        } catch (ArithmeticException e) {
            System.out.print(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
        }
    }
}
