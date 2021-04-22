package pl.edu.utp.programowanie2.lab3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void  main (String[] args) {

        // #2
        Task task1 = new Task("name1", "desc1", Task.TaskCategory.NEW, LocalDateTime.of(2021, 4,9, 12,0,1));
        Task task2 = new Task("name2", "desc2", Task.TaskCategory.IN_PROGRESS, LocalDateTime.of(2021, 4,9, 13,0,0));
        Task task3 = new Task("name3", "desc3", Task.TaskCategory.DONE, LocalDateTime.of(2021, 4,9, 14,0,0));
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);

        // #3
        Task task4 = new Task("name4", "desc4", Task.TaskCategory.DONE, LocalDateTime.of(2021, 4,9, 15,0,0));
        System.out.println(task4);
        task4.setTaskDateTimeStop(task4.getTaskDateTimeStop().plusMonths(3));
        System.out.println(task4.toString());

        // #4
//        ArrayList<Task> tasks = new ArrayList<>();
//        tasks.add(task1);
//        tasks.add(task2);
//        tasks.add(task3);
//        tasks.add(task4);


        List<Task> tasks = Arrays.asList(task1, task2, task3, task4);
        System.out.println("Taski z fora");
        for (Task t:tasks) {
            System.out.println(t);
        }


    }

}
