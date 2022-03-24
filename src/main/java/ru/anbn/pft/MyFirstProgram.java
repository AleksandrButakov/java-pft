package ru.anbn.pft;

public class MyFirstProgram {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int i = 4;
        hello("Hello world!");
        System.out.println(area(5));
        System.out.println(area(5, 8));

    }

    private static void hello(String st) {
        System.out.println(st);
    }

    private static double area(double len) {
        return len * len;
    }

    private static double area(double len, double l) {
        return len * l;
    }

}
