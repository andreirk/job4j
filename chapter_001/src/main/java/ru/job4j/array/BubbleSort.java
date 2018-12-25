package ru.job4j.array;

/**
 * Сортировка пузырьком.
 */
public class BubbleSort {

    private void toSwap(int first, int second, int[] array){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public int[] sort(int[] array){
        int elems = array.length;
        for (int out = elems - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(array[in] > array[in + 1])
                    toSwap(in, in + 1, array);
            }
        }

        return array;
    }
}