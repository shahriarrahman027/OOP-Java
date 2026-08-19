class Student{
    private String name;
    private int mark;
    int sub;
    Student(String name, int mark, int sub){
        this.name=name;
        this.mark=mark;
        this.sub=sub;
    }
    void setName(String name){
        this.name=name;
    }
    void setMark(int mark){
        this.mark=mark;
    }
    void calculateAverage() throws ArithmeticException{
        if(mark==0){
            throw new ArithmeticException("No mark Available");
        }
        if(mark<0||mark>100){
            throw new IllegalArgumentException("Invalid mark");
        }
        double average=mark/sub;
    }
}
public class Basic {
    public static void main(String[] args){
        try{
            Student s1= new Student("shahriar",200,3);

            s1.calculateAverage();
        }catch (Exception e) {
            System.out.print(e.getMessage());
        }
        try{
            Student s2= new Student("Seam",0,2);
            s2.calculateAverage();
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
    }
}
