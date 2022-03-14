package ru.mdx.eshop;

import ru.mdx.eshop.enums.PaymentType;
import ru.mdx.eshop.factories.*;
import ru.mdx.eshop.models.Account;
import ru.mdx.eshop.models.Order;
import ru.mdx.eshop.models.Product;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AccountFactory UserAccountFactory = new UserAccountFactory();
        AccountFactory AdminAccountFactory = new AdminAccountFactory();

        OrderFactory mainOrderFactory = new OrderFactory();
        ProductFactory mainProductFactory = new ProductFactory();

        Account note_admin = AdminAccountFactory.register("IthubAdmin", "00001", "00001");
        Account user1 = UserAccountFactory.register("User2", "123123", "123123");

        Product product1 = mainProductFactory.createProduct("Orange", "Orange Orange", 36);
        Product product2 = mainProductFactory.createProduct("Lime", "Green Orange", 42);

        Order order1 = mainOrderFactory.createOrder(9, user1, user1.getAccountCart(), "Moscow", 79151234567L, PaymentType.CARD, LocalDate.now());

        user1.addProductToCart(product1, 10);
        user1.addProductToCart(product2, 10);
        user1.addProductToCart(product2, 10);
        System.out.println(user1);
        System.out.println(user1.getAccountCart());
        user1.getAccountCart().getCartItemsInfo();

    }
}
