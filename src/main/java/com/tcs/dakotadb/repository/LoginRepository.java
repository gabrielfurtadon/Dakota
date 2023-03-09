package com.tcs.dakotadb.repository;

import com.tcs.dakotadb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LoginRepository extends JpaRepository<User, Long> {

    @Query(value="select * from tb_user where id = :id and password = :password", nativeQuery = true) // comando de verificação no bd 
    public User Login(long id, String password);  

    User findById(long id);
    
    <Entity extends User> Entity save(Entity entity);

}