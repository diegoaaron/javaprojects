package com.bootcamp2.bootcamp2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusquedaController {

    @GetMapping("/busqueda-usuario/{busqueda}")
    public String[] obtenerPalabrasAutocompletar(@PathVariable String busqueda){

        String[] frasesTipicasDeBusqueda = {"bootcamp de java","java bootcamp",
                "por que java es tan dificil", "java curso 2023", "bootcamp de python",
                "bootcamp avanzado de java"};

        String[] resultadoDeLaBusqueda = new String[10];
        int contador = 0;

        // forma 2
        for(String frase: frasesTipicasDeBusqueda) {
            if(frase.toLowerCase().contains(busqueda.toLowerCase())) {
                resultadoDeLaBusqueda[contador] = frase;
                ++contador;

            }
        }



        return resultadoDeLaBusqueda;
    }
}
