package Cervezas;

// Clase base para todas las marcas de cerveza
public abstract class MarcaCerveza {
    protected String nombre;
    protected double contenidoLupulo; // gramos por litro
    protected String paisFabricacion;
    
    public MarcaCerveza(String nombre, double contenidoLupulo, String paisFabricacion) {
        this.nombre = nombre;
        this.contenidoLupulo = contenidoLupulo;
        this.paisFabricacion = paisFabricacion;
    }
    
    public abstract double calcularGraduacion();
    
    // Getters
    public String getNombre() { return nombre; }
    public double getContenidoLupulo() { return contenidoLupulo; }
    public String getPaisFabricacion() { return paisFabricacion; }
}