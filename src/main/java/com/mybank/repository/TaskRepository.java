package com.mybank.repository;

import com.mybank.domain.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mmazigh on 22/04/2015.
 */
//@Repository
public interface TaskRepository extends MongoRepository<Task,Long> {

    @Query(value = "{id:?0}")
    Task finById(Long id);

    @Query(value = "{idProject:?0}")
    List<Task> findByProjectId(Long projectId);
}
