package Task;
public enum TaskType {
    WORK("Рабочая заметка"),
    PRIVATE("Личная заметка");

    private final String taskType;


    TaskType(String taskType) {
        this.taskType = taskType;
    }

    public String printType() {
        return taskType;
    }
}
