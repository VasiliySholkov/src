package OverOne;

import java.util.Scanner;
//2) Треугольник существует только тогда, когда сумма любых двух его сторонбольше третьей. Определить существует ли
// такой треугольник. Дано: a, b, c –стороны предполагаемого треугольника. Требуется сравнить длину каждогоотрезка-
// стороны с суммой двух других. Если хотя бы в одном случае отрезококажется больше суммы двух других, то треугольника
// с такими сторонами несуществует.`

public class Method6 {

    public static  void main(String [] agrs) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите переменную");
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt ();
        int h3 = scanner.nextInt();
        sravnenie(h1, h2, h3);

    }
    public static void sravnenie(int h1, int h2, int h3){
        if ( h1 < h2+h3 && h2 < h1+h3 && h3 < h1+h2) {
            System.out.println("треугольнику быть");
        } else  {
            System.out.println ("треугольник не получится");
        }
    }
    }
