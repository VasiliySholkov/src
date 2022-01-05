package Generic;

public class Main {
    public static void main(String[] args) {

        Box<Tea> teaBox = new Box<Tea>(new Tea ("Tess"));
        System.out.println(teaBox.get());

        Box<Coffee> coffeeBox = new Box (new Coffee("Jokey"));
        System.out.println(coffeeBox.get());

    }
}
