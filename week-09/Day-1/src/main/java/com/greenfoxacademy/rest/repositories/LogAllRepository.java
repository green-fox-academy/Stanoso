package com.greenfoxacademy.rest.repositories;

import com.greenfoxacademy.rest.modells.LogAll;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogAllRepository extends CrudRepository <LogAll, Long> {

}
