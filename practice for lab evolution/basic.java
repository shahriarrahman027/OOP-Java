class Student {
    String name;
    int id;
    double cgpa;
    Student(int id, double cgpa, String name){
        this.id=id;
        this.cgpa=cgpa;
        this.name=name;
    }
    public void displayInfo(){
        System.out.println("id: " + id +" " + "cgpa " + cgpa + " name: "+ " " + name);
    }
}
public class Main{
    public static void main(String[] args){
        Student s1= new Student(251 ,3.71 ,"Shahriar");
        s1.displayInfo();
    }
}
