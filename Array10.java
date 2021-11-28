import java.util.Scanner;

// Введите с клавиатуры целочисленные элементы матрицы 3*3 и вычислите сумму элементов каждого столбца.

public class Array10 {
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
        for (int j=0; j<3; j++){
            int sum=0;
            for (int i=0; i<3; i++){
                sum=sum+array[i][j];
            }
            System.out.println(sum);
        }
    }
}
