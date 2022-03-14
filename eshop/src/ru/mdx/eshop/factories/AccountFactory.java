package ru.mdx.eshop.factories;

import ru.mdx.eshop.models.Account;

public interface AccountFactory {
    Account register(String login, String password, String confirm_password);
}
