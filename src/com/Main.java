package com;

import classes.AllTriangle;
import classes.RightTriangle;
import classes.Triangle;

public class Main {

    public static final int N = 3;
    public static final int M = 3;
    public static final int MAXSIZE = 50;

    /**
     * 11. Создать класс треугольник, члены класса – длины 3-х сторон.
     * Предусмотреть в классе методы проверки существования треугольника,
     * вычисления и вывода сведений о фигуре – длины сторон, углы, периметр, площадь.
     * Создать производный класс – прямоугольный треугольник, предусмотреть в классе проверку, является ли треугольник прямоугольным.
     * Написать программу, демонстрирующую работу с классом: дано N треугольников и M прямоугольных треугольников,
     * найти треугольник с максимальной площадью и прямоугольный треугольник с наименьшей гипотенузой.
     */
    public static void main(String[] args) {
        int sideOne, sideTwo, sideThree;
        AllTriangle allTriangle = new AllTriangle(N);

        for (int i = 0; i < N; i++) {
            while (!Triangle.existsTriangle(sideOne = ((int) (Math.random() * MAXSIZE + 1)), sideTwo = ((int) (Math.random() * MAXSIZE + 1)), sideThree = ((int) (Math.random() * MAXSIZE + 1)))) {
            }
            Triangle triangle = new Triangle(sideOne, sideTwo, sideThree);
            allTriangle.add(triangle);
        }
        System.out.println(allTriangle);
        System.out.print("Maximum area triangle: ");
        System.out.println(allTriangle.maxSquare());

        AllTriangle rightTriangles = new AllTriangle(M);

        for (int i = 0; i < M; i++) {
            while (!RightTriangle.existsRightTriangle(sideOne = ((int) (Math.random() * MAXSIZE + 1)), sideTwo = ((int) (Math.random() * MAXSIZE + 1)), sideThree = ((int) (Math.random() * MAXSIZE + 1)))) {
            }
            RightTriangle rightTriangle = new RightTriangle(sideOne, sideTwo, sideThree);
            rightTriangles.add(rightTriangle);
        }
        System.out.println(rightTriangles);
        System.out.print("Right ");
        System.out.println(rightTriangles.minHypotenuseRightTriangle());

    }
}

