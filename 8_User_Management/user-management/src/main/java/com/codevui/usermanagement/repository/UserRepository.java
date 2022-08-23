package com.codevui.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codevui.usermanagement.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
