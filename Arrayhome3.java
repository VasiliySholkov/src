import java.util.Random;
import java.util.Scanner;
// Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
// Подсчитать количество замен.
public class Arrayhome3 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива N ");
        int n= scanner.nextInt();             // отвечает за ввод славиатуры
        System.out.println("Введите число Z");
        int z= scanner.nextInt();            // отвечает за ввод славиатуры
        System.out.println("Введите действительное число массива");
        int a = scanner.nextInt();           // отвечает за ввод славиатуры
        int q=0;
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {      // отвечает за ввод славиатуры
            array[i] = scanner.nextInt();
        }
        if (array[n]>z)
            {
                array[n] = z;
                q++;
            } System.out.println("Было произведено " + q + " замен");
    }
}





