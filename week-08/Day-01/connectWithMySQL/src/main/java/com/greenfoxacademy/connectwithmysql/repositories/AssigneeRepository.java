package com.greenfoxacademy.connectwithmysql.repositories;

import com.greenfoxacademy.connectwithmysql.models.Assignee;
import com.greenfoxacademy.connectwithmysql.models.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssigneeRepository extends CrudRepository <Assignee, Long> {

    Assignee getById(Long id);
    @Query("SELECT c FROM Assignee c WHERE c.name LIKE %:search% OR c.email LIKE %:search% ")
    List<Assignee> findSearchInAssignee(String search);

    @Query("SELECT c.name FROM Assignee c")
    List<String> getAllNames();

    @Query("SELECT c.id FROM Assignee c WHERE c.name LIKE ?1 AND c.email LIKE ?2")
    Long getIdByNameAndEmail(String name, String email);
}
