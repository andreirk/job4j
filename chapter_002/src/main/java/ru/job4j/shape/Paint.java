package ru.job4j.shape;

public class Paint {
    public static void draw(Shape shape){
        System.out.print(shape.draw());
    }

    public static void main(String[] args) {
        new Paint().draw(new Triangle());
        new Paint().draw(new Square());

    }

}
