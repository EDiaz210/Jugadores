//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Jugador j1 = new Jugador();

        j1.patear();
        j1.correr();

        Jugador j2 = new Jugador( "Massiel",19,"Brasil" );
        System.out.println(" ");
        j2.patear();
        j2.saltar();
        j2.correr();
    }
}