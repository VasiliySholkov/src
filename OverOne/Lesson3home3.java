package OverOne;

import java.util.Scanner;

public class Lesson3home3 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        for (int i = 1; i <= 256; i=i*2 ){
        s = s + i;
        }
        System.out.println(s);
    }
}

