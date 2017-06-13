package ru.imetrica.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.imetrica.model.User;
import ru.imetrica.repository.UserRepository;
import ru.imetrica.service.UserService;

/**
 * Сервич пользователей
 * @author Rinat N Ziganshin <jamin@inbox.ru>
 */
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public User add(User User) {
        return userRepository.saveAndFlush(User);
    }
    
    @Override
    public User update(User User) {
        return userRepository.saveAndFlush(User);
    }    
}
