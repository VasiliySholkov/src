import java.util.Scanner;

public class Lesson3home1 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        double s=10.00;
        int d=7;
        double sum=0.00;
        double sum1=0.00;
        for (int i=0; i<d; i++) {
            sum=s+s*0.1*i;
            sum1=sum*i;
        }
        System.out.println( sum1 + " км пробежал спортсмен за 7 дней ");
    }
}
