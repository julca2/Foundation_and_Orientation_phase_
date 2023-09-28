package com.greenfoxacademy.Printable;

public class Todo implements Printable{
    String task;
    String priority;

    boolean done;

    public Todo(String task, String priority, boolean done) {
        this.task = task;
        this.priority = priority;
        this.done = done;
    }

    @Override
    public void printAllFields() {
        System.out.println("Task: " + task + " | Priority: " + priority + " | Done: " + done);
    }
}
