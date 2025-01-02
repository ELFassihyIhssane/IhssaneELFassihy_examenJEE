package com.ihssaneelfassihy.examjee.dao.repositories;

import com.ihssaneelfassihy.examjee.dao.entities.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRepository extends JpaRepository<Action, Long> {
}
