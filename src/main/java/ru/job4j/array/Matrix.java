package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                array[x][y] = (x + 1) * (y + 1);
            }
        }
    return array;
    }
}
