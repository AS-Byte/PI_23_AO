package com.pidevesprit.marcheimmobilierbackend.DAO.Repositories;

import com.pidevesprit.marcheimmobilierbackend.DAO.Entities.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role,Long> {
}
