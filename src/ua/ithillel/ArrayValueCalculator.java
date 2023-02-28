package ua.ithillel;

import ua.ithillel.exceptions.ArrayDataException;
import ua.ithillel.exceptions.ArraySizeException;

public class ArrayValueCalculator {

    public static int doCalc(String[][] strArray) throws ArraySizeException, ArrayDataException {


        int sum = 0;

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray.length; j++) {
                if (strArray.length != 4 || strArray[i].length != 4) throw new ArraySizeException();

                try {
                    sum += Integer.parseInt(strArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(i, j);
                } finally {
                    continue;
                }
            }
        }
        return sum;
    }
}
