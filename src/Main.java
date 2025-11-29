import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nSISTEMA DE FACTURACION LS:");

        SistemaFacturacion facturacion = new SistemaFacturacion();

        facturacion.facturar(scanner);


        System.out.println("\n VETERINARIA MIS MASCOTICAS:");

        ClasificacionMascotas mascotas = new ClasificacionMascotas();
        mascotas.clasificar(scanner);

        System.out.println("\n PARQUEADERO FULLSTACK:");
        ControlAccesoParqueadero parqueadero = new ControlAccesoParqueadero();
        parqueadero.parquear(scanner);

        System.out.println("\n TIENDA DE ROPA LS_CASUAL:");
        PromocionesTiendaRopa promociones = new PromocionesTiendaRopa();
        promociones.comprar(scanner);


        scanner.close();

        }
    }
