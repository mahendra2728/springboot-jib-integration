package com.pm.spring.repository;

import com.pm.spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
