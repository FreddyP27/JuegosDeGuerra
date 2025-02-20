package juegosdeguerra;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import juegosdeguerra.interfaces.Tripulable; // se debe importar para que funcione

public abstract class VehiculoGuerra implements Tripulable {

    private int puntosVida;
    private int ataque;
    private int defensa;
    private String nombre;
    private List <Guerrero>guerrero;

    
    public VehiculoGuerra(int puntosVida, int ataque, int defensa, String nombre, List<Guerrero> guerrero) {
        this.puntosVida = puntosVida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.nombre = nombre;
        this.guerrero = guerrero;
    }

    


    public VehiculoGuerra(int puntosVida, int ataque, int defensa) {
        this.puntosVida = puntosVida;
        this.ataque = ataque;
        this.defensa = defensa;
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

    
    private void embarcarGuerrero(){

        //List<String,List<Guerrero>> this.guerrero = new LinkedList<>(); 
        List<VehiculoGuerra> vehiculoGuerras = new CopyOnWriteArrayList<>();

        for (VehiculoGuerra vehiculoGuerra : vehiculoGuerras) {
            vehiculoGuerra.setPuntosVida(puntosVida);
            vehiculoGuerra.setAtaque(ataque);
            vehiculoGuerra.setDefensa(defensa);
            vehiculoGuerra.setNombre(nombre);
            vehiculoGuerra.setGuerrero(guerrero);
        }
        
    }

}
