package Modelo;

public class Cliente {
    private int clientes_id;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;

    public Cliente() {
    }

    public Cliente(int clientes_id, String nombre, String apellido, String correo, String telefono) {
        this.clientes_id = clientes_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getClientes_id() {
        return clientes_id;
    }

    public void setClientes_id(int clientes_id) {
        this.clientes_id = clientes_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
