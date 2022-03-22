package com.bits.jwtImpl.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String[] roles;
    private String[] authorities;
    private Boolean isNotLocked;
    private Boolean isActive;

    public User(Long id, String name, String email, String password, String[] roles, String[] authorities, Boolean isNotLocked, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.authorities = authorities;
        this.isNotLocked = isNotLocked;
        this.isActive = isActive;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public void setAuthorities(String[] authorities) {
        this.authorities = authorities;
    }

    public String[] getRoles() {
        return roles;
    }

    public String[] getAuthorities() {
        return authorities;
    }

    public void setNotLocked(Boolean notLocked) {
        isNotLocked = notLocked;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getNotLocked() {
        return isNotLocked;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + Arrays.toString(roles) +
                ", authorities=" + Arrays.toString(authorities) +
                ", isNotLocked=" + isNotLocked +
                ", isActive=" + isActive +
                '}';
    }

    public User() {
    }
}
