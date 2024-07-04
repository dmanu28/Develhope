package com.betalent.libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.betalent.libreria.entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {

}
