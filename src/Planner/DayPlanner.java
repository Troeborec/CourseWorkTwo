package Planner;

import Tasks.Task;

import java.lang.reflect.Type;

public abstract class DayPlanner extends Task {
    public DayPlanner(int id, String nameTittle, String pole, Type type, String priznak) {
        super(id, nameTittle, pole, type, priznak);
    }

    public abstract void getTask();

    public abstract void deleteTask();
}
