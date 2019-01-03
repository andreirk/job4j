package ru.job4j.tracker.models;

public class Item {
    public String name;
    public String description;
    public long create;
    private String[] comments = new String[10];
    private String id;

    public Item(String name, String desc, long create) {
        this.name = name;
        this.description = desc;
        this.create = create;
    }

    public String getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toSrting() {
        return "name: " + this.getName() + "\ndescription: " + this.getDescription() + "\nid: " + this.getId();
    }
}