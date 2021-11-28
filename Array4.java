import java.util.Scanner;

public class Array4 {
    public static  void main(String  [] agrs ) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // вводим с клавиатуры размер массива
        int[] array = new int[n]; //объявления и инициализация массива
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt(); //заполняем наш массив данными
        }
        int k=scanner.nextInt(); // число на которое мы будем проверять кратность
        int sum=0;// переменная в которой будет записываться наша сумма
        for(int i=0; i<n ;i++){
            if(array[i]%k==0){
                sum+= array[i];
            }
        }
        System.out.println("Наша сумма="+sum);
    }
}
