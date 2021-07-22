package com.aubert.courts.dao;

import com.aubert.courts.entity.Court;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourtRepository extends JpaRepository<Court, Integer> {
    public Court findById(int id);
}
