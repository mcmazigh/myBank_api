package com.mybank.repository;

import com.mybank.domain.Project;
import com.mybank.domain.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by mmazigh on 22/04/2015.
 */
//@Repository
public interface ProjectRepository extends MongoRepository<Project,Long> {

    @Query(value = "{id:?0}")
    Project finById(Long id);

}
