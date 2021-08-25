package edu.eci.ieti.restapi.data;

import java.util.Date;
import java.util.UUID;

public class User {
    private String id;
    private final String name;
    private final String email;
    private final String lastName;
    private final Date createdAt;

    public User(String id, String name, String email, String lastName, Date createdAt) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
