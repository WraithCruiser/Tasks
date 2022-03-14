package ru.mdx.eshop.models;

public class Product {

    private int id;
    private String name;
    private String description;
    private int price;

    public Product(int id, String name, String description, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
