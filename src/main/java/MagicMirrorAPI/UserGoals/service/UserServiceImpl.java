package MagicMirrorAPI.UserGoals.service;

import MagicMirrorAPI.UserGoals.controller.UserNotFoundException;
import MagicMirrorAPI.UserGoals.model.User;
import MagicMirrorAPI.UserGoals.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl  implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        Optional <User> userDb = this.userRepository.findById(user.getId());

        if(userDb.isPresent()){
            User userUpdate = userDb.get();
            userUpdate.setId(user.getId());
            userUpdate.setName(user.getName());
            userUpdate.setAge(user.getAge());
            userUpdate.addToGoals(user.getGoals());
            userRepository.save(userUpdate);
            return userUpdate;
        } else{
            throw new UserNotFoundException("User not found with id : " +user.getId());
        }
    }

    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public User getUserByID(long userId) {
        Optional<User> userDb = this.userRepository.findById(userId);

        if(userDb.isPresent()){
            return userDb.get();
        } else{
            throw new UserNotFoundException("User not found with id : " +userId);
        }
    }

    @Override
    public void deleteUser(long userId) {
        Optional<User> userDb = this.userRepository.findById(userId);

        if(userDb.isPresent()){
            this.userRepository.delete(userDb.get());
        } else{
            throw new UserNotFoundException("Record not found with id : " +userId);
        }
    }
}
