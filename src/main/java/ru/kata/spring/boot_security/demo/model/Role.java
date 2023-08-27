package ru.kata.spring.boot_security.demo.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue
    @Column(name = "role_id")
    private Long id;
    @Column(name = "name")
    private String role;

    static final String ROLE_PREFIX = "ROLE_";

    public Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public Role() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return role;
    }

    @Override
    public String getAuthority() {
        return  ROLE_PREFIX+role;
    }
    public String getAuthorityWithoutPrefix(){
        return role;
    }
}
