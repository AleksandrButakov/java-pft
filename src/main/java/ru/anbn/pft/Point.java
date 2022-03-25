package ru.anbn.pft;

// класс для представления точек на двумерной плоскости 800 х 600
public class Point {

    // координаты точки
    public int x;
    public int y;

    // вычислим расстояние между точками
    public static String distance(Point A, Point B) {
        // переменные для расчета сторон треугольника
        int a, b;
        double c;
        a = Math.abs(A.x - B.x);
        b = Math.abs(A.y - B.y);
        c = Math.sqrt(a * a + b * b);
        return String.format("%.2f", c);
    }

}
