package udemy_course_java.basics.oop_examples;

import java.util.Scanner;

public class ATM_ATM_Example {
    public void start(Account_ATM_Example account){
        Login_ATM_Example login = new Login_ATM_Example();

        Scanner scanner = new Scanner(System.in);

        System.out.println("===Deneysel Bankaciliga Hosgeldiniz===");
        System.out.println("*****************************************");
        System.out.println("---User Entry---");
        System.out.println("*****************************************");

        int trialCount = 3;
        while (true){
            if (login.login(account)){
                System.out.println("Login successful...");
                break;
            }
            else{
                trialCount--;
                System.out.println("Unable to login. Remaining trials: " + trialCount);
            }
            if (trialCount == 0){
                System.out.println("Out of trials. Contact your bank.");
                return;
            }
        }
        System.out.println("*****************************************");
        String operations = "1. Show Balance\n" +
                "2. Deposit Money\n"+
                "3. Withdraw Money\n"+
                "Press q for exit.";
        System.out.println(operations);
        System.out.println("*****************************************");

        while (true){
            System.out.print("Select an operation: ");
            String operation = scanner.nextLine();

            if (operation.equals("q")){
                break;
            }
            else if (operation.equals("1")){
                System.out.println("Your Balance: " + account.getBalance());
            }
            else if (operation.equals("2")){
                System.out.print("Enter the amount you want to deposit: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.deposit(amount);
            }
            else if (operation.equals("3")){
                System.out.print("Enter the amount you want to withdraw: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.withdraw(amount);
            }
            else {
                System.out.println("Invalid operation!");
            }
        }


    }
}
