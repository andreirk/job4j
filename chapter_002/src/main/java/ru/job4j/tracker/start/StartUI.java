package ru.job4j.tracker.start;

import ru.job4j.tracker.models.*;

public class StartUI {

    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";

    /**
     * Константа меню для показа всех.
     */
    private static final String SHOW_ALL = "1";

    /**
     * Константа меню для редактирования.
     */
    private static final String EDIT = "2";

    /**
     * Константа меню для удаления.
     */
    private static final String DELETE = "3";

    /**
     * Константа меню для поиска по ид.
     */
    private static final String FIND_BY_ID = "4";
    /**
     * Константа меню для поиска по имени.
     */
    private static final String FIND_BY_NAME = "5";

    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";
    /**
     * Получение данных от пользователя.
     */
    private final Input input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }


    private final String[] menuArr = new String[] {
            "0. Add new Item",
            "1. Show all items",
            "2. Edit item",
            "3. Delete item",
            "4. Find item by Id",
            "5. Find items by name",
            "6. Exit Program"
    };

    /**
     * Основой цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                //добавление заявки вынесено в отдельный метод.
                this.createItem();
            } else if (SHOW_ALL.equals(answer)) {
                this.showAllItems();
//             Добавить остальные действия системы по меню.
            } else if (EDIT.equals(answer)) {
                this.edit();
            } else if (DELETE.equals(answer)) {
                this.delete();
            } else if (FIND_BY_ID.equals(answer)) {
                this.findById();
            } else if (FIND_BY_NAME.equals(answer)) {
                this.findByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        long curTime = System.currentTimeMillis();
        Item item = new Item(name, desc, curTime);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void showAllItems() {
        Item[] allItems = this.tracker.findAll();
        for (Item item : allItems) {
            System.out.println(item.toSrting());
        }
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void edit() {
        System.out.println("Not impemented yet");
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void delete() {
        System.out.println("------------ Удаление заявки --------------");
        System.out.println("Not impemented yet");
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private Item findById() {
        System.out.println("------------ Добавление новой заявки --------------");
        String id = this.input.ask("Введите идентификатор");
        Item foundItem = this.tracker.findById(id);
        System.out.println(foundItem.toSrting());
        return foundItem;
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private Item[] findByName() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите name");
        return this.tracker.findByName(name);
    }

    private void showMenu() {
        System.out.println("Меню.");
        for (String menuItem : menuArr) {
            System.out.println(menuItem);
        }
        // добавить остальные пункты меню.
    }

    /**
     * Запускт программы.
     *
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }

}
