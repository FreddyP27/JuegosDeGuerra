package juegosdeguerra;

public class NaveDestructora extends VehiculoGuerra {

	public NaveDestructora(String nombre, int ataque, int defensa) {
		super(nombre, ataque, defensa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getAtaque() {
		int ataquesGuerreros=0;
		double sumarAtaque = Math.random()*0.05;
		
		for(Guerrero guerrero: this.getGuerrero()) {
			ataquesGuerreros += guerrero.getFuerza();
		} 
		
		int ataqueTotal = (int) (this.atacar()*(Math.random()*0.1)+(ataquesGuerreros*sumarAtaque));
		return ataqueTotal;
	}

	@Override
	public int getDefensa() {
		int defensaGuerreros=0;
		double sumarDefensa= Math.random()*0.05;
		
		for(Guerrero guerrero: this.getGuerrero()) {
			defensaGuerreros += guerrero.getResistencia();
		}
		
		int defensaTotal= (int) (this.defender(0)*(Math.random()*0.1)+(defensaGuerreros*sumarDefensa));
		return defensaTotal;
	}
	
	

}
