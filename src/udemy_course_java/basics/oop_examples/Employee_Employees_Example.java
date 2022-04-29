package udemy_course_java.basics.oop_examples;

public class Employee_Employees_Example {
    private int id;
    private String firstname;
    private String lastname;

    public Employee_Employees_Example(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void showInfo(){
        System.out.println("***User Information***");
        System.out.println("Employee ID: " + id);
        System.out.println("First Name: " + firstname);
        System.out.println("Last Name: " + lastname);
    }
}
