import java.util.Scanner;

public class Lesson2 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите переменную");
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt ();
        int h3 = scanner.nextInt();

        if ( h1 < h2+h3 && h2 < h1+h3 && h3 < h1+h2) {

            System.out.println("треугольнику быть");
        } else  {
            System.out.println ("треугольник не получится");
        }


    }
}
