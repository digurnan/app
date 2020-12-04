package com.example.demo;

// Creating an entity Task
public class Task {

    public Task() {}


    // Parameterized Constructor
    // to assign the values
    // to the properties of
    // the entity
    public Task(
            Integer id, String goal,
            String step)
    {

        super();

        this.id = id;

        this.goal = goal;

        this.step = step;


    }

    private Integer id;

    private String goal;

    private String step;


    // Overriding the toString method
    // to find all the values
    @Override
    public String toString()
    {

        return "Task [id="
                + id + ", goal="
                + goal + ", step="
                + step + "]";


    }

    // Getters and setters of
    // the properties
    public Integer getId()
    {

        return id;
    }

    public void setId(Integer id)
    {

        this.id = id;
    }
    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }


    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }
   }
