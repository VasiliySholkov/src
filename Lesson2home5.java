import java.util.Scanner;

public class Lesson2home5 {
        public static void main(String... args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите переменные");
            int e1 = scanner.nextInt();
            int e2 = scanner.nextInt();
            int e3 = scanner.nextInt();
            if (e1 > 0 && e2 < 0 && e3 < 0 || e1 < 0 && e2 > 0 && e3 < 0 || e1 < 0 && e2 < 0 && e3 > 0) {
                System.out.println( " 1 положительное число и 2 отрицательных числа ");
            }
            if (e1 > 0 && e2 > 0 && e3 < 0 || e1 < 0 && e2 > 0 && e3 > 0 || e1 > 0 && e2 < 0 && e3 > 0) {
                System.out.println(" 2 положительных числа и 1 отрицательное ");
            }
            if (e1 > 0 && e2 > 0 && e3 > 0) {
                System.out.println(" 3 положительных числа ");
            }
            if (e1 < 0 && e2 < 0 && e3 < 0) {
                System.out.println(" 3 отрицательных числа ");
        }
    }
}
