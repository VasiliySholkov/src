

public class Method1 {

    public static void main (String [] args) {
        Computer computer=new Computer(18,20,true,true,200);
        System.out.println(computer.toString());
        System.out.println("Сколько весит наш компьютер " + computer.getVec());
    }
}
