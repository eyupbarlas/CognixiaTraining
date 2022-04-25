package Week2.day4;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacciNums(int n)
    {
        // Base Case
        if (n <= 1)
            return n;

        // Recursive call
        return fibonacciNums(n - 1) + fibonacciNums(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program will get first N Fibonacci numbers.");
        System.out.println("Enter the N: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print(fibonacciNums(i)+" ");
        }
    }
}
