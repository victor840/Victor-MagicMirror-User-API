package MagicMirrorAPI.UserGoals.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    private List<String> goals;

    User(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getGoals() {
        return goals;
    }

    public String getGoalAtIndex(List<Integer> goals) {
        return goals.toString();
    }

    public void addToGoals(List<String> goals){
        this.goals = goals;
    }

    public String deleteGoalAtIndex(List<Integer> goals){
        return  goals.toString();
    }

    public void clearAllGoals(List<String> goals){
        this.goals = goals;
    }
}
