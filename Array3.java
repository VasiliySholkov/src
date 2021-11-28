import java.util.Scanner;

public class Array3 {
    public static  void main(String  [] agrs ){
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt(); // вводим с клавиатуры размер массива
        int [] array= new int[n]; //объявления и инициализация массива
        for(int i=0;i<n;i++){
            array[i]=scanner.nextInt(); //заполняем наш массив данными
        }
        int z=scanner.nextInt(); // ввод числа на которое будем заменять
        int count=0; // счетчик для подсчета кол-во замен

        for(int i=0;i<n;i++){
            if(array[i]>z){  // проверка элемента массива больше ли оно z
                array[i]=z; // замена нашего элемента массива array[i] на z
                count++; // подсчет кол-во замен
            }
            System.out.print(array[i]+" "); // вывод массива после замен
        }
        System.out.println("Счетчик="+count); // кол-во замен
    }
}
