package com.pb.bolshakov.hw3;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = 0;
        int y = 0;
        Random random = new Random();
        int z = random.nextInt(101);

        System.out.println("Угадайте число от 0 до 100.");
        System.out.println("Для завершения игры введите - \"stop\".");

        for (; ;){
            x++;

            if (scan.hasNextInt()) {
                y = scan.nextInt();
                if (y > z){
                    System.out.println("Подсказка: число меньше");
                }else if (y < z){
                    System.out.println("Подсказка: число больше");
                }else{
                    System.out.println("Верно! Вы угадали с " + x + " попытки.");
                    break;
                }
            } else if (scan.hasNextLine()) {
                if (scan.hasNext("stop")) {
                    System.out.println("Игра окончена!");
                } else {
                    System.out.println("Неправильный ввод! Мы завершаем игру.");
                }
                break;
            }
        }
    }
}