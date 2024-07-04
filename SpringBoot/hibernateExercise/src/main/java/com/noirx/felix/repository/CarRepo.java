package com.noirx.felix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.noirx.felix.entity.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, Integer> {

}
