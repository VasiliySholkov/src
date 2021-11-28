public class String3{
        public static void main(String[] args) {
        String str1=" Строковый литерал - это последовательность символов,заключенных в двойные кавычки.";
        int count = 0;
        char symbol;
        for (int i = 0; i < str1.length(); i++) {
        symbol = str1.charAt(i);
        if (symbol == ','|| symbol == '.'|| symbol =='-' ) {
        count++;
        }
        }
        System.out.println(count+" знаков препинания");
        }
        }