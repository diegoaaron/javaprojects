package academy.atl.panel.controllers;



import academy.atl.panel.models.Usuarios;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UsuarioController {

    List<Usuarios> usuariosx = new ArrayList<>();
    @GetMapping("/api/usuarios")
    public List<Usuarios> listarUsuarios(){

        Usuarios user = new Usuarios(1,"lucas","moy","954715233", "diegoaarondv@gmail.com");

        System.out.println("");
        usuariosx.add(user);
        System.out.println(usuariosx.toString());
        return usuariosx;
    }

    @DeleteMapping("/api/usuarios/{id}")
    public String eliminarUsuario(@PathVariable String id){
        return "El ID del usuario a eliminar es: " + id;
    }

    @PostMapping("prueba")
    public String prueba3(){
        return "Prueba de request Post";
    }

    @PutMapping("prueba")
    public String prueba4(){
        return "Prueba de request Put";
    }

    @PatchMapping("prueba")
    public String prueba5(){
        return "Prueba de request Patch";
    }
}
