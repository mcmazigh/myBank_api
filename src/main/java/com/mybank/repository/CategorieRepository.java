package com.mybank.repository;

import com.mybank.domain.Categorie;
import com.mybank.domain.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by mmazigh on 22/04/2015.
 */
//@Repository
public interface CategorieRepository extends MongoRepository<Categorie,Long> {

    @Query(value = "{id:?0}")
    Categorie finById(Long id);
}
