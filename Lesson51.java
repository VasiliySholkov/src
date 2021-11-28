import java.util.Scanner;

public class Lesson51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[6];
        for (int i = 0; i < array.length; i++) {      // отвечает за ввод славиатуры
            array[i] = scanner.nextInt();
        }
        double sum=0;
        for (int i=0; i<array.length;i++){
            sum=sum+array[i];
        }
        double avg=sum/array.length;
        System.out.println(avg);
        }
        }








