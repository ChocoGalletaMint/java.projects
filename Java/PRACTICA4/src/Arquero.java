public class Arquero  extends Personaje{

    private int flechasDisponibles;
    private String tipoArco;

    public Arquero(String nombre, int nivel, int puntosVida, int flechasDisponibles, String tipoArco) {

        super(nombre, nivel, puntosVida);

        this.tipoArco = tipoArco;
        
        this.flechasDisponibles = flechasDisponibles;
    }

    public int getFlechasDisponibles() {
        return flechasDisponibles;
    }

    public String getTipoArco() {
        return tipoArco;
    }

     @Override
    public void atacar() {

        super.atacar();

        System.out.println("¡" + getNombre() + " dispara una flecha con su arco " + tipoArco);
    }

    @Override
    public void defender() {

        System.out.println(getNombre() + " se desplaza agilmente esquivando el ataque");
    }

    @Override
    public String toString() {

        return super.toString() + " | Tipo de arco: " + tipoArco + " | Flechas disponibles: " + flechasDisponibles;
    }

}
