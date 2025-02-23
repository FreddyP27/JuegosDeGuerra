package juegosdeguerra;

public class Tanque extends VehiculoGuerra {
	private int ataqueBase = 5;
	private int defensaBase = 5;

    public Tanque(String nombre, int ataque, int defensa) {
        super(nombre, ataque, defensa);
    }


    @Override
    public int atacar() {
        //int sumGuerreros = 10;
        //int danioTotal = (int) ((getAtaque()* Math.random()*5)+sumGuerreros*Math.random()*5);
    	int danioTotal = (int) (ataqueBase * Math.random());
    	
    	//SUMAR EL APORTE DE ATAQUE DE LOS GUERREROS
    	for(Guerrero guerrero : this.getGuerrero()) {
    		danioTotal += (int) (guerrero.aportarAtaque() * Math.random()*0.5);
    	}
        
        return danioTotal;
    }

    @Override
    public int defender(int ataqueRecibido) {
        //int vidaTotal = getPuntosVida();
    	int defensaTotal = (int) (defensaBase * Math.random());  //DEFENSA DEL VEHICULO POR RANDOM (0.1)
    	
    	//SUMAR EL APORTE DE DEFENSA DE LOS GUERREROS
    	for(Guerrero guerrero : this.getGuerrero()) {
    		defensaTotal += (int) (guerrero.aportarDefensa() * Math.random() * 0.5);
    	}

        int danioRecibido = Math.max(0, ataqueRecibido - defensaTotal); // COMPARA EL MAYOR Y EVITA DAÑO NEGATIVO
        danioRecibido += this.getPuntosVida();
        this.setPuntosVida(danioRecibido);
        return danioRecibido;
    }

}
