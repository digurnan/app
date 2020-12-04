package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Tasks {
    private List<Task> taskList;

    // Method to return the list
    // of tasks
    public List<Task> getTaskList()
    {

        if (taskList == null) {

            taskList
                    = new ArrayList<>();


        }

        return taskList;


    }

    public void
    setTaskList(
            List<Task> taskList)
    {
        this.taskList
                = taskList;
    }

}
