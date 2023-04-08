package Task;

import Exceptions.RepeatabilityTypeException;
import Exceptions.TaskNotFoundException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TaskService {
    private Map<Integer, Task> taskMap;

    public TaskService(Map<Integer, Task> taskMap) {
        this.taskMap = taskMap;
    }

    public Map<Integer, Task> getTaskMap() {
        return taskMap;
    }

    public void setTaskMap(Map<Integer, Task> taskMap) {
        this.taskMap = taskMap;
    }

    //Добавить задачу в ежедневник
    public void addTask(Task task) {
        taskMap.put(task.getId(), task);
    }

    //Удалить задачу
    public void removeTask(int id) throws TaskNotFoundException {
        if (!taskMap.containsKey(id)) {
            throw new TaskNotFoundException("Задача с id " + id + " не существует");
        }
        System.out.println("Задача: " + taskMap.get(id).getDescription() + "/ -> удалена");
        taskMap.remove(id);
    }

    public void printNextData(Task task) {
        try {
            task.getNextDate(task);
        } catch (RepeatabilityTypeException e) {
            System.out.println(e.getMessage());
        }
    }

    //распечатать все задачи в ежедневнике
    public void printTasks() {
        System.out.println("В ежедневнике следующие задачи:");
        for (Map.Entry<Integer, Task> volume : taskMap.entrySet()) {
            System.out.println(volume.getValue().getDateTime().format(DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm"))
                    + " " + volume.getValue().getDescription());
        }
        System.out.println("Всего задач - " + taskMap.size());

    }

    //Проверить какие есть задачи на дату

    public void getAllTaskByDate(LocalDateTime date) {
        Set<Task> taskSet = new HashSet<Task>();
        for (Map.Entry<Integer, Task> entry : taskMap.entrySet()) {
            if (entry.getValue().appaersIn(date)) {
                taskSet.add(entry.getValue());
            }
        }
    }
}

