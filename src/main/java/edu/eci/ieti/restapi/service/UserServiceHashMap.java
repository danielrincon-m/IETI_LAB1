package edu.eci.ieti.restapi.service;

import edu.eci.ieti.restapi.data.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceHashMap implements UserService {
    private final HashMap<String, User> users = new HashMap<>();

    @Override
    public User create(User user) {
        users.put(user.getId(), user);
        return user;
    }

    @Override
    public User findById(String id) {
        return users.get(id);
    }

    @Override
    public List<User> all() {
        return new ArrayList<>(users.values());
    }

    @Override
    public boolean deleteById(String id) {
        users.remove(id);
        return true;
    }

    @Override
    public User update(User user, String userId) {
        users.put(userId, user);
        return null;
    }
}
