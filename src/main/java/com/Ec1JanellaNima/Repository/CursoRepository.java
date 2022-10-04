package com.Ec1JanellaNima.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ec1JanellaNima.Model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
