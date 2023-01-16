package com.example.eserciziovalutativo.Service;

import com.example.eserciziovalutativo.Repository.UsersRepository;
import com.example.eserciziovalutativo.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service("UserService")
public class DBUsers implements IPUsers{

    @Autowired
    private UserRepository photoRepository;

    private List<Users> list;

    private int lastID;

    public DBUsers(){
        list= new ArrayList<>();
    }

    @Override
    public Iterable<Users> getAll() {
        return UsersRepository.findAll();
    }

    @Override
    public Optional<Users> getById(int id) {
        return Optional.empty();
    }

    @Override
    public Users create(Users user) {
        lastID++;
        Users.setID(lastID);
        list.add(user);
        return user;

    }


    @Override
    public Optional<Users> update(String email, Users user) {
        return Optional.empty();
    }

    @Override
    public boolean delete(String email) {
        Optional<Users> foundUser= UsersRepository.findByID(lastID);
        if (foundUser.isEmpty()) {

            return false;
        }

        UsersRepository.delete(foundUser.get());

        return true;
    }
}
