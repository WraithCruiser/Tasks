package ru.mdx.eshop.factories;

import ru.mdx.eshop.models.Product;

public class ProductFactory {
    private static int id = 0;

    public Product createProduct(String name, String description, int price){
        Product product = new Product(id, name, description, price);
        id++;

        return product;
    }
}
