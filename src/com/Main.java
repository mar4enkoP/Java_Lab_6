package com;

//import classes.AllTriangle;//is not used

import classes.ListTriangle;
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

        ListTriangle listTriangle = new ListTriangle();
        for (int i = 0; i < M; i++) {
            while (!Triangle.existsTriangle(sideOne = ((int) (Math.random() * MAXSIZE + 1)), sideTwo = ((int) (Math.random() * MAXSIZE + 1)), sideThree = ((int) (Math.random() * MAXSIZE + 1)))) {
            }
            listTriangle.add(new Triangle(sideOne, sideTwo, sideThree));
        }
        System.out.println(listTriangle);
        System.out.print("Maximum area triangle: ");
        System.out.println(listTriangle.maxSquare());

        ListTriangle rightTrianglesList = new ListTriangle();
        for (int i = 0; i < N; i++) {
            while (!RightTriangle.existsRightTriangle(sideOne = ((int) (Math.random() * MAXSIZE + 1)), sideTwo = ((int) (Math.random() * MAXSIZE + 1)), sideThree = ((int) (Math.random() * MAXSIZE + 1)))) {
            }
            rightTrianglesList.add(new RightTriangle(sideOne, sideTwo, sideThree));
        }
        System.out.println(rightTrianglesList);
        System.out.print("Right ");
        System.out.println(rightTrianglesList.minHypotenuseRightTriangle());
    }
}

