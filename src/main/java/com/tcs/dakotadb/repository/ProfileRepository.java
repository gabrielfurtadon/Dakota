package com.tcs.dakotadb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tcs.dakotadb.model.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
    
    // rh.html
    @Query(value = "SELECT fullName, seniority, mainSkill, role FROM Profile")
    List<Object> getProfile();

    // info-Candidates.html
    // Falta puxar a salaryIntention, english, spanish, profileSource, roleId, currentEmployer -> ERRO
    //  @Query(value = "SELECT fullName, dateInterview, location, email, resolutionComments, "
           // + "candidateScreeningResolution, feedback, mainSkill,salaryIntention,english,spanish,profileSource, roleId, currentEmployer FROM Profile"
           // , nativeQuery = true)
    //List<Object> getInfoCandidates();
}
