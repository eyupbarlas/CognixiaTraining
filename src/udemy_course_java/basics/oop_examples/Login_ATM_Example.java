package udemy_course_java.basics.oop_examples;

import java.util.Scanner;

public class Login_ATM_Example {
    public boolean login(Account_ATM_Example account){
        Scanner scanner = new Scanner(System.in);
        String usernameEntry;
        String passwordEntry;

        System.out.print("User Name: ");
        usernameEntry = scanner.nextLine();
        System.out.print("Password: ");
        passwordEntry = scanner.nextLine();

        if (account.getUsername().equals(usernameEntry) && account.getPassword().equals(passwordEntry)){
            return true;
        }
        return false;
    }
}
