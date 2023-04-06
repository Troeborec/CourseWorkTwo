package Task;

import java.time.LocalDateTime;

public class WeeklyTask extends Task{
    public WeeklyTask(String nameTittle, String description, TaskType taskType, LocalDateTime dateTime, int id) {
        super(nameTittle, description, taskType, dateTime, id);
    }

    @Override
    public boolean checkOccurance(LocalDateTime requestDate) {
        return getDateTime().getDayOfWeek().equals(requestDate.getDayOfWeek());
    }
}
