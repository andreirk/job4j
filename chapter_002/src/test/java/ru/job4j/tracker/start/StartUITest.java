package ru.job4j.tracker.start;

public class StartUITest {

    public static void main(String[] args) {
        Input input = new StubInput(new String[] {"first task blah", "go shoping", "do something"});
        Tracker tracker = new Tracker();
        new StartUI(
                input, tracker
        ).init();
    }
}
