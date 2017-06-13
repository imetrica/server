package ru.imetrica.model;

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
 * Модель проекта
 * @author Rinat N Ziganshin <jamin@inbox.ru>
 */
@Entity
@Table(name = "project")
public class Project 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private long id;
    
    @Column(name = "title")
    private String title;
    
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; 
    
    @Column(name = "added_date", insertable = false, updatable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date added_date;
    
    public void setId(long id) {
        this.id = id;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
