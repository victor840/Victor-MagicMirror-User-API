package MagicMirrorAPI.UserGoals.controller;

import MagicMirrorAPI.UserGoals.model.Goal;
import MagicMirrorAPI.UserGoals.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoalController {

    @Autowired
    private GoalService goalService;

    @GetMapping("/goal")
    public ResponseEntity<List<Goal>> getAllGoals(){
        return ResponseEntity.ok().body(goalService.getAllGoals());
    }

    @GetMapping("/goal/{id}")
    public ResponseEntity<Goal> getGoalById(@PathVariable long id){
        return ResponseEntity.ok().body(goalService.getGoalBy(id));
    }

    @PostMapping("/goal")
    public ResponseEntity <Goal> createGoal(@RequestBody Goal goal){
        return ResponseEntity.ok().body(this.goalService.createGoal(goal));
    }

    @PutMapping("/goal/{id}")
    public ResponseEntity <Goal> updateGoal(@PathVariable long id, @RequestBody Goal goal){
        goal.setId(id);
        return ResponseEntity.ok().body(this.goalService.updateGoal(goal));
    }

    @DeleteMapping("/goal/{id}")
    public HttpStatus deleteUser(@PathVariable long id){
        this.goalService.deleteGoal(id);
        return HttpStatus.OK;
    }
}
