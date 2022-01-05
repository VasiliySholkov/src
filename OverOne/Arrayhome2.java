package OverOne;

import java.util.Scanner;
// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы
public class Arrayhome2 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n= scanner.nextInt();                 // отвечает за ввод славиатуры
        int array[] = new int[n];

        for (int i=0; i<array.length; ++i) {
            System.out.println("Введите действительное число массива");
            array[i] = scanner.nextInt();           // отвечает за ввод славиатуры
        }
            int min = 0;
            int max = 0;

            for (int i=0; i<array.length; i++)
                if (array[i]>array[max]){
                    max=i;
                }
            else if (array[i]<array[min]){
                min=i;
        }
            int tmp=array[min];
            array[min]=array[max];
            array[max]=tmp;
            for (int i=0; i<n; );
    }
}





