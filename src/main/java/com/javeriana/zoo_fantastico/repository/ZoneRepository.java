package com.javeriana.zoo_fantastico.repository;

import com.javeriana.zoo_fantastico.entity.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneRepository extends JpaRepository<Zone, Long> {
}
