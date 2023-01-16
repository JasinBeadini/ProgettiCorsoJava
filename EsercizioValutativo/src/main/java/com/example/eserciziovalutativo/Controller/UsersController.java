package com.example.eserciziovalutativo.Controller;

import com.example.eserciziovalutativo.model.Users;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersController {
    @RequestMapping("/model/Users")
    public List<Users> getAll() {
        List<Users> list = new ArrayList<>();


        list.add(new Users(1, "ciao"));


        return list;
    }
}
