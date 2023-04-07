package Task;

import Exceptions.RepeatabilityTypeException;

import java.time.LocalDateTime;

public class WeeklyTask extends Task{
    public WeeklyTask(String nameTittle, String description, TaskType taskType) {
        super(nameTittle, description, taskType);
    }

    @Override
    public boolean checkOccurance(LocalDateTime requestDate) {
        return getDateTime().getDayOfWeek().equals(requestDate.getDayOfWeek());
    }

    @Override
    public void getNextDate(Task task) throws RepeatabilityTypeException {

    }
}
