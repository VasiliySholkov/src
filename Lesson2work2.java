import java.util.Scanner;

public class Lesson2work2 {
        public static void main(String... args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите переменную");
            int x = scanner.nextInt();
                        if ( x > 0 && x < 5 ) {

                System.out.println( 2 * x);
            }
            if ( x == 0 ) {

                System.out.println( " -10 ");
            }
            if ( x == 10 ) {

                System.out.println( 2 * x * x - 10 );
            }
        }
    }

