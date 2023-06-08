package com.pidevesprit.marcheimmobilierbackend.RestControllers;

import com.pidevesprit.marcheimmobilierbackend.DAO.Entities.User;
import com.pidevesprit.marcheimmobilierbackend.Services.Interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private IUserService userRest;


    @GetMapping("/getUserById/{id}")
    User getUserById(@PathVariable Long id){

        return userRest.getUserById(id);
    }
    @GetMapping("/getUserByEmail/{email}")
    User getUserByEmail(@PathVariable String email){
        System.out.println(email);
        return userRest.getUserByEmail(email);

    }

    @GetMapping("/getAllUsers")
    List<User> getAllUsers(){
        return userRest.getAllUsers();
    }
 @GetMapping("/getRoleByEmailUser/{email}")
    String getRoleByEmailUser(@PathVariable String email){
        return userRest.getRoleByEmailUser(email);
 }



}
