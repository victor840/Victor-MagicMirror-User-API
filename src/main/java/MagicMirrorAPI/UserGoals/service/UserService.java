package MagicMirrorAPI.UserGoals.service;

import MagicMirrorAPI.UserGoals.model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);
    User updateUser(User user);
    List <User> getAllUsers();
    User getUserByID(long userId);
    void deleteUser(long id);

}
