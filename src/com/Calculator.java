package com;
abstract class Calculator  extends Input implements Contact {
    int firstNumber = firstNumberInput();
    char mathOperand = getMathOperator();
    int secondNumber = secondNumberInput();
    public void getCalculated() {
        float result = 0.00f;
        switch (mathOperand) {
            case '+':
                result = firstNumber + secondNumber;
                System.out.println(outcome+result);
                break;
            case '-':
                result = firstNumber - secondNumber;
                System.out.println(outcome+result);
                break;
            case '*':
                result = firstNumber * secondNumber;
                System.out.println(outcome+result);
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println(divisionZero);
                } else {
                    result = (float) firstNumber / secondNumber;
                    System.out.println(outcome+result);
                }
                break;
            default:
                System.out.println(mistake);
        }
    }
}
