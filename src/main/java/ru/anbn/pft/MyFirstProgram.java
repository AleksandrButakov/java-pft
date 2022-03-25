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

        // вычислим расстояние между точками в функции класса MyFirstProgram
        distance(pointA, pointB);

        // вычислим расстояние между точками в методе класса Point
        Point p = new Point();
        System.out.println("Вычисление расстояния в методе:");
        System.out.println("Расстояние между точками A и B = " + p.distance(pointA, pointB) + "pixels");
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
        // переменные для расчета сторон треугольника
        int a, b;
        double c;
        a = Math.abs(A.x - B.x);
        b = Math.abs(A.y - B.y);
        c = Math.sqrt(a * a + b * b);
        System.out.println("Вычисление расстояния в функции:");
        System.out.println("Расстояние между точками A и B = " + String.format("%.2f", c) + "pixels");
    }

    // введены некорректные данные, завершение выполнения программы
    static void completionProgram() {
        System.out.println("Введены некорректные данные, запустите программу заново :-(");
        System.exit(0);
    }

}
