package ru.job4j.shape;

public class Triangle implements Shape {
    public String draw(){
        return  new StringBuilder(
                System.lineSeparator())
                .append("  ^  ")
                .append(" ^ ^ ")
                .append("^^^^^")
                .toString();
    }
}
