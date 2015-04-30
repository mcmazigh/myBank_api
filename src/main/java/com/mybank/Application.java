package com.mybank;

import com.mybank.domain.Categorie;
import com.mybank.domain.Project;
import com.mybank.domain.Task;
import com.mybank.repository.CategorieRepository;
import com.mybank.repository.ProjectRepository;
import com.mybank.repository.TaskRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mmazigh on 22/04/2015.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String []args){
        ApplicationContext ctx = SpringApplication.run(Application.class,args);
        /*ProjectRepository projectRepository = ctx.getBean(ProjectRepository.class);

        Project project = new Project();
        project.setId(Long.valueOf(2));
        project.setId(Long.valueOf(2));
        project.setName("Préparer la présentation 2");
        projectRepository.insert(project);*/
        System.out.println(System.getProperty("file.encoding"));

        CategorieRepository categorieRepository = ctx.getBean(CategorieRepository.class);
        Categorie categorie = new Categorie();
        categorie.setLabel("Alimentation");
        categorie.setIcon("");

       // projectRepository.insert(project);
     /*   TaskRepository repository = ctx.getBean(TaskRepository.class);

        Task task = new Task();
        task.setId(Long.valueOf(3));
        task.setTitle("Abcde");
        task.setIdProject(Long.valueOf(2));
        repository.insert(task);*/
    }
}
