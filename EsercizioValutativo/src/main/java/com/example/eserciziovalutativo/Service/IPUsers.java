package com.example.eserciziovalutativo.Service;

import com.example.eserciziovalutativo.Repository.UsersRepository;
import com.example.eserciziovalutativo.model.Users;

import java.util.Optional;

public interface IPUsers {

    public Iterable<Users> getAll();

    public Optional<Users> getById(int id);

    public Users create(Users user);

    public Optional<Users> update(String email, Users user);

    public boolean delete(String email);
}
