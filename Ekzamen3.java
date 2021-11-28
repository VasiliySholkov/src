import java.util.Scanner;

public class Ekzamen3 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(chisloNaOborot(n));
    }


    public static int chisloNaOborot(int n){
        int res=0;              // локальная переменная
        while (n > 0) {
            res *= 10;
            res += n % 10;
            n /= 10;
        }
        return res;
    }
}