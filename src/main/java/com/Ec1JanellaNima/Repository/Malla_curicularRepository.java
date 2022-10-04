package com.Ec1JanellaNima.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ec1JanellaNima.Model.Malla_curicular;

@Repository
public interface Malla_curicularRepository extends JpaRepository<Malla_curicular, Integer> {

}
