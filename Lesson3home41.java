import java.util.Scanner;

public class Lesson3home41 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа A и B");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum=0;
        for (int i=1; i<=b; i++){
           sum=sum+a;

        }
        System.out.println(sum);
    }
}



