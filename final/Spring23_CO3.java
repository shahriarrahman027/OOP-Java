interface Person{
    void showSleepingHours();
    void showMealTime();
}
abstract class Employee implements Person{
    public static String organization;
    String designation;
    protected double salary;

    Employee(String designation,double salary){
        this.designation=designation;
        this.salary=salary;
    }

    public static String getOrganization(){
        return organization;
    }
    public abstract void setSalary(double salary);
}
class PartTime extends Employee{
    public PartTime(String designation,Double salary){
        super(designation,salary);
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void showSleepingHours(){
        System.out.print("Parttitme sleeping hour: 10hour");
    }
    public void showMealTime(){
        System.out.print("Parttime meal: 2");
    }
    public void displayResponsibilities(){
        System.out.print("xys");
    }
}
class FullTime extends  Employee{
    private double bonus;
     public FullTime (String designation, double salary){
        super(designation,salary);
    }
    public void setBonus(double bonus){
         this.bonus=bonus;
    }
    public void setSalary(double salary){
         this.salary=salary;
    }
    @Override
    public void showSleepingHours(){
         System.out.print("fulltime: 5");
    }
    @Override
    public void showMealTime(){
         System.out.print("Fulltime meal: 3");
    }

}
public class Basic{
    public static void main (String[] args){
        Employee.organization="Tech Corp";

        PartTime pt= new PartTime("Developer", 25000.0);
        FullTime ft=new FullTime ("Manager",600000.0);

        pt.displayResponsibilities();
        pt.showSleepingHours();
        pt.showMealTime();
        ft.setBonus(5000);
        ft.showMealTime();

        System.out.print("Organization: "+Employee.getOrganization());
    }
}
