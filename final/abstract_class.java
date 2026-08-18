abstract class Person{
    private String name;
    Person(String name){
        this.name=name;
    }
   void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    abstract void displayinfo();
    void showname(){
        System.out.println(name);
    }
}
class Teacher extends Person{
    private int id;
    private String subject;
    Teacher(String name, int id, String subject){
        super(name);
        this.id=id;
        this.subject=subject;
    }
    void setId(int id){
        this.id=id;
    }
    void setSubject(String subject){
        this.subject=subject;
    }
    int getId(){
        return id;
    }
    String getSubject(){
        return subject;
    }
    @Override
    void displayinfo(){
        System.out.println("ID: "+id);
        System.out.println("Subject: "+subject);
    }

}

public class Basic {
    public static void main(String[] args){
        Person t1= new Teacher("Rayhan",2225,"OOP");
        Person t2= new Teacher("Mamun",22226,"AOL");

        t1.showname();
        t1.displayinfo();
        System.out.println();
        t2.showname();
        t2.displayinfo();
    }
}
