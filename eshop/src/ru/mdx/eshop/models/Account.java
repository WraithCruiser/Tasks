package ru.mdx.eshop.models;

import java.util.ArrayList;

public class Account {

    private int accountBalance;
    private String login;
    private String password;
    private final Cart accountCart = new Cart(new ArrayList<>());

    public Account(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void addProductToCart(Product product, int amount){
        CartItem cartItem = new CartItem(amount, product);
        this.accountCart.getCartItems().add(cartItem);
    };

    public void addMoney(String card, int deposit){
        accountBalance += deposit;
    };

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cart getAccountCart(){
        return accountCart;
    }

    public int getAccountBalance(){
        return accountBalance;
    }
}
