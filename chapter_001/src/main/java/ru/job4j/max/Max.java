package ru.job4j.max;

/**
 * Корвертор валюты.
 */
public class Max {
    /**
     *
     * @param first
     * @param second
     * @return int max value from two.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }

    public int max(int first, int second, int third) {
        int maxOfFirstTwo = this.max(first, second);
        int finalMax = max(maxOfFirstTwo, third);
        return finalMax;
    }

}
