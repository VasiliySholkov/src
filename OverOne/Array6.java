package OverOne;

import java.util.Scanner;

public class Array6 {
    public static void main (String [] args){
        Scanner scanner=new Scanner (System.in);
        int [][] array = new int [3][3]; // объявили массив на 3 строки и 5 столбцов
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                array [i][j]=scanner.nextInt(); // ввод двумерного массива
            }
        }
        int k= scanner.nextInt();
        int count = 0;
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
               if  (array[i][j]>k){
                   count++;
               }
            }
        }
        System.out.println(count);
    }
}
