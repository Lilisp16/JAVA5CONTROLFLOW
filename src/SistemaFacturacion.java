import java.util.Scanner;

public class SistemaFacturacion {

        public void facturar(Scanner scanner) {



            System.out.println("Ingre el valor total de su compra: ");
            double valorCompra = scanner.nextDouble();

            System.out.println("Cuantos productos desea llevar?: ");
            int cantidadProducto = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Eres miembre de LS?: si/no ");
            String miembroTexto = scanner.nextLine();
            boolean esMiembro = miembroTexto.equalsIgnoreCase("si");


            double totalFinal = valorCompra;

            if (esMiembro) {
                double descuento = 0.10;
                totalFinal = totalFinal - (totalFinal * descuento);
                System.out.println("Valor descuento: $" + (valorCompra * descuento));
            }

            if (cantidadProducto > 10) {
                double descuentoAdiconal = 0.05;
                totalFinal = totalFinal - (totalFinal * descuentoAdiconal);
                System.out.println("Por compras mayor o igual a 10 productos, obtiene un 5% de descuento adicional " +
                        (valorCompra * descuentoAdiconal));
            }

            System.out.println("Total a pagar $: " + totalFinal);


        }
    }


