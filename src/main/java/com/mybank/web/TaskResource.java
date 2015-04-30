package com.mybank.web;

import com.mybank.domain.Task;
import com.mybank.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mmazigh on 22/04/2015.
 */
@RestController
@RequestMapping("/api/TaskResource")
public class TaskResource {

    @Autowired
    TaskRepository taskRepository;

    @RequestMapping("/informations")
    public String index(){
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/tasks")
    public List<Task> findAll(){
        System.out.println("Retrieving all tasks");
        return taskRepository.findAll();
    }

    @RequestMapping("/tasks/{id}")
    public Task findById(@PathVariable Long id){
        System.out.println("Retrieving task {id} = "+id);
        return taskRepository.finById(id);
    }

    @RequestMapping("/tasks/project/{id}")
    public List<Task> findByProjectId(@PathVariable Long id){
        System.out.println("Retrieving task for project {id} = "+id);
        return taskRepository.findByProjectId(id);
    }
}
