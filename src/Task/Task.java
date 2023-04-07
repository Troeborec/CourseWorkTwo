package Task;

import Exceptions.RepeatabilityTypeException;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Task {

    private  String nameTittle;
    private  String description;
    private final TaskType taskType;
    private  LocalDateTime dateTime = LocalDateTime.now();
    private static int idGeneration = 1;
    private final int id;

    public Task(String nameTittle, String description, TaskType taskType) {
        this.nameTittle = nameTittle;
        this.description = description;
        this.taskType = taskType;
        this.id = idGeneration;
        idGeneration++;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNameTittle(String nameTittle) {
        this.nameTittle = nameTittle;
    }

    @Override
    public String toString() {
        return "Задача" +
                "nameTittle='" + nameTittle + '\'' +
                ", description='" + description + '\'' +
                ", taskType=" + taskType +
                ", dateTime=" + dateTime +
                ", id=" + id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameTittle, description, taskType, dateTime, id );
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public abstract boolean checkOccurance(LocalDateTime localDateTime);

    public abstract void getNextDate(Task task) throws RepeatabilityTypeException;



}
