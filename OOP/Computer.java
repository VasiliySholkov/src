package OOP;

// Создать класс компьютер.
//Поля:
//- процессор
//- оперативка
//- жесткий диск
//- ресурс полных циклов работы (включений/выключений)
//
//Методы:
//- метод описание(вывод всех полей)
//- метод включить, при включении может произойти сбой, при вызове метода рандом загадывает число (0 либо 1),
// вы вводите число с клавиатуры, если угадали комп включается, если нет сгорает. Если комп сгорел,
// при попытке включить нужно выдать сообщение, что ему конец
//- выключить (аналогично включению)
//- при превышении лимита ресурса комп сгорает

import java.util.Random;

public class Computer<randomInt> {
    public String cpu;      // процессор
    public int operativka;  // оперативка
    public String hardDisk; // жесткий диск
    public int kolvo;       // ресурс полных циклов работы (включений/выключений)
    public boolean power;

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", operativka=" + operativka +
                ", hardDisk='" + hardDisk + '\'' +
                ", kolvo=" + kolvo +
                '}';
    }

    public void showAll() {
        System.out.println(this.toString());
    }

    public void printComputer() {
        System.out.println("Данный компьютер с процессором " + cpu);
        System.out.println("Оперативная память --- " + operativka + " ГБ ");
        System.out.println("Жёсткий диск на " + hardDisk + " ГБ ");
        System.out.println("Ресурс полных циклов работы --- " + kolvo + " включений/выключений ");
    }
    public void printKolvo (String[] args) {
            Random rnd = new Random();
            int[] array = new int[1];
            for (int i = 0; i < array.length; i++) {
                array[i] = rnd.nextInt(2);
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

