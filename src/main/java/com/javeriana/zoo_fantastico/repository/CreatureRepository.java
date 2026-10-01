package com.javeriana.zoo_fantastico.repository;

import com.javeriana.zoo_fantastico.entity.Creature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CreatureRepository extends JpaRepository<Creature, Long> {
    // Solución al problema N+1: Carga en una sola consulta con LEFT JOIN FETCH
    @Query("SELECT c FROM Creature c LEFT JOIN FETCH c.zone")
    List<Creature> findAllWithZones();
}
