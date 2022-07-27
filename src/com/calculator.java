package com;

import java.util.Scanner;



public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float quot;
        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println("Введи перше число: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Вибери математичну дію: + або - або * або /");
            char mathOp = scanner.next().charAt(0);
            System.out.println("Введи друге число: ");
            int secondNumber = scanner.nextInt();
            switch (mathOp) {
                case '+':
                    int sum = (firstNumber + secondNumber);
                    System.out.println("Твій результат : " + sum);
                    break;
                case '-' :
                    int diff = (firstNumber - secondNumber);
                    System.out.println("Твій результат : " + diff);
                    break;
                case '*' :
                    int prod = (firstNumber * secondNumber);
                    System.out.println("Твій результат : " + prod);
                    break;
                case '/' :
                    if (secondNumber == 0) {
                        System.out.println("О, ні! На нуль ділити не можна!");
                    } else {
                      quot = (float) firstNumber / secondNumber;
                    System.out.println("Твій результат : " + quot + " Давай ще раз!"); }
                    break;
                default:
                    System.out.println("Сонечко, щось пішло не так... Спробуй знову!");
            }
            }
        }

    }



