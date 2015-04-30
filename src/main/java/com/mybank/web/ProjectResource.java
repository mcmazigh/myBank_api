package com.mybank.web;

import com.mybank.domain.Project;
import com.mybank.domain.Task;
import com.mybank.repository.ProjectRepository;
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
@RequestMapping("/api/ProjectResource")
public class ProjectResource {

    @Autowired
    ProjectRepository projectRepository;

    @RequestMapping("/informations")
    public String index(){
        return "Services projets";
    }

    @RequestMapping("/projects")
    public List<Project> findAll(){
        System.out.println("Retrieving all projects");
        return projectRepository.findAll();
    }

    @RequestMapping("/projects/{id}")
    public Project findById(@PathVariable Long id){
        System.out.println("Retrieving Project {id} = "+id);
        return projectRepository.finById(id);
    }

    @RequestMapping("/projects/add")
    public void addProject(){

    }

    /*@RequestMapping("/tasks/project/{id}")
    public List<Task> findByProjectId(@PathVariable Long id){
        System.out.println("Retrieving task for project {id} = "+id);
        return taskRepository.findByProjectId(id);
    }*/
}
