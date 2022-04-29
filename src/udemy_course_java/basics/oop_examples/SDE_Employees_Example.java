package udemy_course_java.basics.oop_examples;

public class SDE_Employees_Example extends Employee_Employees_Example{
    private String langs;

    public SDE_Employees_Example(int id, String firstname, String lastname, String langs) {
        super(id, firstname, lastname);
        this.langs = langs;
    }

    public void formatPC(String os){
        System.out.println(getFirstname() + " formatting " + os + " operating system...");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Languages of expertise: " + langs);
    }
}
