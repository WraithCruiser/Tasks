package ru.mdx.eshop.factories;

import ru.mdx.eshop.models.Account;
import ru.mdx.eshop.models.UserAccount;

public class UserAccountFactory implements AccountFactory{
    @Override
    public Account register(String login, String password, String confirm_password){
        if(confirm_password.equals(password)){
            return new UserAccount(login, password);
        }
        else {
            throw new RuntimeException("Пароли не совпадают!");
        }
    }
}
