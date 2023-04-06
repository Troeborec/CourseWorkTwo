package Planner;

import Task.Task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyCalendar {

    private static final Map<Integer, Task> actualTasks = new HashMap<>();
    private static final Map<Integer, Task> neActualTasks = new HashMap<>();

    public static void addTask(Scanner scanner) {
        try {
            scanner.nextLine();
            System.out.println("Введите название задачи");
            //Я так понимаю нужна волидация
        }
    }
}
