package Modelo;

public class Funcion {
    private int funcion_id;
    private int pelicula_id;
    private int sala_id;
    private String fecha_hora;  // Fecha como String
    private float precio_base;
   private String titulo_Pelicula;
    // Constructor vacío
    public Funcion() {}

    // Constructor con parámetros (sin precio_base para simplificar)
    public Funcion(int funcion_id, String fecha_hora, int sala_id, int pelicula_id) {
        this.funcion_id = funcion_id;
        this.fecha_hora = fecha_hora;
        this.sala_id = sala_id;
        this.pelicula_id = pelicula_id;
    
    }

    // Getters y setters
    public int getFuncion_id() {
        return funcion_id;
    }

    public void setFuncion_id(int funcion_id) {
        this.funcion_id = funcion_id;
    }

    public int getPelicula_id() {
        return pelicula_id;
    }

    public void setPelicula_id(int pelicula_id) {
        this.pelicula_id = pelicula_id;
    }

    public int getSala_id() {
        return sala_id;
    }

    public void setSala_id(int sala_id) {
        this.sala_id = sala_id;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public float getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(float precio_base) {
        this.precio_base = precio_base;}
public String getTituloPelicula() { return titulo_Pelicula; }
 public void setTituloPelicula(String tituloPelicula) { this.titulo_Pelicula = tituloPelicula; }
    
}
