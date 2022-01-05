package OverOne;

public class TimePrinter2 {
    public static void main(String[] args) {
        int s = 4500;
        int sec = s % 60;
        int m = ( s - sec ) / 60;
        int  min = m ;
        System.out.println(" A ) " + min + " минут " + sec + " секунд ");
        int min1 = m % 60;
        int h = ( m - min1 ) / 60;
        System.out.println(" B ) " + h + " часов " + min1 + " минут " + sec + " секунд ");
        int h1 = ( m - min ) / 60;
        int hour = h1 % 60;
        int d = ( h1 - hour ) / 24;
        int day = h1 % 24;
        System.out.println(" C ) " + day + " дней " + h + " часов " + min1 + " минут " + sec + " секунд ");
        int w = ( d - day ) / 7;
        int week = d % 7;
        System.out.println(" D ) " + w + " недель " + day + " дней " + h + " часов " + min1 + " минут " + sec + " секунд ");
    }
}
