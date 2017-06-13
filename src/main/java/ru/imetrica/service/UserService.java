package ru.imetrica.service;

import ru.imetrica.model.User;

/**
 * Сервиc пользователей
 * @author Rinat N Ziganshin <jamin@inbox.ru>
 */
public interface UserService 
{
    public User add(User User);
    public User update(User User);
}
