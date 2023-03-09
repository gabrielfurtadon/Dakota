package com.tcs.dakotadb.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.tcs.dakotadb.model.OpenPosition;

public interface ArchivesRepository extends JpaRepository<OpenPosition, Integer> {
    //customer main sill title cluster posiion status
    //bradesco = custumer numero = cluster NOME DA VARIAVEL
    // Falta colocar customer, cluster, positionStatus -> ERRO
    // Tem um parametro no html, que está como identificado como "Bradesco BFS12", 
    // do qual eu não consigo identificar com algo no banco, e é preciso dele para concluir a query
    @Query(value = "SELECT customer, mainSkill, title, cluster, positionStatus FROM OpenPosition", nativeQuery = true)
    List<Object> getArchives();

    //@Query(value = "SELECT title, mainSkill FROM OpenPosition")
    //List<Object> getArchives();  // esse nao deu erro mas n faz o que queremos

    //@Query(value = "SELECT customer, cluster FROM OpenPosition")
    //List<Object> getArchives();
}
