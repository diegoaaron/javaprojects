package academy.atl.panel.models;

import lombok.*;

@Data @AllArgsConstructor
public class Usuarios {
    private Integer id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    /*
    public Usuarios(int i, String lucas, String moy, String number, String mail) {
    }
     */
}
