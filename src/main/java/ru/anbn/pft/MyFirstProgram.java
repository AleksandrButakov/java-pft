package ru.anbn.pft;

public class MyFirstProgram {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int i = 4;
        hello("Hello world!");

        Square s = new Square(5);
        System.out.println(area(s));

        Rectangle r = new Rectangle();
        r.a = 3;
        r.b = 7;
        System.out.println(area(r));

    }

    private static void hello(String st) {
        System.out.println(st);
    }

    private static double area(Square s) {
        return s.l * s.l;
    }

    private static double area(Rectangle r) {
        return r.a + r.b;
    }

}
