package edu.eci.ieti.restapi.data;

import edu.eci.ieti.restapi.dto.UserDto;

import java.util.Date;
import java.util.UUID;

public class User {
    private String id;
    private final String name;
    private final String email;
    private final String lastName;
    private final Date createdAt;

    public User(UserDto userDto) {
        this.id = UUID.randomUUID().toString();
        this.name = userDto.getName();
        this.email = userDto.getEmail();
        this.lastName = userDto.getLastName();
        this.createdAt = userDto.getCreatedAt();
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
