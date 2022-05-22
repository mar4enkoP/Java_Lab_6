package classes;

public class Triangle {
    protected int sideOne;
    protected int sideTwo;
    protected int sideThree;


    public Triangle(int sideOne, int sideTwo, int sideThree) {
        this.setSideOne(sideOne);
        this.setSideTwo(sideTwo);
        this.setSideThree(sideThree);
    }

    public static boolean existsTriangle(int sideOne, int sideTwo, int sideThree) {
        return (sideOne > 0) && (sideTwo > 0) && (sideThree > 0) && (sideOne + sideTwo > sideThree) && (sideOne + sideThree > sideTwo) && (sideThree + sideTwo > sideOne);
    }

    public int getSideOne() {
        return sideOne;
    }

    protected void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    protected void setSideTwo(int sideTwo) {
        this.sideTwo = sideTwo;
    }

    public int getSideThree() {
        return sideThree;
    }

    protected void setSideThree(int sideThree) {
        this.sideThree = sideThree;
    }

    public float getAngles(float sideA, float sideB, float sideC) {
        return (float) Math.toDegrees(Math.acos((sideA * sideA + sideB * sideB - sideC * sideC) / (2 * sideB * sideA)));
    }

    public int getPerimeter() {
        return (sideOne + sideTwo + sideThree);
    }

    public float getSquare() {
        float p = (sideOne + sideTwo + sideThree) / 2f;
        return (float) Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
    }

    @Override
    public String toString() {
        return "Triangle : " +
                "sideOne = " + sideOne +
                ", sideTwo = " + sideTwo +
                ", sideThree = " + sideThree +
                ", < A = " + getAngles(sideOne, sideTwo, sideThree) +
                ", < B = " + getAngles(sideOne, sideThree, sideTwo) +
                ", < C = " + getAngles(sideThree, sideTwo, sideOne) +
                ", P = " + getPerimeter() +
                ", S = " + getSquare();
    }
}
