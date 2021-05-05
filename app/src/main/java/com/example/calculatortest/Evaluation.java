package com.example.calculatortest;

import java.util.Stack;

public class Evaluation {

    private static boolean firstTimeFunc = true;
    private static double applyOperation(char operator, double operand2, double operand1) throws ArithmeticException {
        switch (operator) {
            case '+': return (operand1 + operand2);
            case '-': return (operand1 - operand2);
            case 'x': return (operand1 * operand2);
            case '/':
                if(operand2 == 0) throw new ArithmeticException();
                return (operand1 / operand2);
            default: return 0;
        }
    }
    private static double applyFunction(double operand, String function) {

        switch (function) {
            case "log": return Double.valueOf(String.format("%.8f",Math.log10(operand)));
            case "ln": return Double.valueOf(String.format("%.8f",Math.log(operand)));
        }
        if(firstTimeFunc) {
            operand = Math.toRadians(operand);
            firstTimeFunc = false;
        }
        switch (function) {
            case "sin": return Double.valueOf(String.format("%.8f",Math.sin(operand)));
            case "cos": return Double.parseDouble(String.format("%.8f",Math.cos(operand)));
            case "tan": return Double.valueOf(String.format("%.8f",Math.tan(operand)));
            default: return 0;
        }
    }

    private static boolean isOperator(char op) {
        switch (op) {
            case '+' :
            case '-' :
            case 'x' :
            case '/' : return true;
            default: return false;
        }
    }

    static double factorial(double number) {
        double result = 1;
        for(; number > 0; number--) {
            result *= number;
        }
        return result;
    }

    static double evaluate(String expression) throws ArithmeticException {

        char[] tokens = expression.toCharArray();
        Stack<Double> numbers = new Stack<Double>();
        Stack<Character> operators = new Stack<Character>();
        Stack<String> functions = new Stack<String>();
        int funcCount = 0;
        boolean hasFunction = false;

        for (int i = 0; i < tokens.length; i++) {

            if (Character.isDigit(tokens[i])) {
                if(hasFunction) {
                    String temp = "";
                    while (i < tokens.length && ((Character.isDigit(tokens[i])) || tokens[i] == '.')) {
                        temp += String.valueOf(tokens[i++]);
                    }
                    i--;
                    functions.push(temp);
                    if(funcCount >= 1) {
                        while(funcCount > 1) {
                            functions.push(String.valueOf(applyFunction(Double.valueOf(functions.pop()), functions.pop())));
                            funcCount--;
                        }
                        funcCount = 0;
                    }
                    numbers.push(applyFunction(Double.valueOf(functions.pop()), functions.pop()));
                    hasFunction = false;
                }
                else {
                    String temp = "";
                    while (i < tokens.length && ((Character.isDigit(tokens[i])) || tokens[i] == '.')) {
                        temp += String.valueOf(tokens[i++]);
                    }
                    i--;
                    numbers.push(Double.valueOf(temp));
                }
            }
            else if(isOperator(tokens[i])) {
                operators.push(tokens[i]);
            }
            else if(tokens[i] == '(') {
                operators.push(tokens[i]);
            }
            else if(tokens[i] == ')') {
                while (operators.peek() != '(') {
                    numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.pop();
            }
            else if(Character.isLetter(tokens[i])) {
                String temp = "";
                while(i < tokens.length && (Character.isLetter(tokens[i]))) {
                    temp += String.valueOf(tokens[i++]);
                }
                i--;
                funcCount++;
                functions.push(temp);
                hasFunction = true;
            }
            else if(tokens[i] == ' ') continue;
        }

        while(!operators.empty()) {
            numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
        }

        return numbers.pop();
    }
}

