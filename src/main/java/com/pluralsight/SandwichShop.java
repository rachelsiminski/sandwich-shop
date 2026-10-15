package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        // Sandwich Shop Exercise
        // Create an application to calculate the price of a sandwich

        // Declare and initialize Scanner
        Scanner scanner = new Scanner(System.in);

        // Read, declare, initialize variables for sandwiches and user
        System.out.print("Select your size: 1. Regular 8\" or 2. Large 12\"" );
        int sandwichSize = scanner.nextInt();

        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();

        float discount = 0f;
        float regularSandwichPrice = 5.95f;
        float largeSandwichPrice = 8.95f;

        // Cost calculation
        // regular size is $5.45
        // large size is $8.95
        // discount for <= 17 is 10%
        // discount for >= 65 is 20%

    }
}
