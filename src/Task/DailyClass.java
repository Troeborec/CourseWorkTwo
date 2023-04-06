package Task;

import java.time.LocalDateTime;

public class DailyClass extends Task{
    public DailyClass(String nameTittle, String description, TaskType taskType, LocalDateTime dateTime, int id) {
        super(nameTittle, description, taskType, dateTime, id);
    }

    @Override
    public boolean checkOccurance(LocalDateTime requestDate) {
        return true;
    }
}
