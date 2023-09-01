abstract class FabricaEnemigos {
    public abstract Enemigo crearEnemigo();
}
class FabricaEnemigoNormal extends FabricaEnemigos {
    @Override
    public Enemigo crearEnemigo() {
        return new EnemigoNormal("Enemigo Normal");
    }
}
