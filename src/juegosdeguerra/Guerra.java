package juegosdeguerra;


public class Guerra {

    public static void main(String[] args) {
    	
    	//CREAR VEHICULOS
       Tanque tanque = new Tanque("T1", 5, 5);  //linea construido por Sergio
       NaveDestructora nave = new NaveDestructora("N1", 5, 5);
       
      //CREAR GUERREROS
       Soldado soldado1 = new Soldado("S1","humano", 5, 3); //Clase soldado construido por Marcela
       Soldado soldado2 = new Soldado("S2","humano", 6,2);
       Soldado alienigena1 = new Soldado("A1","extraterrestre", 4, 4);
       Soldado alienigena2 = new Soldado("A2","extraterrestre", 7, 3);

       //EMBARCAR GUERREROS EN VEHICULOS
       tanque.embarcarGuerrero(soldado1);
       tanque.embarcarGuerrero(soldado2);
       nave.embarcarGuerrero(alienigena1);
       tanque.embarcarGuerrero(alienigena2); //excepcion
       
       //EMPIEZA LA GUERRA
       System.out.println("EMPIEZA LA GUERRA");
       
       //BATALLA POR TURNOS
       while(tanque.getPuntosVida() > 0 && nave.getPuntosVida() > 0) {
    	   //TURNO DEL TANQUE
    	   int ataqueTanque = tanque.atacar();   //linea construido por Sergio
    	   nave.defender(ataqueTanque);
    	   if(nave.getPuntosVida() <= 0) {
    		   System.out.println(nave.getNombre() + " ha sido eliminado. " + tanque.getNombre() + " es el GANADOR!!");
    		   break;
    	   }
    	   
    	   //TURNO NAVE DESTRUCTORA
    	   int ataqueNave = nave.atacar();
    	   tanque.defender(ataqueNave);
    	   if(tanque.getPuntosVida() <= 0) {
    		   System.out.println(tanque.getNombre() + " ha sido eliminado. "+ nave.getNombre() + " es el GANADOR!!");
    		   break;
    	   }   
       }
    }
}
