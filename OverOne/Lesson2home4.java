package OverOne;

import java.util.Scanner;

public class Lesson2home4 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите переменные");
        int e1 = scanner.nextInt();
        int e2 = scanner.nextInt();
        int e3 = scanner.nextInt();
        if (e1 > 0 && e2 < 0 && e3 < 0 || e1 < 0 && e2 > 0 && e3 < 0 || e1 < 0 && e2 < 0 && e3 > 0) {
            System.out.println( " 1 положительное число ");
        }
        ;
        if (e1 > 0 && e2 > 0 && e3 < 0 || e1 < 0 && e2 > 0 && e3 > 0 || e1 > 0 && e2 < 0 && e3 > 0) {
            System.out.println(" 2 положительных числа ");
        }
        if (e1 > 0 && e2 > 0 && e3 > 0) {
            System.out.println(" 3 положительных числа ");
        }
        ;
    }
}
