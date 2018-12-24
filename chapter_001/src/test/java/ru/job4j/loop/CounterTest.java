package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumFrom1To10Then30() {
        Counter counter = new Counter();
        int result = counter.add(1,10);
        assertThat(result, is(20));
    }

}