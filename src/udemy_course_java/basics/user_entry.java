package udemy_course_java.basics;

import java.util.Scanner;

public class user_entry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usernameReal = "bzzman";
        String passwordReal = "1234";
        int trials = 2;

        System.out.println("******************");
        System.out.println("--User Entry--");
        System.out.println("******************");

        while (true){
            System.out.print("Enter username: ");
            String usernameEntry = scanner.nextLine();
            System.out.print("Enter password: ");
            String passwordEntry = scanner.nextLine();

            if (usernameEntry.equals(usernameReal) && passwordEntry.equals(passwordReal)){
                System.out.println("Username verified. Password verified. Logging in....");
                break;
            }
            else if (usernameEntry.equals(usernameReal) && !(passwordEntry.equals(passwordReal)) && trials>0){
                System.out.println("Username verified. Wrong password!");
                System.out.println("Try again.(Remaining trials:"+trials+")");
                trials--;
                if (trials == -1){
                    System.out.println("Out of trials, exiting....");
                    break;
                }
            }
            else if(!(usernameEntry.equals(usernameReal) && !(passwordEntry.equals(passwordReal)) && trials>0)){
                System.out.println("Invalid entry!(Remaining trials:"+trials+")");
                trials--;
                if (trials == -1){
                    System.out.println("Out of trials, exiting....");
                    break;
                }
            }
        }
    }

}
