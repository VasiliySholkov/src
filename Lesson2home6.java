
import java.util.Scanner;

public class Lesson2home6 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите переменные");
        int r1 = scanner.nextInt();
        int r2 = scanner.nextInt();

        if ( r1 > r2 ) {

            System.out.println(r1);
        } else  {
            System.out.println (r2);
        }
    }
}
