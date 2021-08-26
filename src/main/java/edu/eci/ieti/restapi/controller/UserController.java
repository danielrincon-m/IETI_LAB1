package edu.eci.ieti.restapi.controller;

import edu.eci.ieti.restapi.data.User;
import edu.eci.ieti.restapi.dto.UserDto;
import edu.eci.ieti.restapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
public class UserController {
    private final UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> all() {
        List<User> users = userService.all();
        return new ResponseEntity<>(users, HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable String id) {
        User user = userService.findById(id);
        return new ResponseEntity<>(user, HttpStatus.FOUND);
    }


    @PostMapping
    public ResponseEntity<User> create(@RequestBody UserDto userDto) {
        User user = userService.create(new User(userDto));
        return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@RequestBody UserDto userDto, @PathVariable String id) {
        User user = userService.update(new User(userDto), id);
        return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable String id) {
        boolean result = userService.deleteById(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
