package OverOne;

import java.util.Scanner;

public class Lesson2home {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите переменную");
        int q = scanner.nextInt();
        if (q == 0) {

            System.out.println(" Вы ввели ноль ");
        } else {

            if (q > 0) {

                System.out.println("это положительное число");
            } else {
                System.out.println("это отрицательное число");
            }
            if (q > 0 && q < 10 || q < 0 && q > -10) {

                System.out.println(" однозначное ");
            } else {
                if (q >= 10 && q < 100 || q <= -10 && q > -100) {

                    System.out.println(" двухзначное ");
                } else {
                    if (q >= 100 && q < 1000 || q <= -100 && q > -1000)
                        System.out.println(" трехзначное ");
                    else {
                        System.out.println(" более, чем трёхзначное ");
                    }
                }

            }
        }
    }
}