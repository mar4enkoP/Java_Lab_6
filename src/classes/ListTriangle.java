package classes;

import java.util.ArrayList;
import java.util.List;

public class ListTriangle {
    private final List<Triangle> allTriangle;

    public ListTriangle() {
        allTriangle = new ArrayList<>();
    }

    public boolean add(Triangle triangle) {
        return allTriangle.add(triangle);
    }

    public double maxSquare() {
        double value = 0;
        for (Triangle triangle : allTriangle) {
            if (value < triangle.getSquare()) {
                value = triangle.getSquare();
            }
        }
        return value;
    }

    public Triangle minHypotenuseRightTriangle() {
        int minHypotenuse = 9999;
        Triangle tmpTriangle = new Triangle(0, 0, 0);
        for (Triangle triangle : allTriangle) {
            if ((triangle instanceof RightTriangle) && (((RightTriangle) triangle).getHypotenuse() < minHypotenuse)) {
                tmpTriangle = triangle;
                minHypotenuse = Math.max(Math.max(triangle.getSideOne(), triangle.getSideTwo()), triangle.getSideThree());
            }
        }
        return tmpTriangle;
    }

    @Override
    public String toString() {
        return "" + allTriangle;
    }
}