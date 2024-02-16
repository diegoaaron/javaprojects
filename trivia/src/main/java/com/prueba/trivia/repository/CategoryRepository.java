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
    EntityManager conexionBaseDeDatos;

    public Category findById(Long id) {
        return conexionBaseDeDatos.find(Category.class, id);
    }

}
