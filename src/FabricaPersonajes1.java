class FabricaGuerrero extends FabricaPersonajes {
    @Override
    public Personaje crearPersonaje() {
        return new Jugador("Guerrero");
    }
}

class FabricaMago extends FabricaPersonajes {
    @Override
    public Personaje crearPersonaje() {
        return new Jugador("Mago");
    }
}