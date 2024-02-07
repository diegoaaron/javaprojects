package academy.atl.panel.models;

import lombok.*;

@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Usuarios {
    private Integer id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
}
