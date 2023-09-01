class Jugador implements Personaje {
    private String nombre;
    private int puntosVida;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntosVida = 100; // Puntos de vida inicial
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca a un enemigo.");
    }

    @Override
    public void recibirDaño(int cantidad) {
        puntosVida -= cantidad;
        System.out.println(nombre + " recibe " + cantidad + " puntos de daño. Puntos de vida restantes: " + puntosVida);
    }
}