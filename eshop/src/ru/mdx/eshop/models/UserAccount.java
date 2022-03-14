package ru.mdx.eshop.models;

import ru.mdx.eshop.models.Account;

public class UserAccount extends Account {

    private String login;
    private String password;

    public UserAccount(String login, String password) {
        super(login, password);
    }
}
