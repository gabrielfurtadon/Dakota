package com.tcs.dakotadb.controller;

import com.tcs.dakotadb.repository.*;
import com.tcs.dakotadb.model.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@RequestMapping // Abre a tela
@Controller
public class LoginController {

    @Autowired
    private LoginRepository repo;

    @PostMapping("/login")
    public Object index(@RequestParam(name = "id") String id, @RequestParam(name = "password") String password) {

        Long iId = Long.parseLong(id);
        User user = repo.Login(iId, password);
        Long iUser = user.getPermission().getId();

        if (user != null) {
            if (iUser == 1) {
                return "rh";
            } else if (iUser == 2) {
                return "manager";
            } else if (iUser == 3) {
                return "admin";
            } else {
                return "erro";
            }
        }
        return "login-error"; 

    }

}
