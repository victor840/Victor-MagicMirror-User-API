package MagicMirrorAPI.UserGoals.repo;

import MagicMirrorAPI.UserGoals.model.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalRepository extends JpaRepository<Goal, Long> {
}
