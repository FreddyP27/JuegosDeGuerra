package juegosdeguerra;

import juegosdeguerra.interfaces.Tripulable;

public class NaveDestructora extends VehiculoGuerra implements Tripulable {
	private int ataqueBase = 5;
	private int defensaBase = 5;
	public NaveDestructora(String nombre, int ataque, int defensa) {
		super(nombre, ataque, defensa);
		
	}

	@Override
	public int atacar() {
		int ataqueTotal = (int) (ataqueBase * Math.random()*0.1); //ATAQUE DEL VEHICULO * RANDOM (0,1)
		
		//SUMAR EL APORTE DE ATAQUE DE LOS GUERREROS
		for(Guerrero guerrero : this.getGuerrero()) {
			ataqueTotal += (int) (guerrero.aportarAtaque() * Math.random()*0.5);
		}
		
		System.out.println(this.getNombre() + " ataca con " + ataqueTotal + " puntos");
		return ataqueTotal;
	}

	@Override
	public int defender(int ataqueRecibido) {
		int defensaTotal = (int) (defensaBase * Math.random()*0.1);
		
		//SUMAR EL APORTE DE DEFENSA DE LOS GUERREROS
		for(Guerrero guerrero : this.getGuerrero()) {
			defensaTotal += (int) (guerrero.aportarDefensa() * Math.random()*0.5);
		}
		
		int destruccion = Math.max(0,ataqueRecibido - defensaTotal); //MATH.MAX METODO QUE DEVUELVE EL MAYOR DE DOS NUMEROS EL 0 EVITA QUE SEA UN NUMERO NEGATIVO
		destruccion -= this.getPuntosVida();
		this.setPuntosVida(destruccion);
		
		System.out.println(this.getNombre() + " se defiende con " + defensaTotal + " puntos y pierde " + destruccion + " puntos de vida");
		return defensaTotal;
	}
}
