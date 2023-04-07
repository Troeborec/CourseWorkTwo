package Task;

import Exceptions.RepeatabilityTypeException;

import java.time.LocalDateTime;

public class EarlyTask extends Task{
    public EarlyTask(String nameTittle, String description, TaskType taskType) {
        super(nameTittle, description, taskType);
    }

    @Override
    public boolean checkOccurance(LocalDateTime requestDate) {
        return getDateTime().getDayOfMonth() == requestDate.getDayOfMonth() && getDateTime().getMonth() == requestDate.getMonth();
    }

    @Override
    public void getNextDate(Task task) throws RepeatabilityTypeException {

    }
}
