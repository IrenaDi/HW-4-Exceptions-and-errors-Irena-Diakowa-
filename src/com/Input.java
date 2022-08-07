package com;
import java.util.Scanner;
public class Input  {
    public static Scanner scanner;
    public int firstNumberInput() {
        System.out.println (Contact.firstNumberInput);
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public char getMathOperator() {
        System.out.println  (Contact.getMathOperatorInput);
        char mathOperator;
        mathOperator = scanner.next().charAt(0);
        return mathOperator;
    }
    public int secondNumberInput() {
        System.out.println (Contact.secondNumberInput);
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
