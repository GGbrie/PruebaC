class EnemigoNormal implements Enemigo {
    private String nombre;
    private int puntosVida;

    public EnemigoNormal(String nombre) {
        this.nombre = nombre;
        this.puntosVida = 50; // Puntos de vida inicial
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca al jugador.");
    }

    @Override
    public void recibirDaño(int cantidad) {
        puntosVida -= cantidad;
        System.out.println(nombre + " recibe " + cantidad + " puntos de daño. Puntos de vida restantes: " + puntosVida);
    }
}