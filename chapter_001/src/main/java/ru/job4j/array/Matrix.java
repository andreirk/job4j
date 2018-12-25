package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];

        for(int rows = 0; rows < size; rows++ ){
            for(int cols = 0; cols < size; cols++){
                table[rows][cols] = (rows + 1) * (cols + 1);
            }
        }

        return table;
    }
}