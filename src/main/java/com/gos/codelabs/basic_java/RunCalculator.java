package com.gos.codelabs.basic_java;

import java.util.Scanner;

@SuppressWarnings("PMD.CloseResource")
public class RunCalculator {
    public static double x = 0.0;

    public static void main(String[] args) {
        Calculator m_calculator = new Calculator();

        System.out.println("Input a number: ");
        // creates a scanner that waits and processes keyboard input
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();

        System.out.println("Input a second number: ");
        double number2 = input.nextDouble();

        System.out.println("Operations: + add, - subtract, * multiply, / divide: ");
        char operation = input.next().charAt(0);

        double sum = 0;

        if (operation == '+') {
            sum = m_calculator.add(number, number2);
            System.out.println("Sum of two numbers: " + sum);
        } else if (operation == '-') {
            sum = m_calculator.subtract(number, number2);
            System.out.println("Difference of two numbers: " + sum);
        } else if (operation == '*') {
            sum = m_calculator.multiply(number, number2);
            System.out.println("Product of two numbers: " + sum);
        } else if (operation == '/') {
            sum = m_calculator.divide(number, number2);
            System.out.println("Quotient of two numbers: " + sum);
        } else {
            System.out.println("Not a valid operation!");
        }

        input.close();
    }
}
