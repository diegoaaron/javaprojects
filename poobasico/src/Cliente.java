public class Cliente {
    private String nombre;
    private String apellido;
    private Integer edad;

    public Cliente(){
        System.out.println("Pasamos por el constructor vacio");
    }
    public Cliente(String parametroNombre, String parametroApellido, Integer parametroEdad){
        nombre = parametroNombre;
        apellido = parametroApellido;
        edad = parametroEdad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        apellido = apellido;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("nombre " + getNombre() + " apellido " + getApellido() + " edad " + getEdad());
    }
}
