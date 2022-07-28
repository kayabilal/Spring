package com.bilal.kaya.springboot.repository;

import com.bilal.kaya.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    /*User findByFirstName(String firstname);
    User findByFirstNameAndLastName(String )*/

/*    @Query("")
    User getUser(String user);*/




}
