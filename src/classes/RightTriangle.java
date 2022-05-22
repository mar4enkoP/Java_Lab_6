package classes;

    public class RightTriangle extends Triangle {
        public RightTriangle(int sideOne, int sideTwo, int sideThree) {
            super(sideOne, sideTwo, sideThree);
        }

        public static boolean existsRightTriangle(int sideOne, int sideTwo, int sideThree) {
            return (sideOne > 0) && (sideTwo > 0) && (sideThree > 0) && ((sideOne * sideOne + sideTwo * sideTwo == sideThree * sideThree) || (sideOne * sideOne + sideThree * sideThree == sideTwo * sideTwo) || (sideTwo * sideTwo + sideThree * sideThree == sideOne * sideOne));
        }

        public int getHypotenuse(){
            return (Math.max(Math.max(sideOne, sideTwo), sideThree));
        }

    }

