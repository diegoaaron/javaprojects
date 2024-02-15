package com.prueba.trivia;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prueba.trivia.entities.Category;
import com.prueba.trivia.entities.Question;
import com.prueba.trivia.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TriviaController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/question/{categoria}")
    public Category getQuestion(@PathVariable String categoria) throws IOException, IllegalArgumentException {

        List<Category> resultado = new ArrayList<>();
        Category ejemplo = categoryRepository.findById(1L);
        resultado.add(ejemplo);
        return ejemplo;
    }

    @GetMapping("/categories")
    public Category[] getCategories() {

        Category catArte = new Category();
        catArte.setName("Arte");
        catArte.setDescription("Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.");

        Category catDeporte = new Category();
        catDeporte.setName("Deportes");
        catDeporte.setDescription("Preguntas relacionadas con diversos deportes y eventos deportivos.");

        Category[] categories = new Category[2];
        categories[0] = catArte;
        categories[1] = catDeporte;

        return categories;
        /*
        return "[\n" +
                "  {\n" +
                "    \"category\": \"Cultura\",\n" +
                "    \"description\": \"Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Deportes\",\n" +
                "    \"description\": \"Preguntas relacionadas con diversos deportes y eventos deportivos.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Arte\",\n" +
                "    \"description\": \"Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Cine\",\n" +
                "    \"description\": \"Preguntas relacionadas con películas, directores, actores y otros aspectos del cine.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Historia\",\n" +
                "    \"description\": \"Preguntas relacionadas con eventos históricos, personajes y períodos importantes.\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"category\": \"Ciencia\",\n" +
                "    \"description\": \"Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos.\"\n" +
                "  }\n" +
                "]";
         */
    }

}
