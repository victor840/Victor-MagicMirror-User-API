package MagicMirrorAPI.UserGoals.service;

import MagicMirrorAPI.UserGoals.model.Goal;
import MagicMirrorAPI.UserGoals.model.User;

import java.util.List;

public interface GoalService {

    Goal createGoal(Goal goal);
    Goal updateGoal(Goal goal);
    List<Goal> getAllGoals();
    Goal getGoalBy(long goalId);
    void deleteGoal(long goalId);

}
