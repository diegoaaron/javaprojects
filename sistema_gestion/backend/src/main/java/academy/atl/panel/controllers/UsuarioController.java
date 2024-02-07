package academy.atl.panel.controllers;

import academy.atl.panel.models.Usuarios;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    Usuarios user = new Usuarios();
    @GetMapping("/prueba")
    public String hacerAlgo(){
        return "Hola";
    }
}
