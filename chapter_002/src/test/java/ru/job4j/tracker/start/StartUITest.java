package ru.job4j.tracker.start;

import ru.job4j.tracker.models.*;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenCreateOneRecordFirstRecordNameMatched() {
        Input input = new StubInput(new String[] { "0", "shoping", "do something", "6"});
        Tracker tracker = new Tracker();
        new StartUI(
                input, tracker
        ).init();
        Item[] item = tracker.findByName("shoping");
        assertThat(item[0].getName(), is("shoping"));
    }

    @Test
    public void whenCreateTwoRecordsSecondRecordNameMatched() {
        Input input = new StubInput(new String[] { "0", "shoping", "do something", "0", "blah", "do something else",  "6"});
        Tracker tracker = new Tracker();
        new StartUI(
                input, tracker
        ).init();
        Item[] item = tracker.findByName("blah");
        assertThat(item[1].getName(), is("blah"));
    }

    @Test
    public void whenCreateTwoRecordsAndDeleteOneLengthIsOne() {
        Input input = new StubInput(new String[] { "0", "shoping", "do something", "0", "blah", "do something else",  "6"});
        Tracker tracker = new Tracker();
        new StartUI(
                input, tracker
        ).init();
        Item[] item = tracker.findByName("blah");
        String id = item[1].getId();
        tracker.delete(id);
        assertThat(tracker.findAll().length, is(1));
    }
}
