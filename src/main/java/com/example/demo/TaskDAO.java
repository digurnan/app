package com.example.demo;

        import org.springframework
        .stereotype
        .Repository;

        import com.example.demo.Tasks;

@Repository

// Class to create a list
// of tasks
public class TaskDAO {
    private static Tasks list
            = new Tasks();

    // This static block is executed
    // before executing the main
    // block
    static
    {

        // Creating a few tasks
        // and adding them to the list
        list.getTaskList().add(
                new Task(
                        1,
                        "goal2",
                        "step2"));

        list.getTaskList().add(
                new Task(
                        2, "goal3",
                        "step3"));

        list.getTaskList().add(
                new Task(
                        3, "goal4",
                        "step4"));


    }

    // Method to return the list
    public Tasks getAllTasks()
    {

        return list;
    }


    public Tasks getTaskStatusByUUID(String uuid)
    {

        return list;
    }


    // Method to add an task
    // to the tasks list
    public void
    addTask(Task task)
    {
        list.getTaskList()
                .add(task);

    }
}

