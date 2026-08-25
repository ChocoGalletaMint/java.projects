public class Main {

    public static void main(String[] args) {

        System.out.println("=== Sistema de Transporte Multimodal ===");

        Automovil auto = new Automovil(
                "Toyota",
                "Corolla",
                2022,
                180.0,
                4,
                false
        );

        System.out.println("\n-- Automovil --");
        System.out.println(auto);

        // Pruebas de validación
        System.out.println("\nPruebas de validación del Automovil:");

        auto.setAnio(1800);
        auto.setNumPuertas(10);

        // Valores válidos
        auto.setAnio(2025);
        auto.setNumPuertas(5);

        System.out.println("\nAutomovil después de corregir los valores:");
        System.out.println(auto);


        // ==========================================
        // CREACIÓN DE AVIÓN
        // ==========================================

        Avion avion = new Avion(
                "Boeing",
                "737",
                2019,
                850.0,
                2,
                12500.0
        );

        System.out.println("\n-- Avion --");
        System.out.println(avion);

        // Pruebas de validación
        System.out.println("\nPruebas de validación del Avion:");

        avion.setAnio(1800);
        avion.setNumMotores(0);
        avion.setAltitudMaxima(-500);

        // Valores válidos
        avion.setAnio(2024);
        avion.setNumMotores(4);
        avion.setAltitudMaxima(15000);

        System.out.println("\nAvion después de corregir los valores:");
        System.out.println(avion);


        // ==========================================
        // CREACIÓN DE BARCO
        // ==========================================

        Barco barco = new Barco(
                "Ferretti",
                "550",
                2020,
                45.0,
                "Fibra de vidrio",
                30.0
        );

        System.out.println("\n-- Barco --");
        System.out.println(barco);

        // Pruebas de validación
        System.out.println("\nPruebas de validación del Barco:");

        barco.setAnio(1700);
        barco.setTonelajeMaximo(-20);

        // Valores válidos
        barco.setAnio(2023);
        barco.setTonelajeMaximo(40);

        System.out.println("\nBarco después de corregir los valores:");
        System.out.println(barco);


        // ==========================================
        // PRUEBA DE VELOCIDAD MÁXIMA
        // ==========================================

        System.out.println("\nPrueba de velocidad máxima:");

        auto.setVelocidadMax(-50);

        // Se establece un valor válido
        auto.setVelocidadMax(200);

        System.out.println(auto);


        // ==========================================
        // MÉTODO DESCRIBIR()
        // ==========================================

        System.out.println("\n=== Método describir() ===");

        auto.describir();
    }
}