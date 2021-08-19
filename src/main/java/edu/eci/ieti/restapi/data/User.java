package edu.eci.ieti.restapi.data;

import java.util.UUID;

public class User {
    private final String id;
    private final String name;
    private final String email;
    private final String lastName;
    private final String created;

    public User(String name, String email, String lastName, String created) {
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.created = created;
        this.id = UUID.randomUUID().toString();
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

    public String getCreated() {
        return created;
    }
}
