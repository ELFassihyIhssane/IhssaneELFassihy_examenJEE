package com.ihssaneelfassihy.examjee.dao.repositories;

import com.ihssaneelfassihy.examjee.dao.entities.Donateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonateurRepository extends JpaRepository<Donateur, Long> {
}
