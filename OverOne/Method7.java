package OverOne;// Напишите метод, с помощью которого можно было бы возводить число в куб

import java.util.Scanner;

public class Method7 {

    public static  void main(String [] agrs) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите переменную");
        int a = scanner.nextInt();
        vkub(a);

    }
    public static void vkub(int a){
        int kub=a*a*a;
        System.out.println(kub);
    }
}
