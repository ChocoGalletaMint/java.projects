public class Barco extends Vehiculo {

    // Atributos propios
    private String tipoCasco;
    private double tonelajeMaximo;

    // Constructor
    public Barco(String marca, String modelo, int anio,
                 double velocidadMax, String tipoCasco,
                 double tonelajeMaximo) {

        super(marca, modelo, anio, velocidadMax);

        this.tipoCasco = tipoCasco;
        setTonelajeMaximo(tonelajeMaximo);
    }

    // Getter de tipo de casco
    public String getTipoCasco() {
        return tipoCasco;
    }

    // Getter de tonelaje máximo
    public double getTonelajeMaximo() {
        return tonelajeMaximo;
    }

    // Setter de tipo de casco
    public void setTipoCasco(String tipoCasco) {
        this.tipoCasco = tipoCasco;
    }

    // Setter de tonelaje máximo con validación
    public void setTonelajeMaximo(double tonelajeMaximo) {
        if (tonelajeMaximo > 0) {
            this.tonelajeMaximo = tonelajeMaximo;
        } else {
            System.out.println("Error: tonelaje máximo no válido.");
        }
    }

    // Sobreescritura de toString()
    @Override
    public String toString() {
        return super.toString()
                + " | Tipo de casco: " + tipoCasco
                + " | Tonelaje Máx: " + tonelajeMaximo + " toneladas";
    }
}
