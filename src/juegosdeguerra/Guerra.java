package juegosdeguerra;


public class Guerra {

    public static void main(String[] args) {
    	
    	//CREAR VEHICULOS
       Tanque tanque1 = new Tanque("T1", 5, 5);  //linea construido por Sergio
       NaveDestructora nave1 = new NaveDestructora("N1", 5, 5);
       
       //CREAR GUERREROS
       Soldado soldado1 = new Soldado("S1","humano", 5, 3); //Clase soldado construido por Marcela
       Soldado soldado2 = new Soldado("S2","humano", 6,2);
       Soldado alienigena1 = new Soldado("A1","extraterrestre", 4, 4);

       //EMBARCAR GUERREROS EN VEHICULOS
       tanque1.embarcarGuerrero(soldado1);
       tanque1.embarcarGuerrero(soldado2);
       nave1.embarcarGuerrero(alienigena1);
       
       //EMPIEZA LA GUERRA
       System.out.println("EMPIEZA LA GUERRA");
       
       //BATALLA POR TURNOS
       while(tanque1.getPuntosVida() > 0 && nave1.getPuntosVida() > 0) {
    	   //TURNO DEL TANQUE
    	   int ataqueTanque = tanque1.atacar();   //linea construido por Sergio
    	   nave1.defender(ataqueTanque);
    	   if(nave1.getPuntosVida() <= 0) {
    		   System.out.println(nave1.getNombre() + " ha sido eliminado. " + tanque1.getNombre() + " es el GANADOR!!");
    		   break;
    	   }
    	   
    	   //TURNO NAVE DESTRUCTORA
    	   int ataqueNave = nave1.atacar();
    	   tanque1.defender(ataqueNave);
    	   if(tanque1.getPuntosVida() <= 0) {
    		   System.out.println(tanque1.getNombre() + " ha sido eliminado. "+ nave1.getNombre() + " es el GANADOR!!");
    		   break;
    	   }   
       }
    }
}
