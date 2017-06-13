package ru.imetrica.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Форма авторизации 
 * @author Rinat N Ziganshin <jamin@inbox.ru>
 */
public class LoginForm 
{
    @NotNull
    @Size(min=2, max=30)
    private String login;

    @NotNull
    @Size(min=2, max=30)
    private String password;

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
