package ru.imetrica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.imetrica.model.User;

/**
 * Репозиторий пользователей
 * @author Rinat N Ziganshin <jamin@inbox.ru>
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
}
