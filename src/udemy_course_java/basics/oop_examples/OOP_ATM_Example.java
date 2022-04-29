package udemy_course_java.basics.oop_examples;

public class OOP_ATM_Example {
    public static void main(String[] args) {
        ATM_ATM_Example atm = new ATM_ATM_Example();

        Account_ATM_Example account = new Account_ATM_Example("Bzzman", "1234", 2000);

        atm.start(account);
        System.out.println("Exiting...");
    }
}
