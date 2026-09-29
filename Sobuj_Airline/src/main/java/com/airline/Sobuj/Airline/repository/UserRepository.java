package com.airline.Sobuj.Airline.repository;

import com.airline.Sobuj.Airline.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
