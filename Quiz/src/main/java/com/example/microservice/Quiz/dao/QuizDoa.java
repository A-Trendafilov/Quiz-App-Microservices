package com.example.microservice.Quiz.dao;

import com.example.microservice.Quiz.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDoa extends JpaRepository<Quiz, Integer> {
}
