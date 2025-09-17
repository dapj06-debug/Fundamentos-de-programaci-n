/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareasemana13;

/**
 *
 * @author World
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tareasemana13 {


static int MostrarMenu(Scanner sc) {
        System.out.println("\n--- MENU DE COMPRA ---");
        System.out.println("1. Agregar producto");
        System.out.println("2. Pagar");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opcion: ");
        return sc.nextInt();
    }


static void procesarOpcion(List<Double> compras, Scanner sc, int opcion) {
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el precio del producto: ");
                double precio = sc.nextDouble();
                compras.add(precio);
                System.out.println("Producto de $" + precio + " agregado.");
                break;
            case 2:
                if (compras.isEmpty()) {
                    System.out.println("El carrito está vacío. Agregue productos.");
                    return;
                }
                
                double subtotal = compras.stream().mapToDouble(Double::doubleValue).sum();
                double iva = subtotal * 0.15;
                double total = subtotal + iva;

                sc.nextLine(); 
                System.out.print("Ingrese su correo: ");
                String correo = sc.nextLine();

                System.out.println("\n--- INFORME DE COMPRA ---");
                System.out.println("Correo: " + (correo.contains("@") && correo.contains(".") ? correo : "No válido"));
                System.out.println("Total a pagar (incluye IVA): $" + String.format("%.2f", total));
                System.out.println("¡Gracias por su compra!");
                compras.clear();
                break;
            case 3:
                System.out.println("Finalizando. ¡Compra realizada!");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }


    public static void main(String[] args) {
        List<Double> compras = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            opcion = MostrarMenu(sc);
            procesarOpcion(compras, sc, opcion);
        } while (opcion != 3);

        sc.close();
    }
}