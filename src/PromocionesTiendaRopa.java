import java.util.Scanner;

public class PromocionesTiendaRopa {

    public static void comprar(Scanner scanner){

        double precioBase = 0;



        System.out.println("Que prenda desea comprar 👔camisa, 👖pantalón, 🧥chaqueta: ");
        String tipoPrenda = scanner.nextLine();

        System.out.println("Cuantas prendas desea comprar?: ");
        int cantidadComprar = scanner.nextInt();

        scanner.nextLine();


        switch (tipoPrenda.toLowerCase()){
            case "camisa"   -> precioBase = 30000;
            case "pantalon" -> precioBase = 50000;
            case "chaqueta" -> precioBase = 80000;
            default -> {
                System.out.println("Producto agotado ⚠️");
                return;
            }
        }


        double totalAPagar = precioBase * cantidadComprar;

        if (cantidadComprar > 5){
            System.out.println("tienes un 15% de descuento por compras mayores a 5 unidades");
            totalAPagar = totalAPagar - (totalAPagar * 0.15);

        }

        System.out.println("Costo total: " + totalAPagar);

    }
}
