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

        float regularSandwichPrice = 5.95f;
        float largeSandwichPrice = 8.95f;
        float youthDiscount = .1f;
        float seniorDiscount = .2f;
        float totalPrice = 0f;

        // Cost calculation
        if (userAge <= 17) {
            if (sandwichSize ==1) {
                totalPrice = regularSandwichPrice - (regularSandwichPrice * youthDiscount);
            }
            else if (sandwichSize == 2){
                totalPrice = largeSandwichPrice - (largeSandwichPrice * youthDiscount);
            }
        }
        else if (userAge >= 65) {
            if (sandwichSize == 1) {
                totalPrice = regularSandwichPrice - (regularSandwichPrice * seniorDiscount);
            }
            else if (sandwichSize == 2) {
                totalPrice = largeSandwichPrice - (largeSandwichPrice * seniorDiscount);
            }
        }
        else {
            if (sandwichSize == 1) {
                totalPrice = regularSandwichPrice;
            }
            else {
                totalPrice = largeSandwichPrice;
            }
        }

        // Display results
        System.out.println("Order Confirmation");
        System.out.println("You are " + userAge + " years old. You want the #" + sandwichSize);
        System.out.printf("Order total: $%.2f", totalPrice);
    }
}
