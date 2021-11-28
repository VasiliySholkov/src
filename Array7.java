import java.util.Scanner;

// 2. Дан целочисленный массив В[1..3, 1..3]. Заменить все его элементы их квадратами.

public class Array7 {
    public static void main (String [] args){
        Scanner scanner=new Scanner (System.in);
        int [][] array = new int [3][3]; // объявили массив на 3 строки и 5 столбцов
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
                array[i][j]=array[i][j]*array[i][j];
            }
        }
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(array[i][j]+" "); // вывод двумерного массива
            }
            System.out.println(" ");
        }
        }

    }

