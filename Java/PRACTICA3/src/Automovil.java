public class Automovil extends Vehiculo {

    // Atributos propios
    private int numPuertas;
    private boolean esElectrico;

    // Constructor
    public Automovil(String marca, String modelo, int anio,
                     double velocidadMax, int numPuertas,
                     boolean esElectrico) {

        super(marca, modelo, anio, velocidadMax);

        setNumPuertas(numPuertas);
        this.esElectrico = esElectrico;
    }

    // Getter de número de puertas
    public int getNumPuertas() {
        return numPuertas;
    }

    // Getter de esElectrico
    public boolean isElectrico() {
        return esElectrico;
    }

    // Setter de número de puertas con validación
    public void setNumPuertas(int n) {
        if (n >= 2 && n <= 6) {
            this.numPuertas = n;
        } else {
            System.out.println("Error: número de puertas no válido.");
        }
    }

    // Setter de esElectrico
    public void setElectrico(boolean esElectrico) {
        this.esElectrico = esElectrico;
    }

    // Sobreescritura de toString()
    @Override
    public String toString() {
        return super.toString()
                + " | Puertas: " + numPuertas
                + " | Eléctrico: " + (esElectrico ? "Sí" : "No");
    }
}