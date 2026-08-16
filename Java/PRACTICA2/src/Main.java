public class Main {

    public static void main(String[] args) {

        System.out.println("=== Clínica Veterinaria ===");

        // Crear perro
        Perro perro = new Perro(
                "Max",
                3,
                12.5,
                "Labrador",
                true
        );

        System.out.println("\n-- Perro --");
        System.out.println(perro);

        perro.comer();
        perro.ladrar();
        perro.buscarPelota();


        // Crear gato
        Gato gato = new Gato(
                "Misi",
                2,
                3.8,
                "Gris",
                true
        );

        System.out.println("\n-- Gato --");
        System.out.println(gato);

        gato.dormir();
        gato.maullar();
        gato.ronronear();


        // Crear canario
        Canario canario = new Canario(
                "Pico",
                1,
                0.03,
                "Amarillo",
                true
        );

        System.out.println("\n-- Canario --");
        System.out.println(canario);

        canario.comer();
        canario.cantar();
        canario.volar();
    }
}
