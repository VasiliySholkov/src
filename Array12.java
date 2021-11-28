import java.util.Scanner;

// Дана прямоугольная матрица. Найти сумму всех чётных элементов массива.

public class Array12 {
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
        int sum=0;
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (array[i][j]%2==0) {
                    sum=sum+array[i][j];

                }
            }
        }
        System.out.println("Сумма всех чётных элементов массива = " + sum);
    }
}
