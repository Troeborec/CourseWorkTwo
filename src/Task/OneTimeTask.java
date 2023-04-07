package Task;

import Exceptions.RepeatabilityTypeException;

import java.time.LocalDateTime;

public class OneTimeTask extends Task{
    public OneTimeTask(String nameTittle, String description,TaskType taskType) {
        super(nameTittle, description, taskType);
    }

    @Override
    public boolean checkOccurance(LocalDateTime requestDate) {
        return getDateTime().toLocalDate().equals(requestDate.toLocalDate());
    }

    @Override
    public void getNextDate(Task task) throws RepeatabilityTypeException {

    }
}
