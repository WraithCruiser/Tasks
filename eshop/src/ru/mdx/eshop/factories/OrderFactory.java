package ru.mdx.eshop.factories;

import ru.mdx.eshop.models.Cart;
import ru.mdx.eshop.models.Order;
import ru.mdx.eshop.enums.PaymentType;
import ru.mdx.eshop.models.Account;
import java.time.LocalDate;

public class OrderFactory {
    private static int id;

    public Order createOrder(int id, Account user, Cart cart, String Address, long phone, PaymentType paymentType, LocalDate deliveryDate){
        Order order = new Order(id, user, cart, Address, phone, paymentType, deliveryDate);
        id++;

        return order;
    }
}
