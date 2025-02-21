package juegosdeguerra;


public class Guerra {

    public static void main(String[] args) {
        
       Tanque tanque1 = new Tanque("T1", 20, 10);



        int ataqueTanque = tanque1.atacar();

        int defensaTanque = tanque1.defender(0);

       System.out.println("El tanque esta realizando un ataque de :"+ataqueTanque);

      

       System.out.println("El tanque tiene una defensa de :"+ defensaTanque);

       System.out.println("El tanque ha recibido un daño  de "+ataqueTanque+", su cantidad de vida es :"+ (defensaTanque-ataqueTanque));

      System.out.println(tanque1.getPuntosVida());tanque1.getPuntosVida();
    
    }

    
    private void llenarNaves(){
       
    }

}
