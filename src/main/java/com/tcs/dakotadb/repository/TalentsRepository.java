package com.tcs.dakotadb.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.tcs.dakotadb.model.Profile;

public interface TalentsRepository extends JpaRepository<Profile, Long> {
    
   // @Query(value = "SELECT id, fullName, mainSkill FROM Profile", nativeQuery = true)
    //List<Object> getTalents();
}
