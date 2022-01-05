package OverOne;

public class Method {

    public static void main (String [] args) {

        int a=5;
        int b=4;
        System.out.println (getMaxOrFalse (a,b));


    }

    public static boolean getMaxOrFalse (int a, int b){
        if (a>b){
            return true;
        }
        return false;
    }
}
