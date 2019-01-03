package ru.job4j.tracker.start;

import ru.job4j.tracker.models.*;

import java.lang.reflect.Array;
import java.util.*;

import org.apache.commons.lang3.ArrayUtils;


/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    private final Random random = new Random();

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                result = items[i];
                break;
            }
        }
        return result;
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName().equals(key)) {
                result[i] = items[i];
            }
        }
        return result;
    }

    public Item[] findAll() {
        Item[] preResult = new Item[items.length];
        int counter = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                preResult[counter++] = items[i];
            }
        }
        Item[] result = Arrays.copyOf(preResult, counter);
        return result;
    }

    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].getId().equals(id)) {
                items[i] = item;
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        Item[] firstPart = null;
        int i = 0;
        for (; i < items.length; i++) {
            if (items[i].getId().equals(id)) {
                firstPart = Arrays.copyOf(items, i);
                break;
            }
        }
        Item[] secondPart = new Item[items.length - i];
        for (int j = i; j < items.length; j++) {
            secondPart[j] = items[j];
        }

        Item[] resultArr = ArrayUtils.addAll(firstPart, secondPart);
        result = true;

        return result;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        //Реализовать метод генерации.
        return System.currentTimeMillis() + String.valueOf(this.random.nextInt(100));
    }
}
