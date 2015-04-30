package com.mybank.web;

import com.mybank.domain.Categorie;
import com.mybank.domain.Project;
import com.mybank.repository.CategorieRepository;
import com.mybank.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mmazigh on 22/04/2015.
 */
@RestController
@RequestMapping("/api/CategorieResource")
public class CategorieResource {

    @Autowired
    CategorieRepository categorieRepository;

    @RequestMapping("/informations")
    public String index(){
        return "Services categories d'opérations";
    }

    @RequestMapping("/categories")
    public List<Categorie> findAll(){
        return categorieRepository.findAll();
    }

    @RequestMapping(value = "/categories/{id}",method = RequestMethod.GET)
    public Categorie findById(@PathVariable Long id){
        return categorieRepository.finById(id);
    }

    @RequestMapping(value = "/categories/add",method = RequestMethod.PUT)
    public String addCategorie(@RequestBody Categorie categorie){
        categorieRepository.insert(categorie);
        return "La catégorie "+categorie.getLabel()+" a ete ajoutee avec succes!";
    }

    @RequestMapping(value = "/categories/delete",method = RequestMethod.DELETE)
    public String deleteCategorie(@RequestBody Categorie categorie){
        categorieRepository.delete(categorie);
        return "La catégorie "+categorie.getLabel()+" a ete supprimee avec succes!";
    }



    /*@RequestMapping("/tasks/project/{id}")
    public List<Task> findByProjectId(@PathVariable Long id){
        System.out.println("Retrieving task for project {id} = "+id);
        return taskRepository.findByProjectId(id);
    }*/
}
