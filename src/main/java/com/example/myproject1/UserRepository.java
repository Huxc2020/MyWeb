package com.example.myproject1;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByLocation(String location);

}
