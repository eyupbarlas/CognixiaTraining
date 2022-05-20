package OOP_HW;

// Importing libraries
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
Eyup Barlas - Erasmus+ Student - Object Oriented Programming Class
Assignment 1 - Mortgage Payment Calculator
*/

public class MortgagePaymentCalculator {
    public static void main(String[] args) {

        // Constants
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        int periodInMonth = 0;
        double monthlyInterestRate = 0;

        // Scanner object call
        Scanner scanner = new Scanner(System.in);

        // Getting Principal value with error handling
        while (true) {
            System.out.print("Principal ($1k - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            else
                System.out.println("Please enter a value between 1000 and 10000000");
        }

        // Getting Annual Interest Rate value with error handling
        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterestRate = scanner.nextFloat();
            if (annualInterestRate >= 1 && annualInterestRate <= 30) {
                monthlyInterestRate = annualInterestRate / PERCENT / MONTH_IN_YEAR;
                break;
            } else
                System.out.println("Please enter a value greater than 0 and less than 30");
        }

        // Getting Period value with error handling
        while (true) {
            System.out.print("Period (Years): ");
            byte periodInYear = scanner.nextByte();
            if (periodInYear >= 1 && periodInYear <= 30) {
                periodInMonth = periodInYear * MONTH_IN_YEAR;
                break;
            } else
                System.out.println("Please enter a value between 1 and 30");
        }

        // Mortgage logic implementation
        double mortgage = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, periodInMonth))
                / (Math.pow(1 + monthlyInterestRate, periodInMonth) - 1);

        // Formatting result with US Dollar currency
        String formattedMortgage = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);

        System.out.print("Mortgage: " + formattedMortgage);
    }
}

