package com.todolist.app.Service;

import com.todolist.app.Entity.Task;
import com.todolist.app.Service.TaskService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    private List<Task> taskList = new ArrayList<>(Arrays.asList(

            new Task("Sport", "workout"),
            new Task("work", "git commit"),
            new Task("Studies", "Java excercices")

    ));

    public List<Task> getAllTasksList(){
        return taskList;
    }

    public  Task getTask(String id){
       return taskList.stream().filter(task ->task.getId().equals(id)).findFirst().get();
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void updateTask(Task task,String id) {
        int counter =0;
        for(Task task1 :taskList){
        if(task1.getId().equals(id))
        {taskList.set(counter,task);}
        counter++;}
    }

    public void deleteTask(String id){
        taskList.removeIf(topic->topic.getId().equals(id));
    }
}


