package ru.imetrica.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Модель пользователя
 * @author Rinat N Ziganshin <jamin@inbox.ru>
 */
@Entity
@Table(name = "user")
public class User 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private long id;
    
    @Column(name = "login")
    private String login;
    
    @JsonIgnore
    @Column(name = "password")
    private String password;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "added_date", insertable = false, updatable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date added_date;
    
    @OneToMany(mappedBy = "user")
    private Set<Project> projects = new HashSet<>();
            
    public Set<Project> getProjects() {
        return projects;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getEmail() {
        return email;
    }
    
}
