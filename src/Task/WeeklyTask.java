package Task;

import Exceptions.RepeatabilityTypeException;

import java.time.LocalDateTime;

public class WeeklyTask extends Task{
    public WeeklyTask(String nameTittle, String description, TaskType taskType) {
        super(nameTittle, description, taskType);
    }

    @Override
    public boolean appaersIn(LocalDateTime dateTime) {
        return getDateTime().getDayOfWeek().equals(dateTime.getDayOfWeek());
    }

    @Override
    public void getNextDate(Task task) throws RepeatabilityTypeException {

    }
}
