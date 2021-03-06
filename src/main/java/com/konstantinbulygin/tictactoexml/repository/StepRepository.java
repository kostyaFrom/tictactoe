package com.konstantinbulygin.tictactoexml.repository;

import com.konstantinbulygin.tictactoexml.model.Step;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StepRepository extends JpaRepository<Step, Integer> {
}
