package com.example.RailwayReservationSystem.repository;

import com.example.RailwayReservationSystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

        public  User findByFirstNameIgnoreCase(String firstName);
}