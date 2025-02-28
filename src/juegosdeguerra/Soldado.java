package juegosdeguerra;

public class Soldado extends Guerrero{

    public Soldado(String nombre, String tipo, int fuerza, int resistencia) {
        super(nombre, tipo, fuerza, resistencia);
    }

	@Override
	public int aportarAtaque() {
	
		return this.getFuerza();
	}

	@Override
	public int aportarDefensa() {
		
		return this.getResistencia();
	}
    
    


}
