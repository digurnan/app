package com.example.demo;

import java.net.URI;

import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.beans
        .factory.annotation.Autowired;
import org.springframework.http
        .ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet
        .support.ServletUriComponentsBuilder;

// Import the above-defined classes
// to use the properties of those
// classes
import com.example.demo.Tasks;
import com.example.demo.TaskDAO;

// Creating the REST controller
@RestController
@RequestMapping(path = "/api/")
public class TaskController {

    @Autowired
    private TaskDAO taskDao;

    // Implementing a GET method
    // to get the list of all
    // the tasks
    @GetMapping(
            path = "/bulkGenerate",
            produces = "application/json")

    public Tasks getTasks()
    {

        return taskDao
                .getAllTasks();
    }

    @GetMapping("/tasks/{uuid}/status")
    public Tasks getTaskStatus(@PathVariable("uuid") String uuid) {
        //log.info("Getting status of Task with uuid: {}", uuid);
        return taskDao.getTaskStatusByUUID(uuid);
    }

    // Create a POST method
    // to add an task
    // to the list
    @PostMapping(
            path = "/generate",
            consumes = "application/json",
            produces = "application/json")

    public ResponseEntity<Object> addTask(
            @RequestBody Task task)
    {

        // Creating an ID of an task
        // from the number of tasks
        Integer id
                = taskDao
                .getAllTasks()
                .getTaskList()
                .size()
                + 1;

        task.setId(id);

        taskDao
                .addTask(task);

        URI location
                = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(
                        task.getId())
                .toUri();

        return ResponseEntity
                .created(location)
                .build();
    }
}
