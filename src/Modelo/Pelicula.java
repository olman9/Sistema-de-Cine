package Modelo;

public class Pelicula {
    private int pelicula_id;
    private String titulo;
    private int duracion;
    private String clasificacion;

    public Pelicula(int pelicula_id, String titulo, int duracion, String clasificacion) {
        this.pelicula_id = pelicula_id;
        this.titulo = titulo;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
    }

    public int getPelicula_id() {
        return pelicula_id;
    }

    public void setPelicula_id(int pelicula_id) {
        this.pelicula_id = pelicula_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
}
