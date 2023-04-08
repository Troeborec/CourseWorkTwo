package Task;

import Exceptions.RepeatabilityTypeException;

import java.time.LocalDateTime;

public class DailyTask extends Task{
    public DailyTask(String nameTittle, String description, TaskType taskType) {
        super(nameTittle, description, taskType);
    }

    @Override
    public boolean appaersIn(LocalDateTime dateTime) {
        return true;
    }

    @Override
    public void getNextDate(Task task) throws RepeatabilityTypeException {

    }
}
