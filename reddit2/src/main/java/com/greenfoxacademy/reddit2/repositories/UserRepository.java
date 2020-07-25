package com.greenfoxacademy.reddit2.repositories;

import com.greenfoxacademy.reddit2.modells.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository <User, Long> {

    User findByUserName(String userName);

}
