package Task;

import Exceptions.RepeatabilityTypeException;

import java.time.LocalDateTime;

public class EarlyTask extends Task{
    public EarlyTask(String nameTittle, String description, TaskType taskType) {
        super(nameTittle, description, taskType);
    }

    @Override
    public boolean appaersIn(LocalDateTime dateTime) {
        return getDateTime().getDayOfMonth() == dateTime.getDayOfMonth() && getDateTime().getMonth() == dateTime.getMonth();
    }

    @Override
    public void getNextDate(Task task) throws RepeatabilityTypeException {

    }

}
