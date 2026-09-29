package com.airline.Sobuj.Airline.repository;

import com.airline.Sobuj.Airline.Entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}