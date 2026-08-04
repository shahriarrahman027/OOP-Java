class Student {
    private int age=20;
    public void display(){
        System.out.println(age);
    }
}
public class Main {
    public static void main(String[] args){
        Student s=new Student();
        s.display();
    }
}
