package udemy_course_java.basics.oop_examples;

import java.util.Scanner;

public class Main_Employees_Example {
    /*
    * Employee superclass
    * SDE subclass from employee
    * Manager subclass from employee
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===Welcome to the Employee Management Software===");
        System.out.println("********************************");
        String operations = "--Operations--\n"
                + "1. SDE Operations\n"
                + "2. Manager Operations\n"
                + "Press q to exit.";

        while (true){
            System.out.println(" ");
            System.out.println(operations);
            System.out.println("********************************");
            System.out.print("Select operation: ");
            String operation = scanner.nextLine();

            if (operation.equals("q")){
                System.out.println("Exiting...");
                break;
            }
            else if (operation.equals("1")){
                SDE_Employees_Example sde = new SDE_Employees_Example(1, "Bzzman", "Bzzky", "Python, Solidity, Java");

                String sdeOperations = "1. Format PC\n"
                        + "2. Show SDE Info"
                        + "Press q to go back to main menu.";
                System.out.println(sdeOperations);

                while (true){
                    System.out.print("Select SDE operation: ");
                    String sdeOperation = scanner.nextLine();

                    if (sdeOperation.equals("q")){
                        System.out.println("Going back to main menu...");
                        break;
                    }
                    else if (sdeOperation.equals("1")) {
                        System.out.print("Enter the OS: ");
                        String os = scanner.nextLine();

                        sde.formatPC(os);
                    }
                    else if (sdeOperation.equals("2")) {
                        sde.showInfo();
                    }
                    else{
                        System.out.println("Invalid operation!");
                    }
                }
            }
            else if (operation.equals("2")){
                Manager_Employees_Example manager = new Manager_Employees_Example(2, "Ege", "Fitness", 100);

                String managerOperations = "1. Increase Paychecks\n"
                        + "2. Show Manager Info\n"
                        + "Press q to go back to main menu.";
                System.out.println(managerOperations);

                while (true){
                    System.out.print("Select manager operation: ");
                    String managerOperation = scanner.nextLine();

                    if (managerOperation.equals("q")){
                        System.out.println("Going back to main menu...");
                        break;
                    }
                    else if (managerOperation.equals("1")){
                        System.out.print("Enter the amount to increase paychecks: ");
                        int amount = scanner.nextInt();

                        manager.makePayIncrease(amount);
                    }
                    else if (managerOperation.equals("2")){
                        manager.showInfo();
                    }
                    else{
                        System.out.println("Invalid operation!");
                    }
                }

            }
            else{
                System.out.println("Invalid operation!");
            }
        }
    }
}
