public class String1 {
    public static void main(String... agrs) {
        // Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
        String str1 = "I like Java!!!";
        System.out.println(str1);
        System.out.println("Последний символ строки: " + getChar(str1));
        System.out.println("Заканчивается ли ваша строка подстрокой “!!!”? --- " + getChar1(str1));
        System.out.println("Начинается ли ваша строка подстрокой “I like”? --- " + getChar2(str1));
        System.out.println("Содержит ли ваша строка подстроку “Java”? --- " + getChar3(str1));
        System.out.println("Позиция подстроки “Java” в строке “I like Java!!!”: " + getChar4(str1));
        System.out.println("Заменить все символы “а” на “о”: " + getChar5(str1));
        System.out.println("К верхнему регистру: " + getChar6(str1));
        System.out.println("К нижнему регистру: " + getChar7(str1));
        System.out.println("Вырезать строку Java: " + getChar8(str1));
    }

    public static char getChar(String string) {
        //Распечатать последний символ строки. Используем метод String.charAt().
        return string.charAt(string.length() - 1);
    }

    public static boolean getChar1(String string) {
        //Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
        return string.endsWith("!!!");
    }

    public static boolean getChar2(String string) {
        //Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
        return string.startsWith("I like");
    }

    public static boolean getChar3(String string) {
        //Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        return string.contains("Java");
    }

    public static int getChar4(String string){
        //Найти позицию подстроки “Java” в строке “I like Java!!!”.
        return string.indexOf("Java"); }

    public static String getChar5(String string) {
        //Заменить все символы “а” на “о”.
        return string.replace('a', 'o');
    }

    public static String getChar6(String string) {
        //Преобразуйте строку к верхнему регистру.
        return string.toUpperCase();
    }

    public static String getChar7(String string) {
        //Преобразуйте строку к нижнему регистру.
        return string.toLowerCase();
    }

    public static String getChar8(String string) {
        //Вырезать строку Java c помощью метода String.substring().
        return string.substring(7, 11);
    }
}