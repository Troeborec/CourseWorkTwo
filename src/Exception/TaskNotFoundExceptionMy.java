package Exception;

public class TaskNotFoundExceptionMy extends Exception {
    private String s;

    public TaskNotFoundExceptionMy(String message) {
        super(message);
    }
}
