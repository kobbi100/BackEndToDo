package com.todolist.app.Service;

import com.todolist.app.Entity.Task;

import java.util.List;

public interface TaskService {
    public List<Task> getAllTasksList();
    public  Task getTask(String id);
    public void addTask(Task task);
    public void updateTask(Task task,String id);
    public void deleteTask(String id);


}
