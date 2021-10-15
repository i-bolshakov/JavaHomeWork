package com.pb.bolshakov.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String symbol;
        int result;

        System.out.println("Введите первое целое число: ");
        operand1 = scan.nextInt();

        System.out.println("Введите знак уравнения (+, -, *, /): ");
        symbol = scan.next();

        System.out.println("Введите второе целое число: ");
        operand2 = scan.nextInt();

        switch(symbol) {
            case "+":
                result = operand1 + operand2;
                System.out.println("Результат: " + result);
                break;
            case "-":
                result = operand1 - operand2;
                System.out.println("Результат: " + result);
                break;
            case "*":
                result = operand1 * operand2;
                System.out.println("Результат: " + result);
                break;
            case "/":
                if (operand2 == 0){
                    System.out.println("На ноль делить нельзя");
                }
                else {
                    result = operand1 / operand2;
                    System.out.println("Результат уравнения: " + result);
                }
                break;
            default:
                System.out.println("Неверно введен знак уравнения");
        }
    }
}

