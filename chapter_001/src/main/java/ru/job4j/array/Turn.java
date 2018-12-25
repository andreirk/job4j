package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        int middle = array.length / 2;
        int tempVal;
        int endIdx;
        for (int index = 0; index < middle; index++ ) {
            tempVal = array[index];
            endIdx = array.length - index - 1;
            array[index] = array[endIdx];
            array[endIdx] = tempVal;
        }
        return array;
    }
}