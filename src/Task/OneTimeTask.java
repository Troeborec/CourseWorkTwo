package Task;

import java.time.LocalDateTime;

public class OneTimeTask extends Task{
    public OneTimeTask(String nameTittle, String description,TaskType taskType, LocalDateTime dateTime, int id) {
        super(nameTittle, description, taskType, dateTime, id);
    }

    @Override
    public boolean checkOccurance(LocalDateTime requestDate) {
        return getDateTime().toLocalDate().equals(requestDate.toLocalDate());
    }
}
