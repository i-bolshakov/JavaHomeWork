package com.pb.bolshakov.hw3;
import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args) {

        int[] array = new int[10];
        int min = -10;
        int max = 10;
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = min + random.nextInt(max - min + 1);
        }
        System.out.println("Изначальный вид массива:");
        System.out.println(Arrays.toString(array) + "\n");

        int sum = 0;
        int sumPositive = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
            if (array[i] > 0){
                sumPositive += array[i];
            }
        }
        System.out.println("Сумма всех элементов массива:");
        System.out.println(sum+ "\n");

        System.out.println("Сумма положительных элементов массива:");
        System.out.println(sumPositive+ "\n");

        boolean isSorted = false;
        int[] tempArr = new int[array.length];
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
                    tempArr[i] = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tempArr[i];
                }
            }
        }
        System.out.println("Массив после сортировки пузырьком:");
        System.out.println(Arrays.toString(array));
    }
}