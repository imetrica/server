package ru.imetrica.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.imetrica.model.Point;
import ru.imetrica.model.Project;

/**
 * Репозиторий проектов
 * @author Rinat N Ziganshin <jamin@inbox.ru>
 */
@Repository
public interface PointRepository extends JpaRepository<Point, Long>
{
    List<Point> findByProject(Project Project); 
}
