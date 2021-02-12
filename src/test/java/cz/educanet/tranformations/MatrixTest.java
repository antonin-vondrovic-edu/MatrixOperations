package cz.educanet.tranformations;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {

    private IMatrix a;
    private IMatrix b;
    private IMatrix c;
    private IMatrix d;
    private IMatrix empty;

    @Before
    public void setUp() throws Exception {
        double[][] rawA = {
                {1, 1, 1},
                {1, 1, 1},
        };
        a = MatrixFactory.create(rawA);

        double[][] rawB = {
                {1, 1, 1},
                {1, 1, 1},
                {0, 0, 0},
        };
        b = MatrixFactory.create(rawB);
        double[][] rawC = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1},
        };
        c = MatrixFactory.create(rawC);

        double[][] rawEmpty = {};
        empty = MatrixFactory.create(rawEmpty);

        double[][] rawD = {
                {1, 1}
        };
        d = MatrixFactory.create(rawD);
    }

    @Test
    public void getRows() {
        assertEquals(2, a.getRows());
        assertEquals(3, b.getRows());
        assertEquals(3, c.getRows());
        assertEquals(0, empty.getRows());
    }

    @Test
    public void getColumns() {
        assertEquals(3, a.getColumns());
        assertEquals(3, b.getColumns());
        assertEquals(3, c.getColumns());
        assertEquals(0, empty.getColumns());
        assertEquals(2, d.getColumns());
    }

    @Test
    public void times() {
        IMatrix times = a.times(b);

        System.out.println();
        System.out.println("Times A*B:");
        for (int i = 0; i < times.getRows(); i++) {
            for (int j = 0; j < times.getColumns(); j++) {
                System.out.print(times.get(i, j) + " ");
            }
            System.out.println();
        }

    }

    @Test
    public void timesScalar() {
        int forScalar = 3;
        IMatrix timesScalarA = a.times(forScalar);
        IMatrix timesScalarB = b.times(forScalar);
        IMatrix timesScalarC = c.times(forScalar);
        IMatrix timesScalarD = d.times(forScalar);

        System.out.println();
        System.out.println("Times Scalar A*" + forScalar + ":");
        for (int i = 0; i < timesScalarA.getRows(); i++) {
            for (int j = 0; j < timesScalarA.getColumns(); j++) {
                System.out.print(timesScalarA.get(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Times Scalar B*" + forScalar + ":");
        for (int i = 0; i < timesScalarB.getRows(); i++) {
            for (int j = 0; j < timesScalarB.getColumns(); j++) {
                System.out.print(timesScalarB.get(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Times Scalar C*" + forScalar + ":");
        for (int i = 0; i < timesScalarC.getRows(); i++) {
            for (int j = 0; j < timesScalarC.getColumns(); j++) {
                System.out.print(timesScalarC.get(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Times Scalar D*" + forScalar + ":");
        for (int i = 0; i < timesScalarD.getRows(); i++) {
            for (int j = 0; j < timesScalarD.getColumns(); j++) {
                System.out.print(timesScalarD.get(i, j) + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void add() {
        IMatrix adding = a.add(b);

        System.out.println();
        System.out.println("Addition A+B:");
        for (int i = 0; i < adding.getRows(); i++) {
            for (int j = 0; j < adding.getColumns(); j++) {
                System.out.print(adding.get(i,j) + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void get() {
        double getA = a.get(0, 0);
        double getB = b.get(0, 0);
        double getC = c.get(0, 0);
        double getD = d.get(0, 0);

        System.out.println();
        System.out.println("getA0: " + getA + " getB0: " + getB);
        System.out.println("getC0: " + getC + " getD0: " + getD);
    }

    @Test
    public void transpose() {

    }

    @Test
    public void determinant() {
        //hiiiii
    }
}
