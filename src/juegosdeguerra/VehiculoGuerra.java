package juegosdeguerra;


import java.util.ArrayList;
import java.util.List;
import juegosdeguerra.interfaces.Tripulable;

public abstract class VehiculoGuerra implements Tripulable {

    private int puntosVida;
    private int ataque;
    private int defensa;
    private String nombre;
    private List <Guerrero>guerrero;

    
    public VehiculoGuerra(String nombre, int ataque, int defensa) {
        this.puntosVida = 1000;
        this.ataque = ataque;
        this.defensa = defensa;
        this.nombre = nombre;
        this.guerrero = new ArrayList<>();
        
        if(this.ataque + this.defensa >10) {
        	this.ataque=5;
        	this.defensa=5;
        }else {
        	this.ataque = ataque;
        	this.defensa = defensa;
        }
    }

    public int getPuntosVida() {
        return puntosVida;
    }


    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }


    public int getAtaque() {
        return ataque;
    }


    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }


    public int getDefensa() {
        return defensa;
    }


    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public List<Guerrero> getGuerrero() {
        return guerrero;
    }


    public void setGuerrero(List<Guerrero> guerrero) {
        this.guerrero = guerrero;
    }

    
    @Override
    public int atacar() {
        return 0;
    }

    @Override
    public int defender(int ataqueRecibido) {
        return 0;
    }

    private void embarcarGuerrero(Guerrero guerrero){
        if(this.guerrero.size()>10){
            System.out.println("Vehiculo de guerra lleno");
        }else{
            this.guerrero.add(guerrero);
            System.out.println("El guerrero se embarco con exito");
        }
        
    }

}
