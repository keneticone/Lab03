package pl.edu.utp.programowanie2.lab4;

import pl.edu.utp.programowanie2.lab4.Task;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void  main (String[] args) {

        // #2
        Task task1 = new Task("name1", "desc1", Task.TaskCategory.NEW, LocalDateTime.of(2021, 4,9, 12,0,1));
        Task task2 = new Task("name2", "desc2", Task.TaskCategory.IN_PROGRESS, LocalDateTime.of(2021, 4,9, 13,0,0));
        Task task3 = new Task("name3", "desc3", Task.TaskCategory.DONE, LocalDateTime.of(2021, 4,9, 14,0,0));
        Task subtask1 = new SubTask("name1", "desc1", Task.TaskCategory.NEW, LocalDateTime.of(2021, 4,9, 12,0,1), "subtask1");
        Task subtask2 = new SubTask("name2", "desc2", Task.TaskCategory.IN_PROGRESS, LocalDateTime.of(2021, 4,9, 13,0,0), "subtask2");
        Task subtask3 = new SubTask("name3", "desc3", Task.TaskCategory.DONE, LocalDateTime.of(2021, 4,9, 14,0,0), "subtask3");
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);
        System.out.println(subtask1);
        System.out.println(subtask2);
        System.out.println(subtask3);

        // #3
        Object otask1 = new Task("name1", "desc1", Task.TaskCategory.NEW, LocalDateTime.of(2021, 4,9, 12,0,1));
        Object otask2 = new Task("name2", "desc2", Task.TaskCategory.IN_PROGRESS, LocalDateTime.of(2021, 4,9, 13,0,0));
        Object otask3 = new Task("name3", "desc3", Task.TaskCategory.DONE, LocalDateTime.of(2021, 4,9, 14,0,0));
        Object osubtask1 = new SubTask("name1", "desc1", Task.TaskCategory.NEW, LocalDateTime.of(2021, 4,9, 12,0,1), "subtask1");
        Object osubtask2 = new SubTask("name2", "desc2", Task.TaskCategory.IN_PROGRESS, LocalDateTime.of(2021, 4,9, 13,0,0), "subtask2");
        Object osubtask3 = new SubTask("name3", "desc3", Task.TaskCategory.DONE, LocalDateTime.of(2021, 4,9, 14,0,0), "subtask3");

        // #4
        getDetailInfo("foo");
        getDetailInfo(task1);
        getDetailInfo(subtask1);
    }

        // #4
    public static void getDetailInfo(Object o) {
        String taskName, subtaskName, taskDescription, taskCategory, taskDateTimeStart, taskDateTimeStop;
        taskName = subtaskName = taskDescription = taskCategory = taskDateTimeStart = taskDateTimeStop = "B/D";

        // sprawdzenie typu obiktu
        if (o instanceof Task) {
            Task task = (Task) o;
            taskName = task.getTaskName();
            taskDateTimeStart = task.getTaskDateTimeStart().toString();
            taskDateTimeStop = task.getTaskDateTimeStop().toString();
            taskDescription = task.getTaskDescription();
            taskCategory = task.getTaskCategory().toString();

        }
        if (o instanceof SubTask) {
            subtaskName = ((SubTask)o).getSubtaskName();
        }
        System.out.println("| taskName     | " + taskName  +"|" );
        System.out.println("| taskDescription    | " + taskDescription +"  |" );
        System.out.println("| taskCategory    | " + taskCategory + "  |  ");
        System.out.println("| taskDataTimeStart    | " + taskDateTimeStart + "  |  ");
        System.out.println("| taskDataTimeStop    | " + taskDateTimeStop + "  |  ");
        System.out.println("| subtaskName     | " + subtaskName  +"|" );
    }


}
