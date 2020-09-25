package com.todolist.app.Controller;

import com.todolist.app.Entity.Task;
import com.todolist.app.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> allTasks()
    {return  taskService.getAllTasksList();}

    @GetMapping("/tasks/{id}")
    public Task getTask (@PathVariable("id") String id)
    {return taskService.getTask(id);}

    @PostMapping("/tasks")
    public void addTask(@RequestBody Task task) {
        taskService.addTask(task);}

    @PutMapping("/tasks/{id}")
    public void updateTask(@RequestBody Task task,@PathVariable("id") String id)
    {
        taskService.updateTask(task,id); }

    @DeleteMapping("/tasks/{id}")
    public void deleteTask(@PathVariable("id")String id){
        taskService.deleteTask(id);}
}