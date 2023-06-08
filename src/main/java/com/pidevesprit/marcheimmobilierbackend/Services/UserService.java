package com.pidevesprit.marcheimmobilierbackend.Services;

import com.pidevesprit.marcheimmobilierbackend.DAO.Entities.User;
import com.pidevesprit.marcheimmobilierbackend.DAO.Repositories.UserRepository;
import com.pidevesprit.marcheimmobilierbackend.Services.Interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {


    @Autowired
    UserRepository userRepo;
    @Override
    public User getUserById(Long id) {
        return userRepo.findById(id).get();
    }

    @Override
    public User getUserByEmail(String email) {
        System.out.println(email);
        return userRepo.findUserByEmail(email);
    }

    @Override
    public List<User> getAllUsers() {

        System.out.println("allusers");
        return (List<User>) userRepo.findAll();
    }

    @Override
    public String getRoleByEmailUser(String email) {
        User useraffecte=userRepo.findUserByEmail(email);
        String role=useraffecte.getRole().getTypeRole().toString();
        return role;



    }
}
