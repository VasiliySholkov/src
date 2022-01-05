package OverOne;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа");
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                count=count+i;
            }
        }
            System.out.println(count);
        }
    }


