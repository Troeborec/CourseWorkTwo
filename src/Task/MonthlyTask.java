package Task;

import Exceptions.RepeatabilityTypeException;

import java.time.LocalDateTime;

public class MonthlyTask extends Task{
    public MonthlyTask(String nameTittle, String description, TaskType taskType) {
        super(nameTittle, description, taskType);
    }

    @Override
    public boolean appaersIn(LocalDateTime dateTime) {
        return getDateTime().getDayOfMonth() == (dateTime.getDayOfMonth());
    }

    @Override
    public void getNextDate(Task task) throws RepeatabilityTypeException {

    }


}
