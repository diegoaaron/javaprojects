package com.prueba.trivia.repository;

import com.prueba.trivia.entities.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CategoryRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Category findById(Long id) {
        return entityManager.find(Category.class, id);
    }

}
