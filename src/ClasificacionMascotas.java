import java.util.Scanner;

public class ClasificacionMascotas {


    public void clasificar(Scanner scanner) {


        String veterinario;



        System.out.println("Que tipo de mascota tiene?: ");
        String tipoAnimal = scanner.nextLine();

        System.out.println("Cual es la edad de sus mascota?: ");
        int edadAnimal = scanner.nextInt();

        scanner.nextLine();



        switch (tipoAnimal.toLowerCase()){
            case "perro" -> veterinario = "Veterinario Canino";
            case "gato" -> veterinario = "Veterinario Felino";
            case "ave" -> veterinario = "Veterinario Animales Exóticos";
            case "otro" -> veterinario = "Veterinario General";
            default -> veterinario = "Tipo de mascota no exite en nuestra base de datos";

        }

        boolean vacunaAdicional = false;
        if ((tipoAnimal.equals("perro") || tipoAnimal.equals("gato")) && edadAnimal > 5){
            vacunaAdicional = true;

        }

        System.out.println("Veterinario asignado: " + veterinario);

        if (vacunaAdicional){
            System.out.println("Se recomienda una vacuna adicional ");
        }



    }
}
