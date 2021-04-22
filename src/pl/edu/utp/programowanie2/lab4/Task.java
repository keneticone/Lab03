package pl.edu.utp.programowanie2.lab4;

import java.time.LocalDateTime;

public class Task {

    enum TaskCategory {
        NEW,
        IN_PROGRESS,
        DONE
    }

    private String taskName;
    private String taskDescription;
    private TaskCategory taskCategory;
    private LocalDateTime taskDateTimeStart;
    private LocalDateTime taskDateTimeStop;

    public Task(){
    }

    public Task(String taskName, String taskDescription, TaskCategory taskCategory, LocalDateTime taskDateTimeStop) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskCategory = taskCategory;
        this.taskDateTimeStart = LocalDateTime.now();
        this.taskDateTimeStop = taskDateTimeStop;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public TaskCategory getTaskCategory() {
        return taskCategory;
    }

    public void setTaskCategory(TaskCategory taskCategory) {
        this.taskCategory = taskCategory;
    }

    public LocalDateTime getTaskDateTimeStart() {
        return taskDateTimeStart;
    }

    public void setTaskDateTimeStart(LocalDateTime taskDateTimeStart) {
        this.taskDateTimeStart = taskDateTimeStart;
    }

    public LocalDateTime getTaskDateTimeStop() {
        return taskDateTimeStop;
    }

    public void setTaskDateTimeStop(LocalDateTime taskDateTimeStop) {
        this.taskDateTimeStop = taskDateTimeStop;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskCategory=" + taskCategory +
                ", taskDateTimeStart=" + taskDateTimeStart +
                ", taskDateTimeStop=" + taskDateTimeStop +
                '}';
    }
}
