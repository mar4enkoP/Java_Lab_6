package classes;
import java.util.Arrays;

public class AllTriangle {

        private Triangle[] allTriangle;

        public AllTriangle(int length) {
            this.allTriangle = new Triangle[length];
        }

        public void setTriangleAt(int number, Triangle triangle) {
            allTriangle[number] = triangle;
        }

        public void add(Triangle triangle) {
            int n = 0;
            for (Triangle triangle1 : allTriangle) {
                if (triangle1 == null) {
                    break;
                } else {
                    n++;
                }
            }
            if (allTriangle.length == n) {
                resize(n + 1);
            }
            setTriangleAt(n, triangle);
        }

        public void resize(int newLength) {
            Triangle[] tempTriangles = new Triangle[newLength];
            tempTriangles = Arrays.copyOf(allTriangle, newLength);
            allTriangle = tempTriangles;
        }

        public double maxSquare() {
            double value = 0;
            for (Triangle triangle : allTriangle) {
                if (value<triangle.getSquare()){
                    value = triangle.getSquare();
                }
            }
            return value;
        }

        public Triangle minHypotenuseRightTriangle() {
            int minHypotenuse = 99999;
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
            String result = System.lineSeparator();
            for (Triangle triangle : allTriangle) {
                result += triangle + System.lineSeparator();
            }
            return result;
        }
    }

