package ua.ithillel;

import ua.ithillel.exceptions.ArrayDataException;
import ua.ithillel.exceptions.ArraySizeException;

import static ua.ithillel.ArrayValueCalculator.doCalc;

public class Main {
    public static void main(String[] args) throws ArraySizeException, ArrayDataException {
        //correct array
        String[][] strings1 = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        //array with letters and signs
        String[][] strings2 = new String[][]{{"1", "2", "t", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "w"}, {"/", "2", "3", "4"}};
        //5x4 matrix
        String[][] strings3 = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

        //test correct array
        int sums1 = doCalc(strings1);
        System.out.println(sums1);

        //test array with letters
        int sums2 = doCalc(strings2);
        System.out.println(sums2);

        //test oversize matrix
        int sums3 = doCalc(strings3);
        System.out.println(sums3);
    }
}
