import java.util.Scanner;

public class ControlAccesoParqueadero {

    public void parquear(Scanner scanner) {

        double costoBase = 0;



        System.out.println("Ingrese su tipo de vehiculo 🚘auto, 🏍️moto, 🚲bicicleta: ");
        String tipoVehiculo = scanner.nextLine();

        System.out.println("Ingrese la hora de llegada (0-23): ");
        int horaLlegada = scanner.nextInt();
        scanner.nextLine();

        switch (tipoVehiculo.toLowerCase()){
            case "auto" -> costoBase = 5000;
            case "moto" -> costoBase = 3000;
            case "bicicleta" -> costoBase = 1000;
            default -> {
                System.out.println("Tipo de vehiculo no existe en nuestra base de datos");
                return;
            }
        }

        // recargo del 20%
        double costoFinal = costoBase;
        if (horaLlegada > 20){
           costoFinal = costoBase + (costoBase * 0.20);

        } System.out.println("Costo total: " + costoFinal);




    }
}
