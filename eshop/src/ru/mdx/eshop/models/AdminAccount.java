package ru.mdx.eshop.models;

import ru.mdx.eshop.models.Account;

public class AdminAccount extends Account {

    private String login;
    private String password;

    public AdminAccount(String login, String password) {
        super(login, password);
    }
}
