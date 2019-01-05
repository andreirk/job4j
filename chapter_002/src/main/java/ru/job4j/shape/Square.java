package ru.job4j.shape;

public class Square implements Shape {
    public String draw(){
        return new StringBuilder()
                .append("++++")
                .append("+     +")
                .append("+     +")
                .append("++++")
                .append(System.lineSeparator())
                .toString();
    }
}
