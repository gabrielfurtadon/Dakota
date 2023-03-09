package com.tcs.dakotadb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.tcs.dakotadb.model.User;
import com.tcs.dakotadb.repository.*;

@Controller
@RestController
public class AdminController{

    @Autowired
    private UserRepository uRepo;

    @GetMapping("/getUsers") // API register-user
    public Object getUsers(){
        return uRepo.getUsers();
    }
   
    @PostMapping("/registerUser")
    public Object cadastrarUsuario (

        @RequestParam(name = "name") String name,
        @RequestParam(name = "radio") String radioHr,
        @RequestParam(name = "radio") String radioManager,
        @RequestParam(name = "idTcs") String idTcs,
        @RequestParam(name = "emailTcs") String emailTcs,
        @RequestParam(name = "typeUser") String typeUser) {// Tipo data
    
        User user = new User();
        Long id = Long.parseLong(idTcs);
        user.setId(id);
        user.setName(name);
        user.setTcs_email(emailTcs);
        // user.setPermission(null);
        // set radio hr 
        // set radio manager

        uRepo.save(user);
        return user;
    }


}