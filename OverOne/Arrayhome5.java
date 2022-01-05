package OverOne;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayhome5 {
// Определите сумму элементов одномерного массива, расположенных между
//минимальным и максимальным значениями
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива N");
        int n= scanner.nextInt();
        System.out.println("Введите элементы одномерного массива");
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {      // отвечает за ввод славиатуры
            array[i] = scanner.nextInt();
        }
//        int min=array[0];
//        int max=array[0];
//        for (i=0; i < array.length; i++){
//           if (array[i]>=max) ;
//       }
    }
}

