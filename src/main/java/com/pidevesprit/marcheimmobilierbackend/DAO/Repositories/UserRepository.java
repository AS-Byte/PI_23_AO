package com.pidevesprit.marcheimmobilierbackend.DAO.Repositories;

import com.pidevesprit.marcheimmobilierbackend.DAO.Entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {



    @Query(value = "select * from user alias where alias.email=?1",nativeQuery = true)
    User findUserByEmail(String email);



}
