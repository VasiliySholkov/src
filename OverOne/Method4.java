package OverOne;

import java.util.Scanner;

public class Method4 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(chisloNaOborot(n));
    }


    public static int chisloNaOborot(int n){
//        int res=0;              // локальная переменная
        if (n>5){
            n=n+5;
        }
        if (n<5){
            n=n+10;
        }
        return n;
    }
}