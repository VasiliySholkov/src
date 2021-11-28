import java.util.Scanner;
//3.	Даночисло A.Найтисуммувсехцелыхчиселот0 до A.
public class Ekzamen03 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum=0;
            for (int i=0; i<=a; i++ ){
                sum=sum+i;
            }System.out.println(sum);
        }
    }