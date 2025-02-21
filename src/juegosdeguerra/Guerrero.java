package juegosdeguerra;

public abstract class Guerrero {

    private String nombre;

    private String tipo;

    private int fuerza;

    private int resistencia;

    public Guerrero(String nombre, String tipo, int fuerza, int resistencia) {
    	if(this.fuerza + this.resistencia > 10) {
    		System.out.println("La suma de fuera y resistencia no puede ser mayor que 10");
    	}
        this.nombre = nombre;
        this.tipo = tipo;
        this.fuerza = fuerza;
        this.resistencia = resistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    
    
    

}