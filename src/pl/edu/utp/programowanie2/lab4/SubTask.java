package pl.edu.utp.programowanie2.lab4;

import java.time.LocalDateTime;

public class SubTask extends Task {

    private String subtaskName;
    public String getSubtaskName() {
        return subtaskName;
    }

    void setSubtaskName(String subtaskName) {
        this.subtaskName = subtaskName;
    }

    @Override
    public String toString() {
        return "SubTask{" +
                " task='" + super.toString() + '\'' +
                ", subtaskName='" + subtaskName + '\'' +
                '}';
    }

    public SubTask() {
    }

    public SubTask(String taskName, String taskDescription, TaskCategory taskCategory, LocalDateTime taskDateTimeStop) {
        super(taskName, taskDescription, taskCategory, taskDateTimeStop);
    }

    public SubTask(String taskName, String taskDescription, TaskCategory taskCategory, LocalDateTime taskDateTimeStop, String subtaskName) {
        super(taskName, taskDescription, taskCategory, taskDateTimeStop);
        this.subtaskName = subtaskName;
    }


}
