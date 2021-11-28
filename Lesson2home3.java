import java.util.Scanner;

public class Lesson2home3  {
        public static void main(String... args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите переменную");
            int w = scanner.nextInt();


            if ( w > 0) {

                System.out.println( w + 1);
            }
            if ( w < 0) {

                System.out.println( w - 2);
            }
            if ( w == 0) {

                System.out.println( 10 );
            }
        }
    }

