package udemy_course_java.basics;

import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        double result;
        System.out.println("Enter edge 1: ");
        a = scanner.nextInt();
        System.out.println("Enter edge 2: ");
        b = scanner.nextInt();

        result = Math.sqrt(a*a + b*b);
        System.out.println("Hypotenuse: "+result);
    }
}
