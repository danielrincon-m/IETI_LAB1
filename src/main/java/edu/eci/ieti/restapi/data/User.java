package edu.eci.ieti.restapi.data;

import java.util.Date;

public class User {
    private final String id;
    private final String name;
    private final String email;
    private final String lastName;
    private final Date createdAt;

    public User(String id, String name, String email, String lastName, Date createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
