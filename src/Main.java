public class Main {
    public static void main(String[] args) {
        // Crear fábricas de personajes y enemigos
        FabricaPersonajes fabricaGuerrero = new FabricaGuerrero();
        FabricaPersonajes fabricaMago = new FabricaMago();
        FabricaEnemigos fabricaEnemigoNormal = new FabricaEnemigoNormal();

        // Crear personajes y enemigos usando las fábricas
        Personaje jugador1 = fabricaGuerrero.crearPersonaje();
        Personaje jugador2 = fabricaMago.crearPersonaje();
        Enemigo enemigo1 = fabricaEnemigoNormal.crearEnemigo();

        // Interacciones entre personajes y enemigos
        jugador1.atacar();
        enemigo1.recibirDaño(20);
        enemigo1.atacar();
        jugador1.recibirDaño(10);
        jugador2.atacar();
        enemigo1.recibirDaño(30);
    }
}
