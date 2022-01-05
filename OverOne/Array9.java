package OverOne;

import java.util.Scanner;

// 4. Создайте двумерный целочисленный массив А[1..3, 1..3] и найдите сумму всех его элементов,
// имеющих оба нечетных индекса.

public class Array9 {
    public static void main (String [] args){
        Scanner scanner=new Scanner (System.in);
        int sum=0;
        int [][] array = new int [3][3]; // объявили массив на 3 строки и 3 столбца
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                array [i][j]=scanner.nextInt(); // ввод двумерного массива
            }
        }
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(array[i][j]+" "); // вывод двумерного массива
            }
            System.out.println(" ");
        }
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (i%2!=0 && j%2!=0) {
                    sum=sum+array[i][j];

                }
            }
        }
        System.out.println(sum);


    }
}
