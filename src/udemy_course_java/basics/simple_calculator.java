package udemy_course_java.basics;

import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operation;
        double num1, num2, result;

        System.out.println("Enter number 1:");
        num1 = scanner.nextDouble();
        System.out.println("Enter number 2:");
        num2 = scanner.nextDouble();
        System.out.println("Enter operation:");
        operation = scanner.next().charAt(0);

        switch (operation){
            case '+':
                result = num1+num2;
                System.out.println("Sum of "+num1+" and "+num2+": "+result);
            case '-':
                result = num1-num2;
                System.out.println("Subtraction of "+num1+" to "+num2+": "+result);
            case '*':
                result = num1*num2;
                System.out.println("Multiplication of "+num1+" and "+num2+": "+result);
            case '/':
                result = num1/num2;
                System.out.println("Division of "+num1+" and "+num2+": "+result);
            default:
                System.out.println("Invalid operation!");
        }

    }
}
