package com.greenfoxacademy.connectwithmysql.repositories;

import com.greenfoxacademy.connectwithmysql.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository <Assignee, Long> {
}
