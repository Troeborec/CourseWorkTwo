import Exceptions.TaskNotFoundException;
import Task.*;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        OneTimeTask taskOne = new OneTimeTask("Работа", "Распечатать отчеты за квартал", TaskType.WORK);
        DailyTask taskTwo = new DailyTask("Животные", "Покорми кота", TaskType.PRIVATE);
        EarlyTask taskThree = new EarlyTask("Новый Год", " Нарядить елку", TaskType.PRIVATE);
        MonthlyTask taskFour = new MonthlyTask("Работа", "Отправить стастистику программы", TaskType.WORK);
        OneTimeTask taskFive = new OneTimeTask("Просто", "Поехать выбрать обои", TaskType.PRIVATE);
        WeeklyTask taskSix = new WeeklyTask("Дом", "Убраться дома", TaskType.PRIVATE);
        MonthlyTask taskSeven = new MonthlyTask("Работа", "Отправить вторую стастистику программы", TaskType.WORK);


        TaskService taskService = new TaskService(new HashMap<>());

        //Добавляем задачи
        taskService.addTask(taskOne);
        taskService.addTask(taskFour);
        taskService.addTask(taskSeven);

        //Получаем список задач
        taskService.printNextData(taskThree);

        //удаляем задачу по id
        try {
            taskService.removeTask(1);
        } catch (TaskNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            taskService.removeTask(3);
        } catch (TaskNotFoundException e) {
            System.out.println(e.getMessage());

        }

        System.out.println("/////////////////////");
        System.out.println("/////////////////////");
        System.out.println("/////////////////////");

        taskService.printTasks();
    }
}