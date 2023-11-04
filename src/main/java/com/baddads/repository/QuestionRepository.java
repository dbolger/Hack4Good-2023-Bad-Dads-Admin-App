package com.baddads.repository;

import com.baddads.entities.quiz.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Long> {
}
