package com.calculatorjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        while (true) {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            int firstNumber = 0;
            System.out.println("Enter first number: ");
            try {
                firstNumber = Integer.parseInt(bf.readLine());
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
            System.out.println(firstNumber);

            int secondNumber = 0;
            System.out.println("Enter second number: ");
            try {
                secondNumber = Integer.parseInt(bf.readLine());
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
            System.out.println(secondNumber);

            char operation = ' ';
            System.out.println("Enter operation: ");
            try {
                operation = bf.readLine().charAt(0);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(operation);
            if (operation == '+') {
                System.out.println(addition(firstNumber, secondNumber));
            } else if (operation == '-') {
                System.out.println(substraction(firstNumber, secondNumber));
            } else if (operation == '*') {
                System.out.println(multiply(firstNumber, secondNumber));
            } else if (operation == '/') {
                System.out.println(division(firstNumber, secondNumber));
            } else if (operation == '%') {
                System.out.println(modulus(firstNumber, secondNumber));
            } else if (operation == 'q') {
                break;
            }
        }
    }
    public static int addition(int a, int b) {
        return a + b;
    }
    public static int substraction(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int division(int a, int b) {
        return a / b;
    }
    public static int modulus(int a, int b) {
        return a % b;
    }

}
