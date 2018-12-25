package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
        BubbleSort sorter = new BubbleSort();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = sorter.sort(input);
        int[] expect = new int[] {1,2,4,6};
        assertThat(result, is(expect));
    }
}