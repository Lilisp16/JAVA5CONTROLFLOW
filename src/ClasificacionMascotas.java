import java.util.Scanner;

public class ClasificacionMascotas {


    public void clasificar() {


        Scanner scanner = new Scanner(System.in);





        System.out.println("Que tipo de mascota tiene?: ");
        String tipoAnimal = scanner.nextLine();

        System.out.println("Cual es la edad de sus mascota?: ");
        int edadAnimal = scanner.nextInt();


        switch (tipoAnimal.toLowerCase()){
            case "perro" -> System.out.println("Veterinario Canino");
            case "gato" -> System.out.println("Veterinario Felino");
            case "ave" -> System.out.println("Veterinario Animales Exóticos");
            case "otro" -> System.out.println("Veterinario General");
            default -> System.out.println("Tipo de mascota no exite en nuestra base de datos");


        }
        scanner.close();
    }
}
