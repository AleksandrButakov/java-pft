package ru.anbn.pft;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyFirstProgram {

    public static void main(String[] args) {

        Point pointA = new Point();
        Point pointB = new Point();

        // введем в консоли координаты точки A
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты точки А на двумерной плоскости разрешением 800 х 600");

        try {
            System.out.print("x (0 ... 800) = ");
            pointA.x = in.nextInt();
            System.out.print("y (0 ... 600) = ");
            pointA.y = in.nextInt();
        } catch (InputMismatchException e) {
            completionProgram();
        }

        // проверка корректности координат
        checkingCorrectnessCoordinates(pointA.x, pointA.y);

        // введем в консоли координаты точки B
        System.out.println("Введите координаты точки B на двумерной плоскости разрешением 800 х 600");

        try {
            System.out.print("x (0 ... 800) = ");
            pointB.x = in.nextInt();
            System.out.print("y (0 ... 600) = ");
            pointB.y = in.nextInt();
        } catch (InputMismatchException e) {
            completionProgram();
        }

        // проверка корректности координат
        checkingCorrectnessCoordinates(pointB.x, pointB.y);

        // вычислим расстояние между точками
        distance(pointA, pointB);


    }

    // проверим что введенные координаты лежат в диапазоне 800 х 600
    static void checkingCorrectnessCoordinates(int x, int y) {
        if (x >= 0 & x <= 800 & y >= 0 & y <= 600) {
            // координаты лежат в требуемом диапазоне
        } else {
            // введены некорректные данные
            completionProgram();
        }
    }

    // вычислим расстояние между точками
    public static void distance(Point A, Point B) {
        System.out.println(A.x);
        System.out.println(A.y);
        System.out.println(B.x);
        System.out.println(B.y);


    }


    // введены некорректные данные, завершение выполнения программы
    static void completionProgram() {
        System.out.println("Введены некорректные данные, запустите программу заново :-(");
        System.exit(0);
    }


        /*
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
 */


}
