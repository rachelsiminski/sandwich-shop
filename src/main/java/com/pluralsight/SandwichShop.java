package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        // Sandwich Shop Exercise
        // Create an application to calculate the price of a sandwich

        // Declare and initialize Scanner
        Scanner scanner = new Scanner(System.in);

        // Read, declare, initialize variables for sandwiches and user
        System.out.print("Select your size: 1. Regular 8\" or 2. Large 12\":");
        int sandwichSize = scanner.nextInt();

        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();

        // Eat the new line
        scanner.nextLine();

        float regularSandwichPrice = 5.45f;  // Fixed price
        float largeSandwichPrice = 8.95f;
        float youthDiscount = .1f;
        float seniorDiscount = .2f;
        float totalPrice = 0f;

        // Calculate Loaded Cost
        System.out.print("Would you like to make your sandwich LOADED today? (y/n): ");
        String isLoaded = scanner.next();

        if (isLoaded.equals("y") || isLoaded.equals("Y")) {   // Moved to calculate before age
            if (sandwichSize == 1) {
                totalPrice = 1f + regularSandwichPrice;
            } else {
                totalPrice = 1.75f + largeSandwichPrice;
            }
        }

        // Cost calculation
        if (userAge <= 17) {   // Fixed calculations to account for loaded first ^
            if (sandwichSize ==1) {
                totalPrice = totalPrice - (regularSandwichPrice * youthDiscount);
            }
            else if (sandwichSize == 2){
                totalPrice = totalPrice - (largeSandwichPrice * youthDiscount);
            }
        }
        else if (userAge >= 65) {
            if (sandwichSize == 1) {
                totalPrice = totalPrice - (regularSandwichPrice * seniorDiscount);
            }
            else if (sandwichSize == 2) {
                totalPrice = totalPrice - (largeSandwichPrice * seniorDiscount);
            }
        }
//        else {
//            if (sandwichSize == 1) {
//                totalPrice = regularSandwichPrice;
//            }
//            else {
//                totalPrice = largeSandwichPrice;
//            }
//        }

        // Display results
        System.out.println("Order Confirmation");
        System.out.println("You are " + userAge + " years old. You want the #" + sandwichSize);
        System.out.printf("Order total: $%.2f", totalPrice);
    }
}
