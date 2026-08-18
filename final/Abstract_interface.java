interface Display {
    void displayinfo();
}

abstract class Person implements Display {
    private String name;

    Person(String name) {
        this.name = name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    abstract void showName();
}

class Teacher extends Person {
    private int id;
    private String subject;

    Teacher(String name, int id, String subject) {
        super(name);
        this.id = id;
        this.subject = subject;
    }

    void setId(int id) {
        this.id = id;
    }

    int getId() {
        return id;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }

    String getSubject() {
        return subject;
    }

    @Override
    void showName() {
        System.out.println("Name: " + getName());
    }

    @Override
    public void displayinfo() {
        System.out.println("ID: " + getId());
        System.out.println("Subject: " + getSubject());
    }
}

class Student extends Person {
    private int id;
    private String dept;

    Student(String name, int id, String dept) {
        super(name);
        this.id = id;
        this.dept = dept;
    }

    void setId(int id) {
        this.id = id;
    }

    int getId() {
        return id;
    }

    void setDept(String dept) {
        this.dept = dept;
    }

    String getDept() {
        return dept;
    }

    @Override
    void showName() {
        System.out.println("Name: " + getName());
    }

    @Override
    public void displayinfo() {
        System.out.println("ID: " + getId());
        System.out.println("Department: " + getDept());
    }
}

public class Basic {

    public static void main(String[] args) {

        Person t1 = new Teacher("Mamun", 22222, "AOL");
        Person t2 = new Teacher("Rayhan", 22223, "OOP");

        Person s1 = new Student("Shahriar", 27, "CSE");
        Person s2 = new Student("Seam", 53, "CSE");

        t1.showName();
        t1.displayinfo();

        System.out.println();

        s1.showName();
        s1.displayinfo();
    }
}
