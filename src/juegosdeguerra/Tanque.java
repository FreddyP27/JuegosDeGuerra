package juegosdeguerra;

public class Tanque extends VehiculoGuerra {

    public Tanque(String nombre, int ataque, int defensa) {
        super(nombre, ataque, defensa);
    }


    @Override
    public int atacar() {
        int sumGuerreros = 10;
        int danioTotal = (int) ((getAtaque()* Math.random()*5)+sumGuerreros*Math.random()*5);
        
        return danioTotal;
    }

    @Override
    public int defender(int ataqueRecibido) {
        int vidaTotal = getPuntosVida();

        int resistenciaGuerreros = 10;

        int danioRecibido = (int) (vidaTotal -((getDefensa()*Math.random()*5)+resistenciaGuerreros * Math.random()*5));
        return danioRecibido;
    }

}
