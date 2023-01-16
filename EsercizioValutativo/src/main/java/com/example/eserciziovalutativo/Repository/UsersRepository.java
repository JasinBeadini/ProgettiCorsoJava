package com.example.eserciziovalutativo.Repository;
import com.example.eserciziovalutativo.model.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsersRepository extends CrudRepository<Users, String>{

    static Optional<Users> findByID(int lastID) {
        return null;
    }
}
