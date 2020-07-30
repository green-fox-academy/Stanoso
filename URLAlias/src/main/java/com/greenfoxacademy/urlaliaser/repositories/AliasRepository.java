package com.greenfoxacademy.urlaliaser.repositories;

import com.greenfoxacademy.urlaliaser.models.Alias;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AliasRepository extends CrudRepository<Alias, Long> {

    List<Alias> findAll ();

}
