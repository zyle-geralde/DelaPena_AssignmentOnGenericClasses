package Arithmetic;

public class ArithmeticMain {

    public static void main(String[] args) {
        Arithmetic<Integer,Short> checkgen = new Arithmetic(7,(short) 100);

        System.out.println(checkgen.add());
    }
}
