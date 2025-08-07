package Modelo;

public class Cliente {
    private int clientes_id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Cliente() {}

    public Cliente(int cliente_id, String nombre, String apellido, String email, String telefono) {
        this.clientes_id = clientes_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public int getClientes_id() {
        return clientes_id;
    }

    public void setClientes_id(int cliente_id) {
        this.clientes_id = cliente_id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
