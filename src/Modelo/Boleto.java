package Modelo;

public class Boleto {
    private int boleto_id;
    private String asientos;
    private int compra_id;
    private int promocion_id;
    private double precio_final;
    private int funcion_id;
    public Boleto() {}

    public Boleto(int boleto_id, String asientos, int compra_id, int promocion_id, double precio_final,int funcion_id) {
        this.boleto_id = boleto_id;
        this.asientos = asientos;
        this.compra_id = compra_id;
        this.promocion_id = promocion_id;
        this.precio_final = precio_final;
               this.funcion_id = funcion_id;
    }

    // Getters y Setters
    public int getBoleto_id() { return boleto_id; }
    public void setBoleto_id(int boleto_id) { this.boleto_id = boleto_id; }

    public String getAsientos() { return asientos; }
    public void setAsientos(String asientos) { this.asientos = asientos; }

    public int getCompra_id() { return compra_id; }
    public void setCompra_id(int compra_id) { this.compra_id = compra_id; }

    public int getPromocion_id() { return promocion_id; }
    public void setPromocion_id(int promocion_id) { this.promocion_id = promocion_id; }

    public double getPrecio_final() { return precio_final; }
    public void setPrecio_final(double precio_final) { this.precio_final = precio_final; }
    
     public int getFuncion_id() { return funcion_id; }
    public void setFuncion_id(int funcion_id) { this.funcion_id = funcion_id; }
}
