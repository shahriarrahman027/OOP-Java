import java.time.Period;

class Cinema{
    int seat=10;
    synchronized void ticket(String name, int amount){
        if(amount<=0){
            throw new IllegalArgumentException("Invalid ");
        }
        if(amount>seat){
            throw new IllegalArgumentException("Error");
        }
        seat -=amount;
        System.out.print(name+amount+" ticket done");
    }
}
class person extends Thread{
    private Cinema cinema;
    private int amount;
    private String name;
    person(Cinema cinema,int amount, String name ){
        this.amount=amount;
        this.cinema=cinema;
        this.name=name;
    }
    public void run(){
        try{
            cinema.ticket(name,amount);
        }catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
        }
    }

}
public class Basic {
    public static void main(String[] args){
        Cinema cinema= new Cinema();
        person p1= new person(cinema,6,"Shahriar");
        person p2 = new person(cinema,5,"seam");
        p1.start();
        p2.start();
    }

}
