package MagicMirrorAPI.UserGoals.controller;

import MagicMirrorAPI.UserGoals.model.User;
import MagicMirrorAPI.UserGoals.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public ResponseEntity <List<User>> getAllUsers(){
        return ResponseEntity.ok().body((userService.getAllUsers()));
    }

    @GetMapping("/user/{id}")
    public ResponseEntity <User> getUserById(@PathVariable long id){
        return ResponseEntity.ok().body(userService.getUserByID(id));
    }

    @PostMapping("/user")
    public ResponseEntity <User> createUser(@RequestBody User user){
        return ResponseEntity.ok().body(this.userService.createUser(user));
    }

    @PutMapping("/user/{id}")
    public ResponseEntity <User> updateUser(@PathVariable long id, @RequestBody User user){
        user.setId(id);
        return ResponseEntity.ok().body(this.userService.updateUser(user));
    }

    @DeleteMapping("/user/{id}")
    public HttpStatus deleteUser(@PathVariable long id){
        this.userService.deleteUser(id);
        return HttpStatus.OK;
    }
}
