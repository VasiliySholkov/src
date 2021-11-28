import java.util.Scanner;

// 3. Дан действительный массив А [1...3, 1...3]. Напечатать индексы его отрицательных элементов.

public class Array8 {
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
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
        if (array [i][j]<0) {
            System.out.println(array[i][j]);
            System.out.println(i + " " + j);
            }
        }
        }

    }
}
