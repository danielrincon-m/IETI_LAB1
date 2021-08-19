package edu.eci.ieti.restapi.service;

import edu.eci.ieti.restapi.data.User;

import java.util.List;

public interface UserService {
    User create(User user);

    User findById(String id);

    List<User> all();

    void deleteById(String id);

    User update(User user, String userId);
}

