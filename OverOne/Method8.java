package OverOne;// Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.


import java.util.Scanner;

public class Method8 {

    public static  void main(String [] agrs) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите переменные");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        umnozhenie(a,b);

    }
    public static void umnozhenie(int a, int b){
        int kub=a*a*a;
        System.out.println(kub);
    }
}
