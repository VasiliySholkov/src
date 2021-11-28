import java.util.Scanner;



    // 5.	* Дано целое числоN (> 0). Используя операции деления нацело и
    // взятияостаткаотделения,найтичисло,полученноеприпрочтениичислаNсправаналево.
import java.util.Scanner;

    public class Ekzamen05 {
        public static void main(String... args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int res = 0;
            while (n > 0) {
                res *= 10;
                res += n % 10;
                n /= 10;
            }
            System.out.println(res);
        }
    }


