package com.pb.bolshakov.hw2;
import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a , b , c;
        String symbol;


        System.out.println("введите первое число");
        a = in.nextInt();

        System.out.println("введите знак");
        symbol = in.next();

        System.out.println("введите второе число");
        b = in.nextInt();

        switch (symbol) {
            case "+":
                c = a + b;
                System.out.println("результат" + c);
                break;
            case "-":
                c = a - b;
                System.out.println("результат" + c);
                break;
            case "*":
                c = a * b;
                System.out.println("результат" + c);
                break;
            case "/":
                if (b == 0)
                    System.out.println("на ноль нельзя делить");
                else {
                    c = a / b;
                    System.out.println("результат" + c);
                }
                break;



        }


    }
}
