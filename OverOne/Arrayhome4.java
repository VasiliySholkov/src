package OverOne;

import java.util.Scanner;
// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
public class Arrayhome4 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива N");
        int n= scanner.nextInt();
        System.out.println("Введите число K");
        int k = scanner.nextInt();
        int sum=0;
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {      // отвечает за ввод славиатуры
            array[i] = scanner.nextInt();
        }
        if (array[n]%k==0){
            sum=sum+array[n];
            System.out.println("Сумма элементов, кратным " + k + " равна " +sum);
        }
    }
}

