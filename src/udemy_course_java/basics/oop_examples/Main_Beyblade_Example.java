package udemy_course_java.basics.oop_examples;

import java.util.Scanner;

// Beyblade program using Polymorphism
public class Main_Beyblade_Example {
    public static void main(String[] args) {
        System.out.println("*** Welcome to the Beyblade Program ***");
        System.out.println("Press q for exit.");

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Select your Beyblade: ");
            String operation = scanner.nextLine();
            if (operation.equals("q")){
                System.out.println("Exiting...");
                break;
            }
            else{
                Factory_Beyblade_Example factory = new Factory_Beyblade_Example();
                Beyblade_Beyblade_Example beyblade = factory.createBeyblade(operation);

                if (beyblade == null){
                    System.out.println("Please enter a valid Beyblade name.");
                }
                else{
                    System.out.println("-------");
                    beyblade.showInfo();
                    System.out.println("-------");
                    beyblade.attack();
                    System.out.println("-------");
                    beyblade.summonHolyMonster();
                }
            }
        }
    }
}
