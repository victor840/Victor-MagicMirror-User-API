package MagicMirrorAPI.UserGoals.repo;

import MagicMirrorAPI.UserGoals.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
