package com.ihssaneelfassihy.examjee.dao.repositories;

import com.ihssaneelfassihy.examjee.dao.entities.Organisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganisateurRepository extends JpaRepository<Organisateur, Long> {
}
