package com.pidevesprit.marcheimmobilierbackend.Services.Interfaces;

import com.pidevesprit.marcheimmobilierbackend.DAO.Entities.User;

import java.util.List;

public interface IUserService {



    User getUserById(Long id);
    User getUserByEmail(String email);
    List<User> getAllUsers();
    String getRoleByEmailUser(String email);

}
