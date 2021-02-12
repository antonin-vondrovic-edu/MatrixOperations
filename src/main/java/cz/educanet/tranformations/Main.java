package cz.educanet.tranformations;

public class Main {

    public static void main(String[] args) {

        double[][] a = {
                {5, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        double[][] b = {
                {3, 2, 3},
                {4, 5, 10},
                {8, 7, 4},
        };


        IMatrix matA = MatrixFactory.create(a);
        IMatrix matB = MatrixFactory.create(b);


        double getA = matA.get(0, 0);
        double getB = matB.get(0, 0);

        int forScalar = 2;

        IMatrix adding = matA.add(matB);
        IMatrix times = matA.times(matB);
        IMatrix timesScalarA = matA.times(forScalar);
        IMatrix timesScalarB = matB.times(forScalar);

        System.out.println("######");
        System.out.println("MATRIX");
        System.out.println("######");

        System.out.println("getA0: " + getA + " getB0: " + getB);

        System.out.println();
        System.out.println("Addition A+B:");
        for (int i = 0; i < adding.getRows(); i++) {
            for (int j = 0; j < adding.getColumns(); j++) {
                System.out.print(adding.get(i,j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Times A*B:");
        for (int i = 0; i < times.getRows(); i++) {
            for (int j = 0; j < times.getColumns(); j++) {
                System.out.print(times.get(i,j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Times Scalar A*"+ forScalar +":");
        for (int i = 0; i < timesScalarA.getRows(); i++) {
            for (int j = 0; j < timesScalarA.getColumns(); j++) {
                System.out.print(timesScalarA.get(i,j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Times Scalar B*"+ forScalar +":");
        for (int i = 0; i < timesScalarB.getRows(); i++) {
            for (int j = 0; j < timesScalarB.getColumns(); j++) {
                System.out.print(timesScalarB.get(i,j) + " ");
            }
            System.out.println();
        }
    }
}