package com.tcs.dakotadb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tcs.dakotadb.model.OpenPosition;

@Repository
public interface PositionRepository extends JpaRepository<OpenPosition, Integer> {

    // Falta puxar priority, rgsStatus -> ERRO ---- // att: continua sem a priority e rgs status
    // O que é vacancies? Onde ele tá na tabela? // att: vacancies resolvido
    // manager.html
  //  @Query(value = "SELECT title, seniority, vacancies, customer, positionStatus, priority FROM OpenPosition", nativeQuery = true)
  // List<Object> getPositions();


    // criação da query de infoVagas
    //@Query(value = "SELECT * FROM OpenPosition", nativeQuery = true)
    //List<Object> getInfoPositions();
}
