package com.igu.developer.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface CarRepository extends JpaRepository<Car, Long> {

    Optional<Car> findByName(final String name);
}
