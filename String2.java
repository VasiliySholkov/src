//
//
public class String2 {
    public static void main(String... agrs) {
        // Давайте попробуем подсчитать количество запятых, точек и тире в строке:
        // Строковый литерал — это последовательность символов,
        ////заключенных в двойные кавычки.
        String str1 = "Строковый литерал — это последовательность символов,заключенных в двойные кавычки.";
        String[] arrayText = str1.split("[[\\p{Punct}]*|[\\p{Space}]*]+");
        System.out.println("количество слов: " + arrayText.length);
        int couttt = str1.length() - str1.replaceAll("\\p{Punct}", "").length();
        System.out.println("колличество знаков прип-ия: " + couttt);
    }
}