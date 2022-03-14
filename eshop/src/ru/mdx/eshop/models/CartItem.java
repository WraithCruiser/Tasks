package ru.mdx.eshop.models;

import ru.mdx.eshop.models.Product;

public class CartItem {
    private int amount;
    private Product product;

    public CartItem(int amount, Product product){
        this.amount = amount;
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public String getName(){
        return product.getName();
    }

    public Product getProduct() {
        return product;
    }
}
