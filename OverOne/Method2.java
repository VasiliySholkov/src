package OverOne;

import java.util.Scanner;
// 1.Вам нужно будет создать метод для того чтобы вывода одномерный массив на экран
// 2. Создать метод для заполнения одномерного массива
// 3.   Метод которфй найдет наибольший элемент массива
public class Method2 {

    public static  void main(String [] agrs) {
        int [] array= new int[5];
        zapisArray(array);
        vivodArray(array);
       maxelement(array);
    }
    public static void vivodArray(int [] array){ // void не возвращает никакого значения и принимает массив который бутед выведен на экран
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
    }
    public static int [] zapisArray(int [] array){ // передаем в параметры массив который будем заполнять
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            array[i]= scanner.nextInt();
        }
        return array;
    }
    public static void maxelement(int [] array){
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Max="+max);
    }

}
