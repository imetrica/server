package ru.imetrica.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Модель точки
 * @author Rinat N Ziganshin <jamin@inbox.ru>
 */
@Entity
@Table(name = "point")
public class Point 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private long id;
    
    @JsonIgnore
    @ManyToOne
    private Project project; 
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "added_date", insertable = false, updatable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date added_date;
    
    public void setId(long id) {
        this.id = id;
    }
    
    public void setProject(Project project) {
        this.project = project;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public long getId() {
        return id;
    }

    public Project getProject() {
        return project;
    }
    
    public String getTitle() {
        return title;
    }
}
