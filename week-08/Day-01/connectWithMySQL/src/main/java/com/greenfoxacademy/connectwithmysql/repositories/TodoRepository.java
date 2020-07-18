package com.greenfoxacademy.connectwithmysql.repositories;

import com.greenfoxacademy.connectwithmysql.models.Todo;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository <Todo, Long> {

    void deleteById(Long id);
    Todo getById(Long id);
    List<Todo> getByUrgent(boolean urgent);
    List<Todo> getByDone(boolean done);

    @Query("SELECT c FROM Todo c WHERE c.title LIKE %:search% OR c.description LIKE %:search% ")
    List<Todo> findSearch(String search);

    @Transactional
    @Modifying
    @Query
    ("UPDATE Todo c SET c.  assignee=null WHERE c.assignee.id=:id")
    void deleteForeignKey(Long id);

}
