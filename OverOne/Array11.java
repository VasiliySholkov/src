package OverOne;

import java.util.Scanner;

// Дана прямоугольная матрица. Найти строку с наибольшей суммой элементов.

public class Array11 {
    public static void main (String [] args){
        Scanner scanner=new Scanner (System.in);
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
        int k=0;
        int q=0;
        for (int i=0; i<3; i++){
            int sum=0;
            for (int j=0; j<3; j++){
                sum=sum+array[i][j];
            }
            System.out.println(sum);
            if (q<sum){
                q=sum;
                k=i;
            }
        }
        System.out.println("наибольшая сумма элементов = " + q);
        System.out.println("В " + k + " строке ");
    }
}
