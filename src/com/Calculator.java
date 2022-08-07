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
                try {
                       result = (float) firstNumber / secondNumber;
                       System.out.println(outcome+result);
                        }
                catch(ArithmeticException e) {
                System.out.println(divisionZero + " " + e);
                }
                break;
            default:
                System.out.println(mistake);
         }
            if (result > 100) {
                throw new ArithmeticException (outcomeHundred + " " + result);
            }
    }
}
