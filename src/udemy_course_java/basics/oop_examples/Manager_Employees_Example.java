package udemy_course_java.basics.oop_examples;

public class Manager_Employees_Example extends Employee_Employees_Example {
    private int personnelCount;

    public Manager_Employees_Example(int id, String firstname, String lastname, int personnelCount) {
        super(id, firstname, lastname);
        this.personnelCount = personnelCount;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Responsible personnel count: " + personnelCount);
    }

    public void makePayIncrease(int amount){
        System.out.println(getFirstname() + " increased");
    }
}
