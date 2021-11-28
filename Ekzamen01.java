import java.util.Scanner;
// 1.	Переменная num может принимать 4 значения: 1, 2, 3 или 4. Если она имеет значение '1', то в переменную result запишем 'зима', если имеет значение '2' – 'весна' и так далее. Решите задачу через switch-case.
public class Ekzamen01 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
       switch (num){
           case 1:
               System.out.println("Зима");
               break;
           case 2:
               System.out.println("Весна");
               break;
           case 3:
               System.out.println("Лето");
               break;
           case 4:
               System.out.println("Осень");
               break;
           default:
               System.out.println("Поры года под таким номером не существует");
       }

    }
}
