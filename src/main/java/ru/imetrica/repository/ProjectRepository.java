package ru.imetrica.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.imetrica.model.Project;
import ru.imetrica.model.User;

/**
 * Репозиторий проектов
 * @author Rinat N Ziganshin <jamin@inbox.ru>
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>
{
    List<Project> findByUser(User User); 
}
