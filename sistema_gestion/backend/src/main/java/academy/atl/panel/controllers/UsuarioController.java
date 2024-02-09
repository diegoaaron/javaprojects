package academy.atl.panel.controllers;



import academy.atl.panel.models.Usuarios;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UsuarioController {

    static List<Usuarios> usuarios = new ArrayList<>();
    @GetMapping("/api/usuarios")
    public List<Usuarios> listarUsuarios(){

        return usuarios;
    }

    @DeleteMapping("/api/usuarios/{id}")
    public void eliminarUsuario(@PathVariable String id){

        for(Usuarios user: usuarios){
            if(id.equals(user.getId().toString())){
                usuarios.remove(user);
            }
        }

        //Usuarios usuarioEncontrado = usuarios.stream().filter(user -> user.getId().equals(id)).findFirst().get();
        //usuarios.remove(usuarioEncontrado);
    }

    @PostMapping("/api/usuarios")
    public void agregarUsuario(@RequestBody Usuarios user){

        usuarios.add(user);
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
