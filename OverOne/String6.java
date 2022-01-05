package OverOne;// Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//        учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//        текста также могут быть пробелы, но могут и отсутствовать.

public class String6{
    public static void main(String[] args) {
        String str1="Строковый литерал - это последовательность символов! Они заключенны в двойные кавычки. Согласны? ";
        int count = 0;
        char symbol;
        for (int i = 0; i < str1.length(); i++) {
            symbol = str1.charAt(i);
            if (symbol == ' ') {
                count++;
            }
        }
        System.out.println(count+" пробелов");
    }
}