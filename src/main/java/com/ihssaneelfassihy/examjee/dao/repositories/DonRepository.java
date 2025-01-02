package com.ihssaneelfassihy.examjee.dao.repositories;

import com.ihssaneelfassihy.examjee.dao.entities.Don;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonRepository extends JpaRepository<Don, Long> {
    public List<Don> findByAction_Id(Long action_Id);
}
