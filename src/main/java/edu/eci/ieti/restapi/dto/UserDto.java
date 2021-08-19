package edu.eci.ieti.restapi.dto;

public class UserDto {
    private final String name;
    private final String email;
    private final String lastName;
    private final String created;

    public UserDto(String name, String email, String lastName, String created) {
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.created = created;
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
