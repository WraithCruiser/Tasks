package ru.mdx.eshop.models;

import java.util.ArrayList;

public class Cart {
    private ArrayList<CartItem> cartItems;
    private Product product;

    public Cart(ArrayList<CartItem> cartItems){
        this.cartItems = cartItems;
    }

    public ArrayList<CartItem> getCartItems() {
        return cartItems;
    }

    public void getCartItemsInfo(){
        for (int i = 0; i < cartItems.size(); i++){
            System.out.println(getCartItems().get(i).getName() + ", " + getCartItems().get(i).getAmount());
        }
    }

    public Product getProduct() {
        return product;
    }

    public void setCartList(ArrayList<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}
