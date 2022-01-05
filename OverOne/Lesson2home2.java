package OverOne;

import java.util.Scanner;

public class Lesson2home2  {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите переменную");
        int a = scanner.nextInt();
        int b = scanner.nextInt ();
        int c = scanner.nextInt();
        if ( a < b+c && b < a+c && c < a+b) {
            System.out.println("треугольник существует");
        } else  {
            System.out.println ("треугольник с такими сторонами не существует");
        }
    }
}
