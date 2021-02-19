package MagicMirrorAPI.UserGoals.controller.exception;



public class UserNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    public UserNotFoundException(String message){
        super(message);
    }
    public UserNotFoundException(String message, Throwable throwable){
        super(message, throwable);
    }
}
