package com.pb.bolshakov.hw4;
import java.util.Scanner;

public class CapitalLetter {
    static String[] toArray(String str) {
        return str.split(" ");
    }

    static String[] toUpperArray(String[] uArr) {
        String[] tempUpperArr = new String[uArr.length];
        for (int i = 0; i < uArr.length; i++) {
            tempUpperArr[i] = uArr[i].substring(0, 1).toUpperCase() + uArr[i].substring(1);
        }
        return tempUpperArr;
    }
    static String arrToString (String[] toString) {
        return String.join(" ", toString);
    }

    public static void main(String[] args) {
        System.out.println("Введите строку: \n");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] tempArray = toArray(str);
        tempArray = toUpperArray(tempArray);
        String resArr = arrToString(tempArray);

        System.out.println("\n Результат: ");
        System.out.println("\n" + resArr);
    }
}