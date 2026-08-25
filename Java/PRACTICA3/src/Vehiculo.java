public class Vehiculo {

    // Atributos privados
    private String marca;
    private String modelo;
    private int anio;

    // Protected: las clases hijas pueden acceder directamente
    protected double velocidadMax;

    // Constructor
    public Vehiculo(String marca, String modelo, int anio, double velocidadMax) {
        this.marca = marca;
        this.modelo = modelo;

        // Usamos los setters para aplicar las validaciones
        setAnio(anio);
        setVelocidadMax(velocidadMax);
    }

    // Getter de marca
    public String getMarca() {
        return marca;
    }

    // Getter de modelo
    public String getModelo() {
        return modelo;
    }

    // Getter de año
    public int getAnio() {
        return anio;
    }

    // Getter de velocidad máxima
    public double getVelocidadMax() {
        return velocidadMax;
    }

    // Setter de año con validación
    public void setAnio(int anio) {
        if (anio >= 1885 && anio <= 2100) {
            this.anio = anio;
        } else {
            System.out.println("Error: año no válido.");
        }
    }

    // Setter de velocidad máxima con validación
    public void setVelocidadMax(double vel) {
        if (vel > 0) {
            this.velocidadMax = vel;
        } else {
            System.out.println("Error: velocidad máxima no válida.");
        }
    }

    // Método describir
    public void describir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Velocidad máxima: " + velocidadMax + " km/h");
    }

    // Sobreescritura de toString()
    @Override
    public String toString() {
        return "Marca: " + marca
                + " | Modelo: " + modelo
                + " | Año: " + anio
                + " | Vel. Máx: " + velocidadMax + " km/h";
    }
}
