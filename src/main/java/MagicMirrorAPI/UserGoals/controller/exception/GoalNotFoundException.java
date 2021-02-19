package MagicMirrorAPI.UserGoals.controller.exception;

public class GoalNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    public GoalNotFoundException(String message){
        super(message);
    }
    public GoalNotFoundException(String message, Throwable throwable){
        super(message, throwable);
    }
}
