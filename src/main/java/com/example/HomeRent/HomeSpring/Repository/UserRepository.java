package com.example.HomeRent.HomeSpring.Repository;

import com.example.HomeRent.HomeSpring.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long> {
}
