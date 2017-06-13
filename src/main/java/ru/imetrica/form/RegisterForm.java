package ru.imetrica.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;

/**
 * Форма авторизации 
 * @author Rinat N Ziganshin <jamin@inbox.ru>
 */
public class RegisterForm 
{
    @NotNull
    @Size(min=3, max=30)
    @Email
    private String email;

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
