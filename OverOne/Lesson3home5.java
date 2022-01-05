package OverOne;

import java.util.Scanner;

public class Lesson3home5  {
    public static void main(String... args) {
        double count = 1;
        for (int i = 1; i <= 20; i ++) {
            count = i * 2.54;
            System.out.println( i + " дюйма = " + count + " сантиметров ");
        }
    }
}