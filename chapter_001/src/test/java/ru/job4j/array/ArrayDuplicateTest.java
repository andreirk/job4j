package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        //  {"Привет", "Мир", "Привет", "Супер", "Мир"} должно получиться {"Привет", "Мир", "Супер"}
        ArrayDuplicate remover = new ArrayDuplicate();
        String[] input = new String[] {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = remover.remove(input);
        String[] expect = new String[] {"Привет", "Мир", "Супер"};
        assertThat(result, is(expect));

    }
}