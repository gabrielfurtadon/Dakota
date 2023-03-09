package com.tcs.dakotadb.repository;

import com.tcs.dakotadb.model.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "SELECT name, permission FROM User")
    List<Object> getUsers();

    // Metodo POST salvar usuarios (AdminController)
    <Entity extends User> Entity save(Entity entity);
    User findById(Long id);

}
