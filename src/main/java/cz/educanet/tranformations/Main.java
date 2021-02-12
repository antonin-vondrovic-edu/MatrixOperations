package cz.educanet.tranformations;

public class Main {

    public static void main(String[] args) {

        double[][] a = {
                {5, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        double[][] b = {
                {5, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        IMatrix matA = MatrixFactory.create(a);
        IMatrix matB = MatrixFactory.create(b);


        double outputA = matA.get(0, 0);
        double outputB = matB.get(0, 0);

        IMatrix adding = matA.add(matB);
        IMatrix times = matA.times(matB);

        System.out.println("######");
        System.out.println("MATRIX");
        System.out.println("######");

        System.out.println("OutA0: " + outputA + " OutB0: " + outputB);

        System.out.println();
        System.out.println("Addition:");
        for (int i = 0; i < adding.getRows(); i++) {
            for (int j = 0; j < adding.getColumns(); j++) {
                System.out.print(adding.get(i,j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Times:");
        for (int i = 0; i < times.getRows(); i++) {
            for (int j = 0; j < times.getColumns(); j++) {
                System.out.print(times.get(i,j) + " ");
            }
            System.out.println();
        }
    }
}