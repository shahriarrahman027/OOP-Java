class Person{
    String name;
   void introduce(){
        System.out.println("Hello!");
    }
}
class Student extends Person{

}
public class Main{
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="Shahriar";
        System.out.println(s1.name);
        s1.introduce();
    }
}
