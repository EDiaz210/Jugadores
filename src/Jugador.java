public class Jugador {
    String Avatar;
    int edad;
    String pais;


    public Jugador(){
       Avatar= "Lyxuz";
       edad = 20;
       pais = "Ecuador";
    }

    public Jugador(String Avatar,int edad, String pais){
        this.Avatar= Avatar;
        this.edad = edad;
        this.pais = pais;
    }



    public void correr(){
        System.out.print(" y corriendo");
    }

    public void saltar(){
        System.out.print(", saltando");
    }

    public void patear(){
        System.out.print("El jugador " +Avatar+" que tiene la edad de "+edad+" del pais "+pais+" se encuentra pateando");
    }
}
