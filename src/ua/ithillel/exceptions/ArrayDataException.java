package ua.ithillel.exceptions;

public class ArrayDataException extends Exception {
    private int i, j;

    public ArrayDataException(int i, int j) {
        System.out.println("Необрабатываемый элемент в ячейке [" + i + "][" + j + "]");
    }
}
