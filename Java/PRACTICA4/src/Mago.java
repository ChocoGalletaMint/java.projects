public class Mago extends Personaje{

    private int mana;
    private String escuelaMgia;

    public Mago(String nombre, int nivel, int puntosVida, int mana, String escuelaMgia) {

        super(nombre, nivel, puntosVida);

        this.mana = mana;
        
        this.escuelaMgia = escuelaMgia;
    }

    public int getMana() {
        return mana;
    }

    public String getEscuelaMagia() {
        return escuelaMgia;
    }

     @Override
    public void atacar() {

        super.atacar();

        System.out.println("¡" + getNombre() + " lanza un hechizo de " + escuelaMgia + " usando " + mana + " puntos de mana!");
    }

    @Override
    public void defender() {

        System.out.println(getNombre() + " invoca un escudo magico");
    }

    @Override
    public String toString() {
        return super.toString() + " | Mana: " + mana + " | Escuela de magia: " + escuelaMgia;
    }

}
