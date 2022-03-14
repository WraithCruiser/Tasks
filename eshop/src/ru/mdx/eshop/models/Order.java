package ru.mdx.eshop.models;

import ru.mdx.eshop.enums.PaymentType;

import java.time.LocalDate;

public class Order {
    private int id;
    private Account user;
    private String address;
    private long phone;
    private Cart cart;
    private PaymentType paymentType;
    private LocalDate deliveryDate;

    public Order(int id, Account user, Cart cart, String address, long phone, PaymentType paymentType, LocalDate deliveryDate) {
        this.id = id;
        this.user = user;
        this.cart = cart;
        this.address = address;
        this.phone = phone;
        this.paymentType = paymentType;
        this.deliveryDate = deliveryDate;
    }

    public Cart getCart() {
        return cart;
    }
}
