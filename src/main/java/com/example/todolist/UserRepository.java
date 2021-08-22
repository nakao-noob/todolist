package com.example.todolist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<List, Long> {
}
