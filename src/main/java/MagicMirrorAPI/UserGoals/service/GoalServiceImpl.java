package MagicMirrorAPI.UserGoals.service;

import MagicMirrorAPI.UserGoals.controller.exception.GoalNotFoundException;
import MagicMirrorAPI.UserGoals.model.Goal;
import MagicMirrorAPI.UserGoals.model.User;
import MagicMirrorAPI.UserGoals.repo.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class GoalServiceImpl implements GoalService {

    @Autowired
    private GoalRepository goalRepository;

    @Override
    public Goal createGoal(Goal goal) {
        return goalRepository.save(goal);
    }

    @Override
    public Goal updateGoal(Goal goal) {
        Optional <Goal> goalDb = this.goalRepository.findById(goal.getId());

        if(goalDb.isPresent()){
            Goal goalUpdate = goalDb.get();
            goalUpdate.setId(goal.getId());
            goalUpdate.setMilestone(goal.getMilestone());
            goalUpdate.setUser(goal.getUser());
            goalRepository.save(goalUpdate);
            return goalUpdate;
        }else{
            throw new GoalNotFoundException("Goal not found with id : " +goal.getId());
        }
    }

    @Override
    public List<Goal> getAllGoals() {
        return this.goalRepository.findAll();
    }

    @Override
    public Goal getGoalById(long goalId) {
        Optional<Goal> goalDb = this.goalRepository.findById(goalId);

        if(goalDb.isPresent()){
            return goalDb.get();
        }else{
            throw new GoalNotFoundException("Goal not found with id : " +goalId);
        }
    }

    @Override
    public void deleteGoal(long goalId) {

        Optional<Goal> goalDb = this.goalRepository.findById(goalId);

        if(goalDb.isPresent()){
            this.goalRepository.delete(goalDb.get());
        }else {
            throw new GoalNotFoundException("Goal not found with id : " +goalId);
        }
    }

}
