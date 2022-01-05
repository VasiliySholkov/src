package OverOne;

import java.util.Random;
import java.util.Scanner;

public class Lesson5 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {      // отвечает за ввод славиатуры
            array[i] = scanner.nextInt();
        }
        int j=0;
        int k=j+1;
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if (j==k) {
                k++;
            }
        }
        {
            System.out.println(k);
        }

    }
}





