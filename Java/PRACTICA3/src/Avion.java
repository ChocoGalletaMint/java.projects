public class Avion extends Vehiculo {

    // Atributos propios
    private int numMotores;
    private double altitudMaxima;

    // Constructor
    public Avion(String marca, String modelo, int anio,
                 double velocidadMax, int numMotores,
                 double altitudMaxima) {

        super(marca, modelo, anio, velocidadMax);

        setNumMotores(numMotores);
        setAltitudMaxima(altitudMaxima);
    }

    // Getter de número de motores
    public int getNumMotores() {
        return numMotores;
    }

    // Getter de altitud máxima
    public double getAltitudMaxima() {
        return altitudMaxima;
    }

    // Setter de número de motores con validación
    public void setNumMotores(int numMotores) {
        if (numMotores > 0) {
            this.numMotores = numMotores;
        } else {
            System.out.println("Error: número de motores no válido.");
        }
    }

    // Setter de altitud máxima con validación
    public void setAltitudMaxima(double altitudMaxima) {
        if (altitudMaxima >= 0) {
            this.altitudMaxima = altitudMaxima;
        } else {
            System.out.println("Error: altitud máxima no válida.");
        }
    }

    // Sobreescritura de toString()
    @Override
    public String toString() {
        return super.toString()
                + " | Motores: " + numMotores
                + " | Altitud Máx: " + altitudMaxima + " m";
    }
}