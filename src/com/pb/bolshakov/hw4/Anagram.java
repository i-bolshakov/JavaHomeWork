package com.pb.bolshakov.hw4;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static String isAnagram(String a, String b) {
        String itog = "Строки не являются анаграммой.";
        String stA = a.replaceAll("[.,\\- ]", "");
        String stB = b.replaceAll("[.,\\- ]", "");
        char[] arrA = stA.toCharArray();
        char[] arrB = stB.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        if (Arrays.equals(arrA, arrB)) {
            itog = "Это - анаграмма.";
        }
        return itog;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первую строку: \n");
        String first = in.nextLine().toUpperCase();

        System.out.print("Введите вторую строку: \n");
        String second = in.nextLine().toUpperCase();

        String result = isAnagram(first, second);
        System.out.println("\n" + result);
    }
}