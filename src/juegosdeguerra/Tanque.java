package juegosdeguerra;

public class Tanque extends VehiculoGuerra {
	//private int ataqueBase = 7;
	//private int defensaBase = 5;
	
    public Tanque(String nombre, int ataque, int defensa) {
        super(nombre, ataque, defensa);
    }
    
    public Tanque(String nombre) {
    	super(nombre, 7, 5);
    }


    @Override
    public int atacar() {
        //int sumGuerreros = 10;
        //int danioTotal = (int) ((getAtaque()* Math.random()*5)+sumGuerreros*Math.random()*5);
    	int danioTotal = (int) (this.getAtaque() * Math.random());
    	
    	//SUMAR EL APORTE DE ATAQUE DE LOS GUERREROS
    	for(Guerrero guerrero : this.getGuerrero()) {
    		danioTotal += (int) (guerrero.aportarAtaque() * Math.random()*0.5);
    	}
        
    	System.out.println(this.getNombre() + " ataca con " + danioTotal + " puntos");
        return danioTotal;
    }

    @Override
    public int defender(int ataqueRecibido) {
        //int vidaTotal = getPuntosVida();
    	int defensaTotal = (int) (this.getDefensa() * Math.random());  //DEFENSA DEL VEHICULO POR RANDOM (0.1)
    	
    	//SUMAR EL APORTE DE DEFENSA DE LOS GUERREROS
    	for(Guerrero guerrero : this.getGuerrero()) {
    		defensaTotal += (int) (guerrero.aportarDefensa() * Math.random() * 0.5);
    	}

        int danioRecibido = Math.max(0, ataqueRecibido - defensaTotal); // COMPARA EL MAYOR Y EVITA DAÑO NEGATIVO
        danioRecibido = this.getPuntosVida() - danioRecibido;
		this.setPuntosVida(danioRecibido);
        
        System.out.println(this.getNombre() + " se defiende con " + defensaTotal + " puntos, le quedan " + danioRecibido + " puntos de vida");
        return danioRecibido;
    }

}
