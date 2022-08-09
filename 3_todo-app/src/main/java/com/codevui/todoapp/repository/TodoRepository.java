package com.codevui.todoapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codevui.todoapp.entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
}
