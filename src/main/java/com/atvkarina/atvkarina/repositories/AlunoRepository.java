package com.atvkarina.atvkarina.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atvkarina.atvkarina.entities.Aluno;



@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> { 
}
