package edu.eci.ieti.restapi.dto;

import java.util.Date;

public class UserDto {
    private final String name;
    private final String email;
    private final String lastName;
    private final Date createdAt;

    public UserDto(String name, String email, String lastName, Date createdAt) {
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.createdAt = createdAt;
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
