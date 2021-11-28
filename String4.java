// Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//общее их количество.
public class String4{
    public static void main(String[] args) {
        String str1=" Строковый литерал - это последовательность символов! Они аключенны в двойные кавычки. Согласны? ";
        int count = 0;
        char symbol;
        for (int i = 0; i < str1.length(); i++) {
            symbol = str1.charAt(i);
            if (symbol == ','|| symbol == '.'|| symbol =='-' || symbol =='!'|| symbol =='?') {
                count++;
            }
        }
        System.out.println(count+" знаков препинания");
    }
}