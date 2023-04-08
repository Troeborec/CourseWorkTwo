package Task;

import Exceptions.RepeatabilityTypeException;

import java.time.LocalDateTime;

public class OneTimeTask extends Task{
    public OneTimeTask(String nameTittle, String description,TaskType taskType) {
        super(nameTittle, description, taskType);
    }

    @Override
    public boolean appaersIn(LocalDateTime dateTime) {
        return getDateTime().toLocalDate().equals(dateTime.toLocalDate());
    }

    @Override
    public void getNextDate(Task task) throws RepeatabilityTypeException {

    }
}
